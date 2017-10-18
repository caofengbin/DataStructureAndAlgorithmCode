package com.algorithm.string.fengbin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class Separator {

	private String mOriginFileName = null; // 原文件名
	private long mOriginFileSize = 0; // 原文件的大小
	private long mBlockNum = 0; // 可分的块数

	public Separator() {
	}

	/**
	 * 
	 * @param fileAndPath
	 *            原文件名及路径
	 */
	private void getFileAttribute(String fileAndPath) {
		File file = new File(fileAndPath);
		mOriginFileName = file.getName();
		mOriginFileSize = file.length();
		System.out.println("原始文件名称为：" + mOriginFileName);
		System.out.println("原始文件大小为：" + mOriginFileSize);
	}

	/**
	 * 
	 * @param blockSize
	 *            每一块的大小
	 * @return 能够分得的块数
	 */
	private long getBlockNum(long blockSize) {

		long fileSize = mOriginFileSize;
		if (fileSize <= blockSize)// 如果文件的大小只够分一个块
			return 1;
		else {
			if (fileSize % blockSize > 0) {
				return fileSize / blockSize + 1;
			} else
				return fileSize / blockSize;
		}
	}

	/**
	 * 
	 * @param fileAndPath
	 *            原文件及完整路径
	 * @param currentBlock
	 *            当前块的序号
	 * @return 现在拆分后块的文件名
	 */
	private String generateSeparatorFileName(String fileAndPath,
			int currentBlock) {
		// 生成折分后的文件名，以便于将来合将
		return fileAndPath + ".part" + currentBlock;
	}

	/**
	 * 
	 * @param fileAndPath
	 *            原文件及完整路径
	 * @param fileSeparateName
	 *            文件分隔后要生成的文件名，与原文件在同一个目录下
	 * @param blockSize
	 *            当前块要写的字节数
	 * @param beginPos
	 *            从原文件的什么地方开始读取
	 * @return true为写入成功，false为写入失败
	 */
	private boolean writeFile(String fileAndPath, String fileSeparateName,
			long blockSize, long beginPos) {
		RandomAccessFile raf = null;
		FileOutputStream fos = null;
		byte[] bt = new byte[1024];
		long writeByte = 0;
		int len = 0;
		try {
			raf = new RandomAccessFile(fileAndPath, "r");
			raf.seek(beginPos);
			fos = new FileOutputStream(fileSeparateName);
			while ((len = raf.read(bt)) > 0) {
				if (writeByte < blockSize) {
					// 如果当前块还没有写满
					writeByte = writeByte + len;
					if (writeByte <= blockSize)
						fos.write(bt, 0, len);
					else {
						len = len - (int) (writeByte - blockSize);
						fos.write(bt, 0, len);
					}
				}
			}
			fos.close();
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (fos != null)
					fos.close();
				if (raf != null)
					raf.close();
			} catch (Exception f) {
				f.printStackTrace();
			}
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param fileAndPath
	 *            原文路径及文件名
	 * @param blockSize
	 *            要拆分的每一块的大小
	 * @return true为拆分成功，false为拆分失败
	 */
	private boolean separatorFile(String fileAndPath, long blockSize) {
		getFileAttribute(fileAndPath);// 将文件的名及大小属性取出来
		mBlockNum = getBlockNum(blockSize);// 取得分块总数
		if (mBlockNum == 1) {
			// 如果只能够分一块，就一次性写入
			blockSize = mOriginFileSize;
		}

		long writeSize = 0;// 每次写入的字节
		long writeTotal = 0;// 已经写了的字节
		String FileCurrentNameAndPath = null;
		for (int i = 1; i <= mBlockNum; i++) {
			if (i < mBlockNum) {
				// 取得每一次要写入的文件大小
				writeSize = blockSize;
			}

			else {
				writeSize = mOriginFileSize - writeTotal;
			}
			if (mBlockNum == 1) {
				FileCurrentNameAndPath = fileAndPath + ".bak";
			} else {
				FileCurrentNameAndPath = generateSeparatorFileName(fileAndPath,
						i);
			}
			if (!writeFile(fileAndPath, FileCurrentNameAndPath, writeSize,
					writeTotal)) {
				// 循环往硬盘写文件
				return false;
			}
			writeTotal = writeTotal + writeSize;
		}
		return true;
	}

	public static void main(String[] args) {
		Separator separator = new Separator();
		String fileAndPath = "C://Users/Administrator/Desktop/fileToPushOrPull/fileseperator/fileToPushOrPull.rar";// 文件名及路径
		long blockSize = 1024 * 1024;// 每一个文件块的大小，大小是按字节计算
		if (separator.separatorFile(fileAndPath, blockSize)) {
			System.out.println("文件折分成功!");
		} else {
			System.out.println("文件折分失败!");
		}
	}
}
