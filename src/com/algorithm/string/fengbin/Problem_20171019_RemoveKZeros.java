package com.algorithm.string.fengbin;

/**
 * 问题描述: 给定一个字符串str和一个整数k，如果str中正好有连续的k个‘0’字符出现，把k个‘0’字符去除，返回处理后的字符串
 * 
 * 测试用例： 
 * str=‘A00B’，k=2，返回“AB” 
 * str=‘A0000B000’，k=3，返回“A0000B”
 * 
 * @author fengbincao
 */
public class Problem_20171019_RemoveKZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String originStr1 = "A00B";
		String resuleStr1 = RemoveZerosInStr.removeZero(originStr1, 2);
		System.out.println(originStr1 + " 处理结果为: " + resuleStr1);
		
		String originStr2 = "A0000B000";
		String resuleStr2 = RemoveZerosInStr.removeZero(originStr2, 3);
		System.out.println(originStr2 + " 处理结果为: " + resuleStr2);
		
	}
	
}
