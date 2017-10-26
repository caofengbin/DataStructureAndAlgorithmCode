package com.algorithm.string.fengbin;
/**
 * 问题描述:
 * 给定一个字符串str，判断是不是整体有效的括号字符串。
 * 
 * 测试用例:
 * (1) str="()",返回true。
 * (2) str="(()())",返回true。
 * (3) str="(())",返回true。
 * (4) str="())",返回false。
 * (5) str="()(",返回false。
 * (6) str="()a()",返回false。
 * 
 * @author fengbincao
 */
public class Problem_20171024_ParenthesesString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String originStr1 = "()";
		System.out.println("字符串: " + originStr1 + 
				(ParenthesesString.judgeParentheses(originStr1) ? " 是" : " 不是")
				+ "整体有效的括号字符串");
		System.out.println();
		
		String originStr2 = "(()())";
		System.out.println("字符串: " + originStr2 + 
				(ParenthesesString.judgeParentheses(originStr2) ? " 是" : " 不是")
				+ "整体有效的括号字符串");
		System.out.println();
		
		String originStr3 = "(())";
		System.out.println("字符串: " + originStr3 + 
				(ParenthesesString.judgeParentheses(originStr3) ? " 是" : " 不是")
				+ "整体有效的括号字符串");
		System.out.println();
		
		String originStr4 = "())";
		System.out.println("字符串: " + originStr4 + 
				(ParenthesesString.judgeParentheses(originStr4) ? " 是" : " 不是")
				+ "整体有效的括号字符串");
		System.out.println();
		
		String originStr5 = "()(";
		System.out.println("字符串: " + originStr5 + 
				(ParenthesesString.judgeParentheses(originStr5) ? " 是" : " 不是")
				+ "整体有效的括号字符串");
		System.out.println();
		
		String originStr6 = "()a()";
		System.out.println("字符串: " + originStr6 + 
				(ParenthesesString.judgeParentheses(originStr6) ? " 是" : " 不是")
				+ "整体有效的括号字符串");
		System.out.println();
	}

}
