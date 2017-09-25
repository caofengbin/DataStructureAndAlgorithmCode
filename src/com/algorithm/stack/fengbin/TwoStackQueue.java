package com.algorithm.stack.fengbin;

import java.util.Stack;

/**
 * 实现思路
 * 栈的特点是后进先出，而队列的特点是先进先出
 * 这样，用两个栈进行结合，就可以把顺序反过来实现队列的操作
 * 
 * 注意事项：
 * 1.stackPush往stackPop中压入数据时，必须一次性的把stakcPush中的数据全部压入
 * 2.如果stackPop不为空,stackPush绝对不能向stackPop中压入数据
 * 
 * @author caofengbin
 *
 */
public class TwoStackQueue {
	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;

	public TwoStackQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}
	
	/**
	 * 入队列的操作，直接往push栈中压入数据即可
	 * @param newNumber		待入队列的数据
	 */
	public void add(int newNumber) {
		this.stackPush.add(newNumber);
	}
	
	/**
	 * 出队列的操作，让队列的头部元素出队列
	 * @return		队列的头部元素
	 */
	public int pop() {
		if(this.stackPop.empty() && this.stackPush.empty()) {
			throw new RuntimeException("The queue is empty!!");
		} else if(this.stackPop.empty()) {
			// pop栈为空，但是push栈不为空，需要将stackPush中的数据一次性的全部压入到stackPop中
			while(!this.stackPush.empty()) {
				this.stackPop.push(this.stackPush.pop());
			}
		}
		
		// 返回pop栈中的栈顶元素，即为队列的首部元素
		return this.stackPop.pop();
	}
	
	/**
	 * 获取队列的头部元素，但是不出队列
	 * @return  队列的头部元素
	 */
	public int peek() {
		if(this.stackPop.empty() && this.stackPush.empty()) {
			throw new RuntimeException("The queue is empty!!");
		} else if(this.stackPop.empty()) {
			// pop栈为空，但是push栈不为空，需要将stackPush中的数据一次性的全部压入到stackPop中
			while(!this.stackPush.empty()) {
				this.stackPop.push(this.stackPush.pop());
			}
		}
		
		// 返回pop栈中的栈顶元素，即为队列的首部元素
		return this.stackPop.peek();
	}
}
