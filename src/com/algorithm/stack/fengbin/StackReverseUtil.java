package com.algorithm.stack.fengbin;

import java.util.Stack;

/**
 * 通过递归方法，使一个栈中的元素进行逆序的工具类
 * 
 * @author fengbincao
 */
public class StackReverseUtil {
	
	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int i = getAndRemoveLastElement(stack);
		System.out.println(i);
		reverse(stack);
		stack.push(i);
	}

	/**
	 * 获得栈底元素的方法
	 * @param stack
	 * @return
	 */
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	

	/**
	 * 使一个栈中的元素进行逆序的方法
	 * 一个错误的示例代码
	 * 
	 * @param stack		待逆序的栈
	 */
	public static void reverseStackWrong(Stack<Integer> stack) {
		if(stack.empty()) {
			return;
		} else {
			int tempItem = stack.pop();
			reverseStackWrong(stack);
			stack.push(tempItem);
		}
	}
}
