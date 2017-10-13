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
		LinkedNode tailNode = null;								// 排序部分的尾部
		LinkedNode curNode = headNode;							// 未排序部分的头部
		LinkedNode smallNodePre = null;							// 最小节点的前一个节点
		LinkedNode smallNode = null;							// 最小节点
		
		while (curNode != null) {
			smallNode = curNode;
			smallNodePre = getSmallestPreNode(curNode);
			
			if (smallNodePre != null) {
				// 将最小的节点删除
				smallNode = smallNodePre.next;
				smallNodePre.next = smallNode.next;
			}
			
			curNode = curNode == smallNode ? curNode.next : curNode;
					
			// 将新的排序好的节点插入到链表中
			if (tailNode == null) {
				headNode = smallNode;
			} else {
				tailNode.next = smallNode;
			}
			
			tailNode = smallNode;
		}
		
		return headNode;

	}

	/**
	 * 返回链表中节点值最小的元素的前一个元素的前一个节点
	 * 
	 * @param headNode
	 *            待处理的链表的头结点
	 * @return 节点值最小的元素的前一个元素的前一个节点
	 */
	private static LinkedNode getSmallestPreNode(LinkedNode headNode) {
		LinkedNode curNode = headNode.next;
		LinkedNode preNode = headNode;

		LinkedNode smallNode = headNode;
		LinkedNode preSmallNode = null;

		while (curNode != null) {

			if (curNode.data < smallNode.data) {
				preSmallNode = preNode;
				smallNode = curNode;
			}

			preNode = curNode;
			curNode = curNode.next;
		}

		return preSmallNode;
	}
}
