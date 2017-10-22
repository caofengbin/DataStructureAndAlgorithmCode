package com.algorithm.string.fengbin;
/**
 * 问题描述：
 * 给定一个字符串str，如果str符合日常书写的整数形式，并且属于32位整数的范围，
 * 返回str所代表的整数值，否则返回0.
 * 
 * str="123",返回123.
 * str="023"，不符合日常的书写习惯，所以返回0
 * str="A13",返回0
 * str="0",返回0
 * str="214783647",返回214783647
 * str="214783648",因为溢出了，所以返回0
 * str="-123"，返回-123
 * 
 * @author caofengbin
 *
 */
public class Problem_20171021_StringToInt {

	public static void main(String[] args) {
		String originStr1 = "123";
		int result1 = StringToIntUtil.stringToInteger(originStr1);
		System.out.println(originStr1 + " 转化后的结果为: " + result1);
		System.out.println();
		
		String originStr2 = "023";
		int result2 = StringToIntUtil.stringToInteger(originStr2);
		System.out.println(originStr2 + " 转化后的结果为: " + result2);
		System.out.println();
		
		String originStr3 = "A13";
		int result3 = StringToIntUtil.stringToInteger(originStr3);
		System.out.println(originStr3 + " 转化后的结果为: " + result3);
		System.out.println();
		
		String originStr4 = "0";
		int result4 = StringToIntUtil.stringToInteger(originStr4);
		System.out.println(originStr4 + " 转化后的结果为: " + result4);
		System.out.println();
		
		String originStr5 = "-123";
		int result5 = StringToIntUtil.stringToInteger(originStr5);
		System.out.println(originStr5 + " 转化后的结果为: " + result5);
		System.out.println();
		
		String originStr6 = "2147483647";
		int result6 = StringToIntUtil.stringToInteger(originStr6);
		System.out.println(originStr6 + " 转化后的结果为: " + result6);
		System.out.println();
		
		String originStr7 = "-2147483648";
		int result7 = StringToIntUtil.stringToInteger(originStr7);
		System.out.println(result7 + " 转化后的结果为: " + result7);
		System.out.println();
		
		String originStr8 = "-2147483649";
		int result8 = StringToIntUtil.stringToInteger(originStr8);
		System.out.println(originStr8 + " 转化后的结果为: " + result8);
		System.out.println();
		
		String originStr9 = "2147483648";
		int result9 = StringToIntUtil.stringToInteger(originStr9);
		System.out.println(result9 + " 转化后的结果为: " + result9);
		System.out.println();
	}

}
