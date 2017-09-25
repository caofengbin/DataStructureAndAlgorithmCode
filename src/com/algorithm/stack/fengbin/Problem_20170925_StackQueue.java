package com.algorithm.stack.fengbin;
/**
 * 问题描述：
 * 编写一个类，用两个栈实现一个队列，支持队列的基本操作
 * 可以直接使用Java中原生的Stack结构
 * 
 * @author caofengbin
 *
 */


public class Problem_20170925_StackQueue {

	public static void main(String[] args) {
		TwoStackQueue twoStackQueue = new TwoStackQueue();
		twoStackQueue.add(1);
		twoStackQueue.add(8);
		twoStackQueue.add(78);
		twoStackQueue.pop();
		twoStackQueue.pop();
		twoStackQueue.pop();
		System.out.println(twoStackQueue.peek());
	}

}
