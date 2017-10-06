package com.algorithm.linkedlist.fengbin;

/**
 * 分别反转单向链表和双向链表的方法
 * 
 * @author fengbincao
 */
public class ReverseListUtil {

	/**
	 * 反转单向链表
	 * 
	 * @param headNode
	 *            待反转的单向链表的头结点
	 * @return 反转完成之后的链表新头结点
	 */
	public static LinkedNode reverseSingleLinkList(LinkedNode headNode) {
		LinkedNode preNode = null;
		LinkedNode nextNode = null;
		// 进行一次遍历，修改相应的指针关系即可
		while (headNode != null) {
			nextNode = headNode.next;
			headNode.next = preNode;
			preNode = headNode;
			headNode = nextNode;
		}

		return preNode;
	}

	/**
	 * 反转一个双链表结构的方法
	 * 
	 * @param headNode
	 *            待操作的双链表结构的头结点
	 * @return 逆序之后的双链表结构的头结点
	 */
	public static DoubleLinkedNode reverseDoubleLinkList(
			DoubleLinkedNode headNode) {
		DoubleLinkedNode preNode = null;
		DoubleLinkedNode nextNode = null;

		while (headNode != null) {
			nextNode = headNode.next;
			headNode.pre = nextNode;
			headNode.next = preNode;
			preNode = headNode;
			headNode = nextNode;
		}

		return preNode;
	}
}
