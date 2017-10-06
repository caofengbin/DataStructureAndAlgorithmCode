package com.algorithm.linkedlist.fengbin;

/**
 * 删除给定链表的中间节点的方法
 * 
 * @author fengbincao
 */
public class RemoveNodeByRatioUtil {

	public static LinkedNode removeNodeByRatio(LinkedNode headNode) {
		/*
		 * 思路: 采用快慢指针法, 快指针每次移动两个位置, 慢指针每次移动一个位置，
		 */
		if (headNode == null) {
			// 空链表，直接返回
			return headNode;
		} else if (headNode.next == null || headNode.next.next == null) {
			// 链表长度为1或者2的场景
			return headNode.next;
		} else {
			LinkedNode fastNode = headNode.next.next;
			LinkedNode slowNode = headNode;
			while (fastNode.next != null && fastNode.next.next != null) {
				slowNode = slowNode.next;
				fastNode = fastNode.next.next;
			}
			// slowNode所处的位置即为待删除的节点的前一个节点所在的位置
			slowNode.next = slowNode.next.next;
			return headNode;
		}

	}
}
