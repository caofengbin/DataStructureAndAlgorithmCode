package com.algorithm.stack.diana;

import java.util.Stack;

/**
 * 问题描述：
 * 编写一个类，用两个栈实现一个队列，支持队列的基本操作
 * 可以直接使用Java中原生的Stack结构
 * 
 * @author caofengbin
 *
 */

public class Problem_20170925_StackQueue {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackQueue stackQueue = new TwoStackQueue();
		for (int i = 0; i < 10; i++) {
			stackQueue.push(i);
		}
		System.out.println("TwoStackQueue---push--after-" + stackQueue.toString());
		for (int i = 0; i < 3; i++) {
			int value = stackQueue.pop();
			System.out.println("pop-" + value);
		}
		System.out.println("TwoStackQueue---pop--after-"+ stackQueue.toString());
		System.out.println("TwoStackQueue---peek--"+ stackQueue.peek());

	}
}
