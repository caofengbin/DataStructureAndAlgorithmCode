package com.algorithm.string.fengbin;
/**
 * 找到字符串的最长无重复子串
 * 
 * 给定一个字符串str,返回str的最长无重复子串的长度。
 * 
 * 测试用例:
 * str="abcd"，返回4.
 * str="aabcb"，最长无重复子串为"abc"， 返回3
 * 
 * @author fengbincao
 */
public class Problem_20171026_NoRepeatingStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isLegalStr("+0"));
		System.out.println(isLegalStr("-10"));
		System.out.println(isLegalStr("-0"));
	}

	private static boolean isLegalStr(String originStr) {
		String regex1 = "^[+-]{1}[1-9]{1}[0-9]{0,1}";
		return originStr.matches(regex1);
	}
}
