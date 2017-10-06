package com.algorithm.linkedlist.fengbin;

/**
 * 问题描述： 反转单向链表和双向链表 
 * 
 * 要求：如果链表长度为N，时间复杂度要求为O(N)，额外空间复杂度要求为O(1)。
 * 
 * @author fengbincao
 */
public class Problem_20171006_ReverseList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 2, 3, 6, 34, 56 };
		LinkedNode headNode = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(ReverseListUtil.reverseSingleLinkList(headNode));
		
		int array2[] = { 2, 3, 6, 34, 56 };
		DoubleLinkedNode headLinkedNode = LinkedListUtil.initDoubleLinkedList(array2);
		LinkedListUtil.printDoubleLinkedList(ReverseListUtil.reverseDoubleLinkList(headLinkedNode));
	}

}
