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
		int array[] = { 2, 4, 21, 33, 56, 32, 21 };
		LinkedNode headLinkedNode = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(RemoveLastKthNode.removeLastKthNode(headLinkedNode, 3));
		
		// 对一个双链表元素进行操作
		int array2[] = {  };
		DoubleLinkedNode headDoubleNode = LinkedListUtil.initDoubleLinkedList(array2);
		LinkedListUtil.printDoubleLinkedList(headDoubleNode);
	}

}
