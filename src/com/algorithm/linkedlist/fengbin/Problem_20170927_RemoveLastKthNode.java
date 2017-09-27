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
		int array[] = { 2, 4, 21, 33, 56, 32, 21 };
		LinkedNode headLinkedNode = LinkedListUtil.initLinkedList(array);
		RemoveLastKthNode.removeLastKthNode(headLinkedNode, 7);
		LinkedListUtil.printLinkedList(RemoveLastKthNode.removeLastKthNode(headLinkedNode, 7));
	}

}
