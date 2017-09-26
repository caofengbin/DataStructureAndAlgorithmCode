package com.algorithm.stack.diana;

import java.util.Stack;

/**
 * 问题描述： 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中的最小元素的操作 要求：
 * 1.pop,push,getMin操作的时间复杂度都是O(1) 2.设计的栈类型可与使用现成的栈结构
 * 
 * 实现思路： 使用两个栈，一个栈用来保存当前的元素， 一个栈用来保存每一步的最小值，这个栈记为stackMin
 * 
 * @author fengbincao
 */

public class Problem_20170924_GetMinStack {

	public static void main(String[] args) {
		int[] s = new int[6];
		s[0] = 12;
		s[1] = 32;
		s[2] = 24;
		s[3] = 14;
		s[4] = 8;
		s[5] = 2;

		GetMinStack stack = new GetMinStack();

		for (int i = 0; i < 6; i++) {
			stack.push(s[i]);
		}

		System.out.println(stack.getMin());
		System.out.println(stack.peek());

		stack.pop();
		System.out.println(stack.getMin());

	}
}
