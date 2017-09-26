package com.algorithm.stack.diana;

import java.util.Stack;

/**
 * 问题描述： 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中的最小元素的操作 要求：
 * 1.pop,push,getMin操作的时间复杂度都是O(1)
 * 
 * 2.设计的栈类型可与使用现成的栈结构
 * 
 * 实现思路： 使用两个栈，一个栈用来保存当前的元素， 一个栈用来保存每一步的最小值，这个栈记为stackMin
 */

public class GetMinStack {
	Stack<Integer> mStack;
	Stack<Integer> mStackMin;

	public GetMinStack() {
		mStack = new Stack<Integer>();
		mStackMin = new Stack<Integer>();
	}

	/**
	 * 入队列操作
	 * 
	 * @param value
	 *            入栈的值
	 * 
	 * */
	public void push(int value) {

		if (mStackMin.isEmpty()) {
			// 当mStackMin为空时，直接入队列，作为最小值
			mStackMin.push(value);
		} else if (value <= getMin()) {
			// 当待入队列的值小于等于mStackMin的最小值时，入队列
			// 注意：一定要把等于加进来，是因为有相同值时，为了后续方便获取最小值出栈
			mStackMin.push(value);
		}
		mStack.push(value);
	}

	/**
	 * 出队列操作
	 * 
	 * 
	 * @return 返回出栈的值
	 * */
	public int pop() {

		if (mStack.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}

		int peek = peek();
		int min = getMin();
		if (min == peek) {
			mStackMin.pop();
		}

		return mStack.pop();
	}

	/**
	 * 获取队列的头部元素操作
	 * 
	 * 
	 * @return 返回队列的头部元素的值
	 * */

	public int peek() {
		if (mStack.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return mStack.peek();
	}

	/**
	 * 获取队列的最小元素操作
	 * 
	 * 
	 * @return 返回队列的头部元素的值
	 * */

	public int getMin() {
		if (mStackMin.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return mStackMin.peek();
	}
}
