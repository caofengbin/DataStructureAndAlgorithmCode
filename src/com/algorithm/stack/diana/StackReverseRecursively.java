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
public class StackReverseRecursively {

	/**
	 * 使用递归，获取栈底元素并移除栈底元素
	 * 
	 * @param stack
	 *            需要操作的栈
	 * 
	 * @return 栈底元素
	 * */
	public int getLastStackElements(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		int value = stack.pop();
		//System.out.println("stack pop----" + stack.toString());
		if (stack.isEmpty()) {
			System.out.println("empty");
			return value;
		} else {
			int last = getLastStackElements(stack);
			//System.out.println("last----" + last);
			stack.push(value);
			//System.out.println("getLastStackElements ----" + stack.toString());
			return last;
		}
	}

	/**
	 * 使用递归，逆序排列
	 * 
	 * @param stack
	 *            需要操作的栈
	 * 
	 * 
	 * */
	public void reverse(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			return;
		}
		System.out.println("reverse once begin-" + stack.toString());
		int data = getLastStackElements(stack);
		System.out.println("reverse data-" + data);
		reverse(stack);
		System.out.println("reverse once end-" + stack.toString());
		stack.push(data);
		System.out.println("reverse once end push-" + stack.toString());

	}

}
