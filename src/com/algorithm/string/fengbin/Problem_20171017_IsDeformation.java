package com.algorithm.string.fengbin;
/**
 * 问题描述：
 * 给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，那么str1和str2互为变形词。
 * 请实现函数判断两个字符串是否互为变形词。
 * 
 * 
 * 测试用例：
 * (1) str1 = "123",str2 = "231";返回true。
 * (2) str1 = "123",str2 = "2331";返回false。
 * 
 * @author fengbincao
 */
public class Problem_20171017_IsDeformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "329￥";
		if(DeformationStr.isDeformation(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " 互为变形词");
		} else {
			System.out.println(str1 + " and " + str2 + " 不符合要求");
		}
	}

}
