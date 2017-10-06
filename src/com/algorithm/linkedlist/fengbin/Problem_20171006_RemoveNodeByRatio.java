package com.algorithm.linkedlist.fengbin;

/**
 * 问题描述: 删除链表的中间节点和a/b处的节点
 * 
 * 例如： 
 * 空链表：不删除任何节点 
 * 1->2，删除节点1 
 * 1->2->3，删除节点2 
 * 1->2->3->4，删除节点2
 * 1->2->3->4->5，删除节点3
 * 
 * 进阶： 给定链表的头结点head,整数a和b，实现删除位于a/b处的节点的函数
 * 
 * @author fengbincao
 */
public class Problem_20171006_RemoveNodeByRatio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
		LinkedNode headLinkedNode = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(headLinkedNode);
		LinkedNode newHeadNode = RemoveNodeByRatioUtil
				.removeNodeByRatio(headLinkedNode);
		LinkedListUtil.printLinkedList(newHeadNode);
	}
}
