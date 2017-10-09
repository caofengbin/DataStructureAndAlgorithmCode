package com.algorithm.linkedlist.fengbin;

import java.util.HashSet;
import java.util.Set;

/**
 * 删除链表中的重复的节点
 * 
 * @author fengbincao
 */
public class RemoveRepetition {

	/**
	 * 删除链表中值重复的节点的方法1:通过一个hash表来存储元素的值
	 * 
	 * @param headNode
	 *            待删除重复元素的链表节点的头结点
	 * @return 删除成功的链表头结点
	 */
	public static LinkedNode removeRepetitionNode1(LinkedNode headNode) {
		Set<Integer> mValues = new HashSet<>();

		// 放入链表的第一个节点值
		if (headNode != null) {
			mValues.add(headNode.data);
		} else {
			return headNode;
		}

		LinkedNode preNode = headNode;
		LinkedNode curNode = headNode.next;

		while (curNode != null) {
			// 判断值是否重复
			if (mValues.contains(curNode.data)) {
				preNode.next = curNode.next;
				// 如果进行了删除节点的操作，则不需要修改preNode的指向
			} else {
				mValues.add(curNode.data);
				preNode = curNode;
			}

			curNode = curNode.next;
		}

		return headNode;
	}

	/**
	 * 删除链表中值重复的节点的方法2:采用类似于选择排序的一种方式进行
	 * 时间复杂度为O(N*N)，额外空间复杂度为O(1)
	 * 
	 * @param headNode
	 *            待删除重复元素的链表节点的头结点
	 * @return 删除成功的链表头结点
	 */
	public static LinkedNode removeRepetitionNode2(LinkedNode headNode) {
		if (headNode == null || headNode.next == null) {
			// 为空链表，或者是只有一个元素的链表，则直接返回
			return headNode;
		}
	
		LinkedNode curNode = headNode;
		LinkedNode preNode = null;
		LinkedNode nextNode = null;
		
		while (curNode != null) {
			preNode = curNode;
			nextNode = curNode.next;
			
			// 内循环，从curNode开始往后遍历，判断有没有重复的元素
			while (nextNode != null) {
				
				if (curNode.data == nextNode.data) {
					// 进行元素的删除操作，不修改preNode的指向
					preNode.next = nextNode.next;
				} else {
					preNode = nextNode;
				}
				
				nextNode = nextNode.next;
			}
			
			curNode = curNode.next;
		}
		
		return headNode;
	}
}
