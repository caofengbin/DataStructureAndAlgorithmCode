package com.algorithm.linkedlist.fengbin;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表基本数据结构的常用方法
 * 
 * @author fengbincao
 */
public class LinkedListUtil {

	/**
	 * 通过给定的数组列表，创建一个链表的方法 该方法是通过“尾插法”进行，新插入的元素在链表的尾部
	 * 
	 * @param arrays
	 *            给定的数组
	 * @return 创建完成后的链表的头结点
	 */
	public static LinkedNode initLinkedList(int[] arrays) {
		if (arrays.length == 0) {
			return null;
		}
		LinkedNode headNode = new LinkedNode(arrays[0]);
		if (arrays.length == 1) {
			return headNode;
		}
		LinkedNode tailNode = headNode;
		for (int i = 1; i < arrays.length; i++) {
			int tempData = arrays[i];
			LinkedNode tempLinkedNode = new LinkedNode(tempData);
			tailNode.next = tempLinkedNode;
			tailNode = tempLinkedNode;
		}
		tailNode.next = null;
		return headNode;
	}

	/**
	 * 通过给定的数组列表，创建一个链表的方法 该方法是通过“头插法”进行，新插入的元素在链表的头部
	 * 
	 * @param arrays
	 *            给定的数组
	 * @return 创建完成后的链表的头结点
	 */
	public static LinkedNode initHeadLinkedList(int[] arrays) {
		if (arrays.length == 0) {
			return null;
		}
		LinkedNode headNode = new LinkedNode(arrays[0]);
		if (arrays.length == 1) {
			return headNode;
		}
		// 通过头插法建立的链表，不需要定义“哨兵节点”
		for (int i = 1; i < arrays.length; i++) {
			int tempData = arrays[i];
			LinkedNode tempLinkedNode = new LinkedNode(tempData);
			tempLinkedNode.next = headNode;
			headNode = tempLinkedNode;
		}
		return headNode;
	}

	/**
	 * 通过传入头结点，进行链表的打印操作
	 * 
	 * @param headNode
	 *            待打印的链表的头结点
	 */
	public static void printLinkedList(LinkedNode headNode) {
		List<Integer> arratList = new ArrayList<>();
		LinkedNode pointNode = new LinkedNode();
		pointNode = headNode;
		while (pointNode != null) {
			arratList.add(pointNode.data);
			pointNode = pointNode.next;
		}
		System.out.println("待打印的链表内容为:" + arratList);
	}

	/**
	 * 判断给定链表的长度
	 * 
	 * @param headNode
	 *            链表的头部节点
	 * @return 链表长度
	 */
	public static int getLinkedListLength(LinkedNode headNode) {
		int length = 0;
		LinkedNode pointNode = new LinkedNode();
		pointNode = headNode;
		while (pointNode != null) {
			length++;
			pointNode = pointNode.next;
		}
		System.out.println("链表长度为:" + length);
		return length;
	}
}
