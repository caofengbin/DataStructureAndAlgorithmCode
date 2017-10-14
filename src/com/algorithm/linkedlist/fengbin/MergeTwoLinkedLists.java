package com.algorithm.linkedlist.fengbin;

public class MergeTwoLinkedLists {

	/**
	 * 合并两个有序链表的主方法
	 * 
	 * @param headNode1
	 *            待合并的有序链表1的头部
	 * @param headNode2
	 *            待合并的有序链表2的头部
	 * @return 合并完成后的有序链表的头部
	 */
	public static LinkedNode mergeLists(LinkedNode headNode1,
			LinkedNode headNode2) {

		if (!LinkedListUtil.isLinkedListSorted(headNode1)
				|| !LinkedListUtil.isLinkedListSorted(headNode2)) {
			throw new RuntimeException("两个链表中存在无序的链表");
		}

		if (headNode1 == null || headNode2 == null) {
			return headNode1 == null ? headNode2 : headNode1;
		}

		LinkedNode newHead = headNode1.data <= headNode2.data ? headNode1
				: headNode2;
		LinkedNode newCurNode = newHead;

		LinkedNode curNode1 = headNode1;
		LinkedNode curNode2 = headNode2;

		if (newHead == headNode1) {
			curNode1 = curNode1.next;
		} else {
			curNode2 = curNode2.next;
		}

		while (curNode1 != null && curNode2 != null) {
			if (curNode1.data == curNode2.data) {
				newCurNode.next = curNode1;
				newCurNode = curNode1;
				curNode1 = curNode1.next;
				curNode2 = curNode2.next;
			} else if (curNode1.data < curNode2.data) {
				newCurNode.next = curNode1;
				newCurNode = curNode1;
				curNode1 = curNode1.next;
			} else {
				newCurNode.next = curNode2;
				newCurNode = curNode2;
				curNode2 = curNode2.next;
			}
		}

		if (curNode2 != null) {
			newCurNode.next = curNode2;
		} else if (curNode1 != null) {
			newCurNode.next = curNode1;
		} else {
			newCurNode.next = null;
		}
		
		return newHead;
	}
}
