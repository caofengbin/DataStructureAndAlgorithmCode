package com.algorithm.stack.fengbin;
/**
 * 问题描述：
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中的最小元素的操作
 * 需要提供的API方法：
 * pop(),push(),peek(),getMin()四个
 * 
 * 要求：
 * 1.pop,push,getMin操作的时间复杂度都是O(1)
 * 2.设计的栈类型可与使用现成的栈结构

 * 
 * @author fengbincao
 */

public class Problem_20170924_GetMinStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(16);
		myStack.push(12);
		myStack.push(8);
		myStack.push(9);
		System.out.println(myStack.getMin());
		System.out.println(myStack.peek());
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		System.out.println(myStack.getMin());
	}
}
