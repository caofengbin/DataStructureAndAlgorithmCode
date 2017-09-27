package com.algorithm.linkedlist.fengbin;

/**
 * 问题描述: 打印两个有序链表的公共部分。 给定两个有序链表的头指针header1和header2，打印两个链表的公共部分
 * 
 * @author fengbincao
 */
public class Problem_20170927_PrintCommonPart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 4, 21, 33, 56 };
		int array2[] = { 3, 4, 5, 20, 33, 45, 56 };
		LinkedNode headLinkedNode1 = LinkedListUtil.initLinkedList(array);
		LinkedNode headLinkedNode2 = LinkedListUtil.initLinkedList(array2);

		if (LinkedListUtil.isLinkedListSorted(headLinkedNode1)
				&& LinkedListUtil.isLinkedListSorted(headLinkedNode2)) {
			PrintLinkListCommonPart.printLinkListCommonPart(headLinkedNode1,
					headLinkedNode2);
		} else {
			System.out.println("给定的两个链表中存在非有序的链表，请重新检查输入");
		}
	}

}
