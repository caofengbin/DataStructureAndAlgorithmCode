package com.algorithm.string.fengbin;

public class AddNumbersInStr {

	public static int resolveSums(String originStr) {
		int sum = 0;
		boolean isPositive = true; // 是否为正数
		int waitToAddNum = 0;
		char[] arrayChars = originStr.toCharArray();

		// 遍历字符串中的每一个字符
		for (char tempChar : arrayChars) {
			int cur = tempChar - '0';

			// 处理可能出现的连续的数字字符串
			if (cur >= 0 && cur <= 9) {
				waitToAddNum = waitToAddNum * 10 + cur;
			} else if (cur == -3) {
				// 出现了“-”号
				isPositive = !isPositive;
			} else {
				// 处理其他的非相关字符
				sum += (isPositive ? waitToAddNum : -waitToAddNum);
				// 相加完成后相关的标识符清0
				isPositive = true;
				waitToAddNum = 0;
			}
		}

		// 处理最后连续出现的数字类型
		sum += (isPositive ? waitToAddNum : -waitToAddNum);

		return sum;
	}
}
