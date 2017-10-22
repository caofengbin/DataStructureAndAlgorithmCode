package com.algorithm.string.fengbin;

/**
 * KMP算法的核心实现部分,在字符串相关的算法中非常的重要
 * 
 * @author fengbincao
 */
public class KMPAlgorithm {

	/**
	 * KMP算法的主函数
	 * 
	 * @param originStr
	 *            原始字符串
	 * @param matchStr
	 *            待匹配的字符串
	 * @return 待匹配的字符串matchStr在originStr的位置，如果不匹配，则返回-1
	 */
	public static int getIndexOf(String originStr, String matchStr) {
		if (originStr == null || matchStr == null || matchStr.length() < 1
				|| originStr.length() < matchStr.length()) {
			return -1;
		}
		char[] ss = originStr.toCharArray();
		char[] ms = matchStr.toCharArray();
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);
		while (si < ss.length && mi < ms.length) {
			if (ss[si] == ms[mi]) {
				si++;
				mi++;
			} else if (next[mi] == -1) {
				si++;
			} else {
				mi = next[mi];
			}
		}
		return mi == ms.length ? si - mi : -1;
	}

	public static int[] getNextArray(char[] ms) {
		if (ms.length == 1) {
			return new int[] { -1 };
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (ms[pos - 1] == ms[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next;
	}
}
