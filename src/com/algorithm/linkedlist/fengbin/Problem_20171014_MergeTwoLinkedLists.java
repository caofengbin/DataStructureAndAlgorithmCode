package com.algorithm.linkedlist.fengbin;

/**
 * 问题描述: 
 * 给定两个有序的单链表的头结点head1和head2，请合并两个有序的链表。 
 * 合并之后的链表依然有序，并返回合并之后的链表的头结点
 * 
 * @author fengbincao
 */
public class Problem_20171014_MergeTwoLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 测试用例1：最普通的一组数据
		int array1[] = { 1, 3, 8, 9 };
		int array2[] = { 2, 3, 8, 9, 10, 77, 90, 888 };
		LinkedNode headLinkedNode1 = LinkedListUtil.initLinkedList(array1);
		LinkedNode headLinkedNode2 = LinkedListUtil.initLinkedList(array2);
		LinkedNode newHeadNode1 = MergeTwoLinkedLists.mergeLists(
				headLinkedNode1, headLinkedNode2);
		LinkedListUtil.printLinkedList(newHeadNode1);
		System.out.println();

		// 测试用例2：存在空链表的场景
		int array4[] = { 1, 3, 7, 11 };
		int array3[] = {};
		LinkedNode headLinkedNode3 = LinkedListUtil.initLinkedList(array3);
		LinkedNode headLinkedNode4 = LinkedListUtil.initLinkedList(array4);
		LinkedNode newHeadNode3 = MergeTwoLinkedLists.mergeLists(
				headLinkedNode3, headLinkedNode4);
		LinkedListUtil.printLinkedList(newHeadNode3);
		System.out.println();
		
		// 测试用例3：存在无序链表的场景
		int array5[] = { 1, 3, 7, 11 };
		int array6[] = { 1, 3, 7, 4, 11 };
		LinkedNode headLinkedNode5 = LinkedListUtil.initLinkedList(array5);
		LinkedNode headLinkedNode6 = LinkedListUtil.initLinkedList(array6);
		LinkedNode newHeadNode5 = MergeTwoLinkedLists.mergeLists(
				headLinkedNode5, headLinkedNode6);
		LinkedListUtil.printLinkedList(newHeadNode5);
		System.out.println();
	}

}
