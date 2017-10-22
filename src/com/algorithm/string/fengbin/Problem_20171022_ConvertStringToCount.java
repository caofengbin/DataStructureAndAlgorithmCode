package com.algorithm.string.fengbin;
/**
 * 生成字符串的统计字符串
 * 例如：
 * 字符串"aaabbadddffc"的统计字符串为"a_3_b_2_a_1_d_3_f_2_c_1"
 * 
 * 
 * 补充实现:
 * 给定一个字符串的统计字符串cstr，再给定一个整数index，返回cstr所代表的原始字符串上的第index个字符。
 * 例如，“a_1_b_100”所代表的原始字符串上的第0个字符是"a"，第50个字符是'b'。
 * 
 * @author caofengbin
 *
 */
public class Problem_20171022_ConvertStringToCount {

	public static void main(String[] args) {
		// 测试用例1:"aaabbadddffc"
		String originStr1 = "aaabbadddffc";
		String resultStr1 = CountCharInString.countChar(originStr1);
		System.out.println(originStr1 + " 的统计字符串为: " + resultStr1);

		// 测试用例2:"aaabbadddffc"
		String originStr2 = "aaabbff";
		String resultStr2 = CountCharInString.countChar(originStr2);
		System.out.println(originStr2 + " 的统计字符串为: " + resultStr2);
		System.out.println(CountCharInString.charInIndex(resultStr2, 4));
		
		System.out.println(CountCharInString.charInIndex("a_1_b_9", 1));
	}

}
