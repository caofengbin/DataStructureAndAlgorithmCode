package com.algorithm.string.fengbin;

public class ParenthesesString {

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
			
			if (leftBracketsNum != 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	private static boolean isLegalStr(String originStr) {
		String regex1 = "^[()]+";
		return originStr.matches(regex1);
	}

	public static void main(String[] args) {
		System.out.println(judgeParentheses("()())"));
	}
}
