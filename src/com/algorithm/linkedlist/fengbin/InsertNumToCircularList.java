package com.algorithm.linkedlist.fengbin;

/**
 * 向有序的环形链表中插入节点
 * 
 * @author fengbincao
 */
public class InsertNumToCircularList {

	/**
	 * 向有序的环形链表中插入值为num的节点
	 * 
	 * @param headNode
	 *            待插入的环形链表的头节点
	 * @param num
	 *            带插入的值num
	 * @return 新的环形链表的头节点
	 */
	public static LinkedNode insertNum(LinkedNode headNode, int num) {
		if (!isAscentSortedList(headNode)) {
			throw new RuntimeException("给定的环形链表不是升序的");
		}

		LinkedNode insterNode = new LinkedNode(num);

		if (headNode == null) {
			insterNode.next = insterNode;
			return insterNode;
		}

		LinkedNode pointNode = headNode;
		LinkedNode preNode = null;

		if (pointNode != null) {
			pointNode = pointNode.next;
			preNode = headNode;
		}

		while (pointNode != headNode) {
			if (num >= preNode.data && num < pointNode.data) {
				// 待插入的位置
				preNode.next = insterNode;
				insterNode.next = pointNode;
				return headNode;
			} else {
				preNode = pointNode;
				pointNode = pointNode.next;
			}
		}

		// 执行到这个，说明了待插入的节点应该放在环形链表的最后一个位置
		preNode.next = insterNode;
		insterNode.next = pointNode;

		// 注意最后一步的处理过程，这里需要考虑的“换头”的情况，即插入的节点比整个环形链表中的节点值都要小的情况的处理
		return headNode.data < num ? headNode : insterNode;
	}

	/**
	 * 判断指定环形链表是否为升序排列
	 * 
	 * @param headNode
	 *            指定环形链表的头结点
	 * @return true表示有序
	 */
	public static boolean isAscentSortedList(LinkedNode headNode) {
		if (headNode == null || headNode.next == null) {
			return true;
		}

		LinkedNode pointNode = headNode;
		int pointNumber = 0;
		if (pointNode != null) {
			pointNumber = pointNode.data;
			pointNode = pointNode.next;
		}
		while (pointNode != headNode) {
			if (pointNumber <= pointNode.data) {
				pointNumber = pointNode.data;
				pointNode = pointNode.next;
			} else {
				return false;
			}
		}
		return true;
	}

}
