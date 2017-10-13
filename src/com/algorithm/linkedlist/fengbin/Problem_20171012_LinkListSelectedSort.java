package com.algorithm.linkedlist.fengbin;

/**
 * 单链表的选择排序，给定一个无序单链表的头结点head，实现单链表的选择排序。 要求额外空间复杂度为O(1)
 * 
 * @author fengbincao
 */
public class Problem_20171012_LinkListSelectedSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 9, 3, 7, 78, 33 };
		LinkedNode headLinkedNode1 = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(headLinkedNode1);
		
		LinkedNode newHeadNode = LinkListSelectedSort.selectedSort(headLinkedNode1);
		LinkedListUtil.printLinkedList(newHeadNode);
	}

}
