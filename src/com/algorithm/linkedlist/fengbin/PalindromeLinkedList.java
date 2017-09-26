package com.algorithm.linkedlist.fengbin;

import java.util.Stack;

/**
 * 判断一个链表是否为回文链表的结构
 * 
 * @author fengbincao
 */
public class PalindromeLinkedList {

	/**
	 * 判断是否为回文型链表的方法1。 实现思路，将整个链表中的数据压栈， 而后再从头对链表进行遍历，并将栈中的元素逐个出栈，判断是否相等
	 * 如果是回文串结构，则遍历一次之后的结果是相等的
	 * 
	 * @param headNode
	 *            待判断的链表的头结点
	 * @return 是否为回文结构
	 */
	public static boolean judgePalindromeList(LinkedNode headNode) {
		Stack<Integer> valueStack = new Stack<>();
		LinkedNode tempLinkedNode = headNode;
		// 将整个链表中的数据入栈
		while (tempLinkedNode != null) {
			valueStack.push(tempLinkedNode.data);
			tempLinkedNode = tempLinkedNode.next;
		}

		// 从头对链表进行遍历，并将栈中的数据逐个的pop出来并比较
		LinkedNode tempLinkedNode2 = headNode;
		while (!valueStack.isEmpty()) {
			if (tempLinkedNode2.data != valueStack.pop()) {
				return false;
			}
			tempLinkedNode2 = tempLinkedNode2.next;
		}

		return true;
	}

	/**
	 * 判断是否为回文型链表的方法2。 实现思路，使用快慢指针，遍历到链表的中部，
	 * 将链表中部的以前的数据入栈，然后从慢指针所在的位置往后遍历，并将原本的栈中数据逐个的向外pop并比较
	 * 思路与上一种方法是相同的，只不过额外的空间复杂度为O(N/2)
	 * 
	 * @param headNode
	 *            待判断的链表的头结点
	 * @return 是否为回文结构
	 */
	public static boolean judgePalindromeList2(LinkedNode headNode) {
		if (headNode == null) {
			return false;
		}
		Stack<Integer> valueStack = new Stack<>();
		// 分别定义两个快慢指针结构，对链表进行遍历操作
		LinkedNode fastNode = headNode;
		LinkedNode slowNode = headNode;
		while (fastNode.next != null && fastNode.next.next != null) {
			valueStack.push(slowNode.data);
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		valueStack.push(slowNode.data);

		// 注意终点位置的判断逻辑
		if (fastNode.next == null) {
			// fastNode.next为null说明整个链表中的长度为奇数。需要将栈顶元素pop出来
			valueStack.pop();
		}
		slowNode = slowNode.next;

		// 开始继续慢指针的遍历操作，并将栈中的元素逐个的pop出来比较
		while (!valueStack.isEmpty()) {
			if (slowNode.data != valueStack.pop()) {
				return false;
			}
			slowNode = slowNode.next;
		}

		return true;
	}
}
