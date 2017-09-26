package com.algorithm.stack.diana;

import java.util.Stack;

/**
 * 用两个栈实现一个队列，支持队列的基本操作
 * 
 * 队列的特点:先进先出
 * 
 * 栈的特点：后进先出
 * */
public class TwoStackQueue {
	Stack<Integer> mStackPush;
	Stack<Integer> mStackPop;

	public TwoStackQueue() {
		mStackPush = new Stack<Integer>();
		mStackPop = new Stack<Integer>();
	}

	/**
	 * 入队列操作
	 * 
	 * @param value
	 *            入栈的值
	 * 
	 * */
	public void push(int value) {
		mStackPush.push(value);
	}

	/**
	 * 出队列操作
	 * 
	 * 
	 * @return 返回出栈的值
	 * */
	public int pop() {
		// 当两个栈都为空的时候说明是空队列
		if (mStackPop.isEmpty() && mStackPush.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		} else if (mStackPop.isEmpty()) {
			// 当mStackPop为空，而mStackPush不为空的时候，将mStackPush的数据复制到mStackPop
			while (!mStackPush.isEmpty()) {
				mStackPop.push(mStackPush.pop());
			}
		}
		return mStackPop.pop();
	}

	/**
	 * 获取队列的头部元素操作
	 * 
	 * 
	 * @return 返回队列的头部元素的值
	 * */
	public int peek() {
		// 当两个栈都为空的时候说明是空队列
		if (mStackPop.isEmpty() && mStackPush.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		} else if (mStackPop.isEmpty()) {
			// 当mStackPop为空，而mStackPush不为空的时候，将mStackPush的数据复制到mStackPop
			while (!mStackPush.isEmpty()) {
				mStackPop.push(mStackPush.pop());
			}
		}
		return mStackPop.peek();
	}

}
