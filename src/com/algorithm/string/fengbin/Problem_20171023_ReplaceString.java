package com.algorithm.string.fengbin;
/**
 * 问题描述:
 * 替换字符串中连续出现的指定字符串
 * 
 * 详细描述:
 * 给定三个连续的字符串str,from和to，把str中所有的from字符串全部替换为to字符串，
 * 对于连续出现from的部分要求只替换成一个to字符串，返回最终的结果字符串。
 * 
 * 测试用例:
 * (1) str="123abc",from="abc",to="4567",返回"1234567"
 * (2) str="123",from="abc",to="456",返回"123"
 * (3) str="123abcabc",from="abc",to="X",返回"123X"
 * (4) str="123abcdabc",from="abc",to="X",返回"123XdX"
 * 
 * @author fengbincao
 */
public class Problem_20171023_ReplaceString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 测试用例1
		String originStr1 = "123abc";
		String resultStr1 = ReplaceStringUtil.replaceStr(originStr1, "abc", "4567");
		System.out.println(resultStr1);

		// 测试用例2
		String originStr2 = "123abcdabc";
		String resultStr2 = ReplaceStringUtil.replaceStr(originStr2, "abc", "X");
		System.out.println(resultStr2);
		
		// 测试用例3
		String originStr3 = "123abcabc";
		String resultStr3 = ReplaceStringUtil.replaceStr(originStr3, "abc", "X");
		System.out.println(resultStr3);
		
		// 测试用例4
		String originStr4 = "123";
		String resultStr4 = ReplaceStringUtil.replaceStr(originStr4, "abc", "456");
		System.out.println(resultStr4);
	}

}
