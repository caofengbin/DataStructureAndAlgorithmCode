package com.algorithm.stack.diana;

import java.util.Stack;

/**
 * 问题描述:
 * 
 * 使用递归函数和栈操作，逆序一个栈中的元素
 * 
 * 用例描述: 一个栈依次压入元素1,2,3,4,5 那么从栈顶到栈底的元素，依次为5,4,3,2,1
 * 将这个栈逆序，使从栈顶到栈底的元素依次为1,2,3,4,5 但是要求只能用递归函数来实现，而不能使用其他的数据结构
 * 
 */
public class Problem_20170926_StackReverseRecursively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackReverseRecursively mStackReverse = new StackReverseRecursively();
		Stack<Integer> mStack = new Stack<Integer>();
		for (int i = 0; i < 6; i++) {
			mStack.push(i);
		}
		System.out.println("reverse before--" + mStack.toString());
		mStackReverse.reverse(mStack);
		System.out.println("reverse after--" + mStack.toString());

	}

}
