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
	 * 方法1:通过给定的数组列表，创建一个单链表的方法 该方法是通过“尾插法”进行，新插入的元素在链表的尾部
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
	 * 方法2:通过给定的数组列表，创建一个单链表的方法 该方法是通过“头插法”进行，新插入的元素在链表的头部
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
	 * 方法3:通过传入头结点，进行链表的打印操作
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
	 * 方法4:判断给定链表的长度
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

	/**
	 * 方法5:判断给定的链表是否为有序链表的方法
	 * 
	 * @param headNode
	 *            待判断的链表的头结点
	 * @return true表示是有序链表
	 */
	public static boolean isLinkedListSorted(LinkedNode headNode) {
		if(getLinkedListLength(headNode) == 1) {
			return true;
		}
		LinkedNode pointNode = new LinkedNode();
		pointNode = headNode;
		while (pointNode != null && pointNode.next != null) {
			if (pointNode.data > pointNode.next.data) {
				return false;
			}
			pointNode = pointNode.next;
		}
		return true;
	}
	
	/**
	 * 方法6:通过一个给定的数组结构，初始化一个双链表
	 * @param arrays		待初始化为双链表的数组元素
	 * @return			双链表结构的头结点
	 */
	public static DoubleLinkedNode initDoubleLinkedList(int[] arrays) {
		if (arrays.length == 0) {
			return null;
		}
		DoubleLinkedNode headNode = new DoubleLinkedNode(arrays[0]);
		if (arrays.length == 1) {
			return headNode;
		}
		DoubleLinkedNode tailNode = headNode;
		for (int i = 1; i < arrays.length; i++) {
			int tempData = arrays[i];
			DoubleLinkedNode tempLinkedNode = new DoubleLinkedNode(tempData);
			tailNode.next = tempLinkedNode;
			tempLinkedNode.pre = tailNode;
			tailNode = tempLinkedNode;
		}
		tailNode.next = null;
		return headNode;
	}
	
	/**
	 * 方法7:顺序打印双链表的方法
	 * @param headNode	待打印的双链表的头结点
	 */
	public static void printDoubleLinkedList(DoubleLinkedNode headNode) {
		List<Integer> arratList = new ArrayList<>();
		DoubleLinkedNode pointNode = new DoubleLinkedNode();
		pointNode = headNode;
		while (pointNode != null) {
			arratList.add(pointNode.data);
			pointNode = pointNode.next;
		}
		System.out.println("待打印的双链表内容为:" + arratList);
	}
	
	/**
	 * 方法8:逆序打印双链表的方法
	 * @param headNode	待逆序打印的双链表的头结点
	 */
	public static void reversedPrintDoubleLinkedList(DoubleLinkedNode headNode) {
		List<Integer> arratList = new ArrayList<>();
		DoubleLinkedNode pointNode = new DoubleLinkedNode();
		pointNode = headNode;
		
		if (pointNode == null) {
			System.out.println("待打印的链表为空链表");
			return;
		}
		
		// 先遍历到链表的尾节点处
		while (pointNode.next != null) {
			pointNode = pointNode.next;
		}
		while (pointNode != null) {
			arratList.add(pointNode.data);
			pointNode = pointNode.pre;
		}
		System.out.println("待打印的双链表内容为:" + arratList);
	}
}
