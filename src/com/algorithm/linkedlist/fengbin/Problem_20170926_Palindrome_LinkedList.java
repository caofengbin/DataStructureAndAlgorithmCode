package com.algorithm.linkedlist.fengbin;

/**
 * 问题描述 给定一个链表的头结点head，判断该链表是否为回文结构 例如： 1->2->1，返回true 1->2->2->1，返回true
 * 1->2->3->1，返回false
 * 
 * 基本解法的要求： 链表长度为N，要求时间复杂度为O(N)，额外空间复杂度为O(N)
 * 
 * 进阶解法的要求： 链表长度为N，要求时间复杂度为O(N)，额外空间复杂度为O(1)
 * 
 * @author fengbincao
 */
public class Problem_20170926_Palindrome_LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1,1};
		LinkedNode headLinkedNode = LinkedListUtil.initLinkedList(array);
		if (PalindromeLinkedList.judgePalindromeList2(headLinkedNode)) {
			LinkedListUtil.printLinkedList(headLinkedNode);
			System.out.println("是回文链表");
		} else {
			LinkedListUtil.printLinkedList(headLinkedNode);
			System.out.println("不是回文链表");
		}

	}
}
