package com.algorithm.linkedlist.fengbin;

/**
 * 问题描述: 
 * 给定一个链表的头结点head和一个值num，删除链表中值为num的节点
 * 
 * 例如链表1->2->3->3->5->null，
 * 删除值为3的节点，
 * 删除之后的结果为:1->2->5->null。
 * 
 * @author fengbincao
 */
public class Problem_20171010_RemoveTargetNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 1, 1 };
		LinkedNode headLinkedNode = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(headLinkedNode);

		LinkedNode headLinkedNode2 = RemoveTargetNode.removeMethod2(
				headLinkedNode, 1);
		LinkedListUtil.printLinkedList(headLinkedNode2);
	}

}
