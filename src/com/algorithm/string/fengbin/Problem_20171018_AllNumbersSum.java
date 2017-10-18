package com.algorithm.string.fengbin;
/**
 * 问题描述:字符串中数字子串的求和
 * 
 * 详细描述:
 * 给定一个字符串str，求其中全部数字子串所代表的数字之和
 * 要求:
 * (1)忽略小数点字符，例如“A1.3”，其中包含两个数字1和3
 * (2)如果紧贴数字子串的左侧出现字符“-”，当连续出现的数量为奇数的时候，数字视为负数，
 * 当连续出现的次数为偶数的时候，数字视为正数，例如“A-1BC--12”，其中包含数字-1和12。
 * 
 * 测试用例:
 * str="A1CD2E33"，返回36.
 * str="A-1B--2C--D6E"，返回7
 * @author fengbincao
 */
public class Problem_20171018_AllNumbersSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "--AD-123i3";
		int num1 = AddNumbersInStr.resolveSums(str1);
		System.out.println(str1 + " 结果为: " + num1);
		
		String str2 = "A1CD2E33";
		int num2 = AddNumbersInStr.resolveSums(str2);
		System.out.println(str2 + " 结果为: " + num2);
		
		String str3 = "A-1B--2C--D6E";
		int num3 = AddNumbersInStr.resolveSums(str3);
		System.out.println(str3 + " 结果为: " + num3);
	}

}
