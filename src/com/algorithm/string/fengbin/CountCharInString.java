package com.algorithm.string.fengbin;

/**
 * 统计字符串中的字符出现的次数
 * 
 * @author fengbincao
 */
public class CountCharInString {

	/**
	 * 基本要求，对一个字符串进行统计词频并拼接到结果集中
	 * 
	 * @param originString
	 *            原始字符串
	 * @return 结果字符串
	 */
	public static String countChar(String originString) {
		String resultStr = "";

		if (originString == null || originString.equals("")) {
			return resultStr;
		}

		char[] charArray = originString.toCharArray();

		int num = 1;

		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == charArray[i - 1]) {
				num++;
			} else {
				// 生成一次统计字符串
				resultStr = connectionStr(resultStr, num,
						String.valueOf(charArray[i - 1]), true);
				num = 1;
			}
		}
		// 注意对最后的一个统计元素的连接处理即可
		return connectionStr(resultStr, num,
				String.valueOf(charArray[charArray.length - 1]), false);
	}

	/**
	 * 给定一个字符串的统计字符串cstr，再给定一个整数index，返回cstr所代表的原始字符串上的第index个字符
	 * 
	 * @param resultStr
	 *            已经拼接好的结果串
	 * @param index
	 *            特定的位置
	 * @return 特定位置的字符
	 */
	public static char charInIndex(String resultStr, int index) {
		
		int length = resultStr.length();
		if (!(length % 4 == 3)) {
			System.out.println("结果字符串:" + resultStr + "不符合特定的格式要求");
			return '!';
		}

		char[] charArray = resultStr.toCharArray();
		int groupNumber = (length + 1) / 4;
		String originStr = "";

		for (int i = 0; i < groupNumber; i++) {
			char tempChar = charArray[i * 4];
			int repeatNumber = Integer.valueOf(charArray[i * 4 + 2] - '0');
			originStr = connectionStr(originStr, repeatNumber,
					String.valueOf(tempChar));
		}

		char[] charArray2 = originStr.toCharArray();
		if (index >= charArray2.length) {
			System.out.println("index数值不合法");
			return '!';
		}
		return charArray2[index];
	}

	private static String connectionStr(String resuleStr, int number,
			String charStr) {
		StringBuffer strBuffer = new StringBuffer(resuleStr);
		for (int i = 1; i <= number; i++) {
			strBuffer.append(charStr);
		}
		return strBuffer.toString();
	}

	/**
	 * 拼接单个字符的统计数量的方法(这个实现不是太好)
	 * 
	 * @param resuleStr
	 *            待拼接的结果字符串
	 * @param number
	 *            当前字符的词频
	 * @param charStr
	 *            当前字符
	 * @param addLast
	 *            是否拼接最后的一个"_"符号
	 * @return 拼接完成后的字符串
	 */
	private static String connectionStr(String resuleStr, int number,
			String charStr, boolean addLast) {
		if (addLast) {
			return resuleStr + charStr + "_" + number + "_";
		} else {
			return resuleStr + charStr + "_" + number;
		}

	}
}
