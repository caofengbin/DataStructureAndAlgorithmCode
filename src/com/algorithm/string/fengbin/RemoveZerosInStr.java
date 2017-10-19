package com.algorithm.string.fengbin;

public class RemoveZerosInStr {

	/**
	 * 删除字符串中可能出现的连续K个0在一起的
	 * 
	 * @param originString
	 *            待处理的字符串
	 * @param K
	 *            0的个数
	 * @return 处理完成的字符串
	 */
	public static String removeZero(String originString, int K) {
		char[] arrayChars = originString.toCharArray();

		// 分别统计0所开始的位置，以及连续的0的个数
		int beginPosition = -1;
		int totalNum = 0;

		for (int i = 0; i < arrayChars.length; i++) {
			char tempChar = arrayChars[i];

			// 遇到了'0'字符
			if (tempChar == '0') {
				beginPosition = (beginPosition == -1 ? i : beginPosition);
				totalNum++;
			} else {
				if (totalNum == K) {
					// 需要清除连续的K个0
					while (totalNum-- > 0) {
						arrayChars[beginPosition++] = 0;
					}
				}

				totalNum = 0;
				beginPosition = -1;
			}

			// 处理尾部为连续K个0的情况
			if (totalNum == K) {
				// 需要清除连续的K个0
				while (totalNum-- > 0) {
					arrayChars[beginPosition++] = 0;
				}
			}
		}

		return String.valueOf(arrayChars);
	}
}
