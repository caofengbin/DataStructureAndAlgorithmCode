package com.algorithm.linkedlist.fengbin;

import java.util.Stack;

/**
 * 将单链表的每K个节点之间逆序的方法实现 。
 * 两种方法:
 * 一种方法是通过栈结构，时间复杂度为O(N)，额外空间复杂度为O(K)，
 * 一种方法是直接在原地调整，时间复杂度为O(N)，额外空间复杂度为O(1)，
 * 
 * @author fengbincao
 */
public class ConvertEveryKNodesList {

	/**
	 * 第一种方案，通过栈结构实现 。 思路：从左向右对链表进行遍历，如果栈的大小不到K，就不断的往栈中压入新的元素，
	 * 当栈中的元素达到K时，将栈中的元素弹出来，并重新连接即可
	 * 
	 * @param headNode
	 *            待处理的链表的头结点
	 * @param K
	 *            以K值为分组数目进行逆序操作
	 * @return 逆序完成之后的链表头节点
	 */
	public static LinkedNode convertMethod1(LinkedNode headNode, int K) {
		if (K < 2) {
			// 长度为1时，无需逆序操作，直接返回即可
			return headNode;
		}

		Stack<LinkedNode> mStack = new Stack<>();

		LinkedNode newHead = headNode;
		LinkedNode preNode = null;
		LinkedNode curNode = headNode;
		LinkedNode nextNode = null;

		// 对链表进行一次遍历操作
		while (curNode != null) {
			nextNode = curNode.next;
			mStack.push(curNode);

			if (mStack.size() == K) {
				// preNode将会是下一个分组区间的leftNode
				preNode = reverseKNodeByStack(mStack, preNode, nextNode);
				// 对于第一个分组需要重新调整头节点
				newHead = (newHead == headNode ? curNode : newHead);
			}

			curNode = nextNode;
		}
		return newHead;
	}

	/**
	 * 将stack中的元素全部弹出，并放在区间leftNode与rightNode之间
	 * 
	 * @param stack
	 *            待处理元素的栈结构
	 * @param leftNode
	 *            待处理区间的前一个节点
	 * @param rightNode
	 *            待处理区间的后一个节点
	 * @return 逆序完成之后的区间的最后一个节点，也就是下一个分组的leftNode
	 */
	private static LinkedNode reverseKNodeByStack(Stack<LinkedNode> stack,
			LinkedNode leftNode, LinkedNode rightNode) {
		LinkedNode curNode = stack.pop();
		LinkedNode nextNode = null;

		// 需要对第一个K组的元素进行特殊的处理
		if (leftNode != null) {
			leftNode.next = curNode;
		}

		while (!stack.isEmpty()) {
			nextNode = stack.pop();
			curNode.next = nextNode;
			curNode = nextNode;
		}

		curNode.next = rightNode;

		return curNode;
	}

	/**
	 * 第二种方法:不通过额外的数据结构，直接在原有的链表上进行操作。 实现细节相对比较复杂。
	 * 
	 * @param headNode
	 *            待处理的链表的头结点
	 * @param K
	 *            以K值为分组数目进行逆序操作
	 * @return 逆序完成之后的链表头节点
	 */
	public static LinkedNode convertMethod2(LinkedNode headNode, int K) {
		if (K <= 0) {
			throw new RuntimeException("输入的K值不合法");
		}

		// 长度为1时，无需逆序操作，直接返回即可
		if (K < 2) {
			return headNode;
		}

		LinkedNode curNode = headNode;
		LinkedNode startNode = null;
		LinkedNode preNode = null;
		LinkedNode nextNode = null;

		int count = 1;

		while (curNode != null) {
			nextNode = curNode.next;

			if (count == K) {
				// 凑够了一个K分组的元素，需要进行一次逆序操作,curNode即为当前K分组的最后一个元素
				startNode = preNode == null ? headNode : preNode.next;
				// 对第一个K分组的调整存在“换头”问题
				headNode = preNode == null ? curNode : headNode;

				reverseKNode(preNode, startNode, curNode, nextNode);

				// preNode将会是下一个分组的左边界节点的前一个节点
				preNode = startNode;

				count = 0;
			}

			count++;
			curNode = nextNode;
		}
		return headNode;
	}

	/**
	 * 逆序一个K分组中的元素
	 * 
	 * @param leftNode
	 *            分组左边的节点(上一个分组的leftNode)
	 * @param beginNode
	 *            分组的开始位置
	 * @param endNode
	 *            分组的结束位置
	 * @param rightNode
	 *            分组右边的节点(下一个分组的beginNode)
	 * @return
	 */
	private static void reverseKNode(LinkedNode leftNode, LinkedNode beginNode,
			LinkedNode endNode, LinkedNode rightNode) {
		LinkedNode preNode = beginNode;
		LinkedNode curNode = beginNode.next;
		LinkedNode nextNode = null;
		while (curNode != rightNode) {
			nextNode = curNode.next;
			curNode.next = preNode;
			preNode = curNode;
			curNode = nextNode;
		}

		// 对第一个K组的节点需要特殊的判断处理
		if (leftNode != null) {
			leftNode.next = endNode;
		}

		beginNode.next = rightNode;
	}
}
