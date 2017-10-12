package com.algorithm.linkedlist.fengbin;

/**
 * 单链表的选择排序算法的实现
 * 
 * @author fengbincao
 */
public class LinkListSelectedSort {

	/**
	 * 思路： 从未排序的的部分找到最小值，然后放在排好序的尾部，逐步将未排序的部分逐渐缩小，组装成一个新的链表即可
	 * 
	 * @param headNode
	 *            待排序的头结
	 * @return
	 */
	public static LinkedNode selectedSort(LinkedNode headNode) {
		LinkedNode curNode = null;
		LinkedNode preNode = null;
		LinkedNode minNode = null;
		LinkedNode newHeadNode = null;
		return null;

	}

	/**
	 * 返回链表中节点值最小的元素的前一个元素的前一个节点
	 * 
	 * @param headNode
	 *            待处理的链表的头结点
	 * @return 节点值最小的元素的前一个元素的前一个节点
	 */
	private static LinkedNode getSmallestNode(LinkedNode headNode) {
		LinkedNode curNode = headNode.next;
		LinkedNode preNode = headNode;

		LinkedNode smallNode = headNode;
		LinkedNode preSmallNode = null;

		while (curNode != null) {

			if (curNode.data < smallNode.data) {
				smallNode = curNode;
				preSmallNode = preNode;
			}

			preNode = curNode;
			curNode = curNode.next;
		}

		return preSmallNode;
	}
}
