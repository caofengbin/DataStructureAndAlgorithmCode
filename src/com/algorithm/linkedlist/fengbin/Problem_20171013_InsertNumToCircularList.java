package com.algorithm.linkedlist.fengbin;

/**
 * 向有序的环形单链表中插入新节点
 * 
 * 详细描述: 一个环形单链表从头节点head开始不降序，同时由最后的节点指回头节点。给定这样一个单链表的头结点head和一个整数num，请生成节点
 * 值为num的新节点，并插入到环形链表中，保证调整后的链表有序。
 * 
 * @author fengbincao
 */
public class Problem_20171013_InsertNumToCircularList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 　测试用例1：出现了“换头”的分支情况
		int array1[] = { 11, 22, 33, 44, 55, 123 };
		LinkedNode headLinkedNode1 = LinkedListUtil
				.initCircleLinkedList(array1);
		LinkedListUtil.printCircleLinkedList(headLinkedNode1);

		LinkedNode newHeadLinkedNode1 = InsertNumToCircularList.insertNum(
				headLinkedNode1, 1);
		LinkedListUtil.printCircleLinkedList(newHeadLinkedNode1);
		System.out.println();

		// 　测试用例2:待插入的元素在环形链表的最后一个位置
		int array2[] = { 11, 22, 33, 44, 55, 123 };
		LinkedNode headLinkedNode2 = LinkedListUtil
				.initCircleLinkedList(array2);
		LinkedListUtil.printCircleLinkedList(headLinkedNode2);

		LinkedNode newHeadLinkedNode2 = InsertNumToCircularList.insertNum(
				headLinkedNode2, 199);
		LinkedListUtil.printCircleLinkedList(newHeadLinkedNode2);
		System.out.println();

		// 　测试用例3:最普通的情况，待插入的元素在链表的中间部分
		int array3[] = { 11, 22, 33, 44, 55, 123 };
		LinkedNode headLinkedNode3 = LinkedListUtil
				.initCircleLinkedList(array3);
		LinkedListUtil.printCircleLinkedList(headLinkedNode3);

		LinkedNode newHeadLinkedNode3 = InsertNumToCircularList.insertNum(
				headLinkedNode3, 88);
		LinkedListUtil.printCircleLinkedList(newHeadLinkedNode3);
		System.out.println();

		// 　测试用例5:比较极端的情况，给定的链表只有一个节点
		int array5[] = { 11 };
		LinkedNode headLinkedNode5 = LinkedListUtil
				.initCircleLinkedList(array5);
		LinkedListUtil.printCircleLinkedList(headLinkedNode5);

		LinkedNode newHeadLinkedNode5 = InsertNumToCircularList.insertNum(
				headLinkedNode5, 8);
		LinkedListUtil.printCircleLinkedList(newHeadLinkedNode5);
		System.out.println();

		// 　测试用例6:比较极端的情况，给定的环形链表为空链表
		int array6[] = {  };
		LinkedNode headLinkedNode6 = LinkedListUtil
				.initCircleLinkedList(array6);
		LinkedListUtil.printCircleLinkedList(headLinkedNode6);

		LinkedNode newHeadLinkedNode6 = InsertNumToCircularList.insertNum(
				headLinkedNode6, 800);
		LinkedListUtil.printCircleLinkedList(newHeadLinkedNode6);
		System.out.println();

		// 　测试用例4:异常情况，给定的链表不是有序的链表
		int array4[] = { 11, 22, 33, 44, 555, 123 };
		LinkedNode headLinkedNode4 = LinkedListUtil
				.initCircleLinkedList(array4);
		LinkedListUtil.printCircleLinkedList(headLinkedNode4);

		LinkedNode newHeadLinkedNode4 = InsertNumToCircularList.insertNum(
				headLinkedNode4, 88);
		LinkedListUtil.printCircleLinkedList(newHeadLinkedNode4);
		System.out.println();

	}

}
