package com.algorithm.string.fengbin;

public class ParenthesesString {

	/**
	 * 给定一个字符串str，判断是不是整体有效的括号字符串
	 * 
	 * @param originStr
	 *            待判断的字符串
	 * @return true表示符合条件
	 */
	public static boolean judgeParentheses(String originStr) {
		if (isLegalStr(originStr)) {
			char[] charArrays = originStr.toCharArray();
			int leftBracketsNum = 0;
			for (int i = 0; i < charArrays.length; i++) {
				if (charArrays[i] == '(') {
					// 判定为左括号
					leftBracketsNum++;
				} else if (charArrays[i] == ')') {
					// 判定为右括号
					leftBracketsNum--;
					if (leftBracketsNum < 0) {
						return false;
					}
				}

			}

			// 全部扫描匹配完成，判断数量是否相等
			if (leftBracketsNum != 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * 通过正则限定只允许传入指定的字符串
	 */
	private static boolean isLegalStr(String originStr) {
		String regex1 = "^[()]+";
		return originStr.matches(regex1);
	}

}
