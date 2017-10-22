package com.algorithm.string.fengbin;

/**
 * 判断两个字符串是否互为旋转词
 * 
 * @author caofengbin
 * 
 */
public class RotationWord {

	/**
	 * 判断两个单词是否互为旋转词
	 * 
	 * @param str1
	 *            待旋转的String1
	 * @param str2
	 *            待旋转的String2
	 * @return true表示是旋转词
	 */
	public static boolean isRotationWord(String str1, String str2) {
		// 先判断长度是否一致
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}

		String doubleString = str1 + str1;

		// 如果互为旋转字符串，那么str2一定是doubleString的子集
		// 需要使用"KMP算法"来进行判断
		if (KMPAlgorithm.getIndexOf(doubleString, str2) != -1) {
			return true;
		} else {
			return false;
		}
	}

}
