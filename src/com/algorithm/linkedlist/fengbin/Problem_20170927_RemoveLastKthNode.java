package com.algorithm.linkedlist.fengbin;

/**
 * 分别实现删除单链表和双链表中倒数第K个节点的操作
 * 
 * 要求： 如果链表长度为N，要求时间复杂度达到O(N)，额外空间复杂度达到O(1)
 * 
 * @author fengbincao
 */
public class Problem_20170927_RemoveLastKthNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 对一个单链表元素进行操作
		int array[] = { 2, 3 };
		LinkedNode headLinkedNode = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(RemoveLastKthNode.removeLastKthNode(
				headLinkedNode, 2));

		// 对一个双链表元素进行操作
		int array2[] = { 2, 4, 21, 33, 56, 32, 21 };
		DoubleLinkedNode headDoubleNode = LinkedListUtil
				.initDoubleLinkedList(array2);
		System.out.println("");
		System.out.println("删除倒数第K个节点之前:");
		
		LinkedListUtil.printDoubleLinkedList(headDoubleNode);
	
		DoubleLinkedNode newHeadNode = RemoveLastKthNode.removeDoubleListLastKNode(headDoubleNode, 1);
		System.out.println("删除倒数第K个节点之后:");
		LinkedListUtil.printDoubleLinkedList(newHeadNode);
		LinkedListUtil.reversedPrintDoubleLinkedList(newHeadNode);
	}

}
