package com.algorithm.string.fengbin;

public class ReplaceStringUtil {

	/**
	 * 
	 * @param originStr
	 *            原始的待替换的字符串
	 * @param fromStr
	 *            需要被替换的部分的字符串
	 * @param toStr
	 *            被替换为的字符串
	 * @return 替换完成的字符串
	 */
	public static String replaceStr(String originStr, String fromStr,
			String toStr) {
		if (originStr == null || originStr.equals("") || fromStr == null
				|| fromStr.equals("")) {
			return originStr;
		}

		char[] charArrayOrigin = originStr.toCharArray();
		char[] charArrayFrom = fromStr.toCharArray();

		int match = 0;

		for (int i = 0; i < charArrayOrigin.length; i++) {
			// 寻找待匹配的字符串fromStr
			if (charArrayOrigin[i] == charArrayFrom[match++]) {
				if (match == charArrayFrom.length) {
					// 在originStr中找到了一组fromStr，位置为 i - match 到 i 的区间上。
					clearArray(charArrayOrigin, i, charArrayFrom.length);
					match = 0;
				}
			} else {
				// 未找到待匹配的字符串fromStr
				match = 0;
			}
		}

		// 替换已经匹配到的部分的内容
		String resultStr = "";
		String currentStr = "";
		for (int i = 0; i < charArrayOrigin.length; i++) {
			if (charArrayOrigin[i] != 0) {
				currentStr = currentStr + String.valueOf(charArrayOrigin[i]);
			}
			if (charArrayOrigin[i] == 0
					&& (i == 0 || charArrayOrigin[i - 1] != 0)) {
				resultStr = resultStr + currentStr + toStr;
				currentStr = "";
			}
		}

		// 注意这里的逻辑，需要对为匹配到任何字符串的情况做单独的处理
		if (!currentStr.equals("")) {
			resultStr = resultStr + currentStr;
		}

		return resultStr;
	}

	/**
	 * 
	 * @param chas
	 *            待清除的字符数组
	 * @param end
	 *            截止的位置
	 * @param len
	 *            待清除的长度
	 */
	private static void clearArray(char[] chas, int end, int len) {
		while (len-- != 0) {
			chas[end--] = 0;
		}
	}
}
