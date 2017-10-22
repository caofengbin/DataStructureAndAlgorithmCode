package com.algorithm.string.fengbin;

/**
 * 将字符串转化为int类型数据的工具类方法. 在32位的整形数据中，int变量的值的范围为: 负的2的31次方 <= value < 正的2的31次方
 * -2147483648 <= value <= 2147483647
 * 
 * @author fengbincao
 */
public class StringToIntUtil {

	public static int stringToInteger(String originStr) {
		if (originStr == null || originStr.equals("")) {
			// 不能转化为整型的数据
			return 0;
		}

		// 非法的字符串直接转化为0
		if (!isLegalStr(originStr)) {
			return 0;
		}

		char[] charArrays = originStr.toCharArray();

		// 判断正负号
		boolean isPositive = charArrays[0] == '-' ? false : true;

		/**
		 * 因为负数比正数的范围大1，所以计算“统一用负数来处理”，最后再根据正负号来转化成结果值。
		 */
		int minq = Integer.MIN_VALUE / 10;
		int minr = Integer.MIN_VALUE % 10;

		int result = 0;
		int current = 0;

		for (int i = isPositive ? 0 : 1; i < charArrays.length; i++) {
			// 因为负数比正数的范围大1，所以计算是统一用负数来处理，最后再根据正负号来转化成结果值
			// 这里是判断是否出现数据溢出的核心代码部分。
			// (1) result < minq，在没有加上当前的数据之前，发现已经出现了result <
			// minq，那么加上current之后一定会溢出(*10就会溢出)
			// (2) result == minq，但是current < minr，那么执行result = result * 10 +
			// current;也是会溢出的(+current就会溢出)
			current = '0' - charArrays[i];
			if ((result < minq) || (result == minq && current < minr)) {
				System.out.println(originStr + "溢出");
				return 0;
			}
			result = result * 10 + current;
		}

		if (isPositive && result == Integer.MIN_VALUE) {
			System.out.println(originStr + "溢出");
			return 0;
		}
		return isPositive ? -result : result;
	}

	/**
	 * 判定给定的字符串Str是否为合法的
	 * 
	 * @param originStr
	 *            待判定的字符串
	 * @return true表示待判定的字符串为合法的字符串
	 */
	private static boolean isLegalStr(String originStr) {
		// 限定为字符集合为“-”和普通的数字类型组成，且可以以“-”作为开头
		String regex1 = "^[-]?[0-9]+";
		if (originStr.matches(regex1)) {

			// 判断是否以多个0来作为数字的开头部分
			String regex2 = "^[-]?[0]+[0-9]+";
			if (originStr.matches(regex2)) {
				return false;
			}

			return true;
		} else {
			return false;
		}

	}
}
