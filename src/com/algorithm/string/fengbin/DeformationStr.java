package com.algorithm.string.fengbin;

/**
 * 判断两个字符串是否互为变形词的主方法
 * 
 * @author fengbincao
 */
public class DeformationStr {

	public static boolean isDeformation(String str1, String str2) {

		if (isLegalStr(str1) && isLegalStr(str2)) {
			// 如果长度不相等则一定不是
			if (str1.length() != str2.length()) {
				return false;
			}

			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			int[] arrayValue = new int[256];
			for (char tempChar : charArray1) {
				int index = (int) tempChar;
				arrayValue[index]++;
			}

			for (char tempChar : charArray2) {
				int index = (int) tempChar;
				arrayValue[index]--;

				if (arrayValue[index] < 0) {
					return false;
				}
			}

			return true;
		} else {
			System.out.println("输入的两个字符串中只能包含数字和大小写字母");
			return false;
		}

	}

	/**
	 * 这里处理字符串的数据，只能为大小写的字符，或者数字
	 */
	private static boolean isLegalStr(String str) {
		String regex = "^[0-9A-Za-z]+";
		return str.matches(regex);
	}

}
