package com.algorithm.stack.fengbin;

import java.util.Stack;

/**
 * 实现思路1：
 * 使用两个栈，一个栈用来保存当前的元素，
 * 一个栈用来保存每一步的最小值，这个栈记为stackMin
 * 
 * @author fengbincao
 */
public class MyStack {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack() {
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	
	public void push(int newNumber) {
		if (stackMin.isEmpty()) {
			// stackMin为空，直接将新元素视为最小值入栈即可
			this.stackMin.push(newNumber);
		} else if (newNumber <= this.getMin()) {
			// stackMin不为空，需要和栈顶的元素进行比较，
			this.stackMin.push(newNumber);
		}
		// 数据栈入新元素
		this.stackData.push(newNumber);
	}
	
	public void pop() {
		if (stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty");
		}
		int temp = stackData.pop();
		if (temp == getMin()) {
			this.stackMin.pop();
		}
	}
	
	public int getMin() {
		if (stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty");
		}
		return this.stackMin.peek();
	}
}
