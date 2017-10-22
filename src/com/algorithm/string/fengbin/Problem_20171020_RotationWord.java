package com.algorithm.string.fengbin;
/**
 * 问题描述：
 * 判断两个字符串是否互为旋转词。
 * 
 * 详细描述：
 * 如果一个字符串str，把字符串str前面任意的部分挪到后面形成的字符串叫str的旋转词。
 * 比如，str=“12345”,str的旋转词有“23451”，“34512”，“45123”，“51234”。
 * 给定两个字符串a和b，请判断两个字符串a和b是否互为旋转词。
 * 
 * a="cdab",b="abcd",返回true。
 * a="1ab2",b="ab12",返回false。
 * a="2ab1",b="ab12",返回true。
 * 
 * @author caofengbin
 *
 */
public class Problem_20171020_RotationWord {

	public static void main(String[] args) {
		// 测试用例1
		String originStr1 = "cdab";
		String matchStr1 = "abcd";
		if (RotationWord.isRotationWord(originStr1, matchStr1)) {
			System.out.println(originStr1 + " 与  " + matchStr1 + " 互为旋转词");
		} else {
			System.out.println(originStr1 + " 与 " + matchStr1 + " 不是旋转词的关系");
		}

		// 测试用例2
		String originStr2 = "1ab2";
		String matchStr2 = "ab12";
		if (RotationWord.isRotationWord(originStr2, matchStr2)) {
			System.out.println(originStr2 + " 与  " + matchStr2 + " 互为旋转词");
		} else {
			System.out.println(originStr2 + " 与 " + matchStr2 + " 不是旋转词的关系");
		}
		
		// 测试用例3
		String originStr3 = "2ab1";
		String matchStr3 = "ab12";
		if (RotationWord.isRotationWord(originStr3, matchStr3)) {
			System.out.println(originStr3 + " 与  " + matchStr3 + " 互为旋转词");
		} else {
			System.out.println(originStr3 + " 与 " + matchStr3 + " 不是旋转词的关系");
		}
	}

}
