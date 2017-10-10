package com.algorithm.linkedlist.fengbin;

import java.util.Stack;

public class AddTwoLinkedLists {

	/**
	 * 实现方法1: 用两个栈，分别保存链表中的元素，然后依次弹出，模拟一个简单的加法器的实现即可以
	 * 
	 * @param head1
	 *            待操作的链表头结点1
	 * @param head2
	 *            待操作的链表头结点2
	 * @return 结果链表的头节点
	 */
	public static LinkedNode addListMethod1(LinkedNode head1, LinkedNode head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}

		Stack<Integer> valueStack1 = new Stack<>();
		Stack<Integer> valueStack2 = new Stack<>();

		// 链表1中的值全部入栈
		LinkedNode curNode = head1;
		while (curNode != null) {
			valueStack1.push(curNode.data);
			curNode = curNode.next;
		}

		// 链表2中的值全部入栈
		curNode = head2;
		while (curNode != null) {
			valueStack2.push(curNode.data);
			curNode = curNode.next;
		}

		LinkedNode newHead = null;

		// carry表示进位的值
		int carry = 0;
		int nodeValue = 0;

		// 模拟一个简单的“加法器”的操作
		while (!valueStack1.isEmpty() || !valueStack2.isEmpty()) {
			int num1 = valueStack1.isEmpty() ? 0 : valueStack1.peek();
			int num2 = valueStack2.isEmpty() ? 0 : valueStack2.peek();
			int sum = num1 + num2 + carry;
			carry = sum / 10;
			nodeValue = sum % 10;

			LinkedNode valueNode = new LinkedNode(nodeValue);
			valueNode.next = newHead;
			newHead = valueNode;
			
			if (!valueStack1.isEmpty()) {
				valueStack1.pop();
			}
			if (!valueStack2.isEmpty()) {
				valueStack2.pop();
			}
		}
		
		// 最后再判断一下进位值是否为非0.如果为非0，则还需要重新加上一个节点
		if (carry != 0) {
			LinkedNode valueNode = new LinkedNode(carry);
			valueNode.next = newHead;
			newHead = valueNode;
		}
		
		return newHead;
	}
}
