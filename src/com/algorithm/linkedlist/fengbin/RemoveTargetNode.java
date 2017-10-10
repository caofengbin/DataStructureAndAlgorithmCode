package com.algorithm.linkedlist.fengbin;

import java.util.Stack;

/**
 * 删除单链表中指定的值的节点
 * 
 * @author fengbincao
 */
public class RemoveTargetNode {

	/**
	 * 删除方法1:通过一个额外的栈结构，将链表中值为非num的元素压栈，而后通过"头插法"的方式重新建立一个链表即可。
	 * 
	 * @param headNode
	 *            待处理的链表的头结点
	 * @param num
	 *            待删除的元素的值num
	 * @return 处理完成之后的链表头结点
	 */
	public static LinkedNode removeMethod1(LinkedNode headNode, int num) {
		Stack<LinkedNode> mStack = new Stack<>();
		LinkedNode curNode = headNode;

		while (curNode != null) {
			if (curNode.data != num) {
				mStack.push(curNode);
			}
			curNode = curNode.next;
		}

		if (!mStack.isEmpty()) {
			headNode = mStack.pop();
			// 通过“头插法”的方式重新建立链表结构
			while (!mStack.isEmpty()) {
				mStack.peek().next = headNode;
				headNode = mStack.pop();
			}

			return headNode;
		} else {
			// 链表中的元素全部被删除，需要进行特殊的处理操作
			return null;
		}

	}

	/**
	 * 删除方法2:不需要额外的栈结构，直接通过原有的链表结构进行调整即可。需要
	 * 
	 * @param headNode
	 *            待处理的链表的头结点
	 * @param num
	 *            待删除的元素的值num
	 * @return 处理完成之后的链表头结点
	 */
	public static LinkedNode removeMethod2(LinkedNode headNode, int num) {
		// 首先需要找到第一个非num的节点，作为头结点
		while (headNode != null && headNode.data == num) {
			headNode = headNode.next;
		}

		// 进行顺序遍历即可
		LinkedNode preNode = headNode;
		LinkedNode curNode = headNode;
		while (curNode != null) {
			if (curNode.data == num) {
				// 需要删除当前的节点
				preNode.next = curNode.next;
			} else {
				preNode = curNode;
			}

			curNode = curNode.next;
		}
		return headNode;
	}
}
