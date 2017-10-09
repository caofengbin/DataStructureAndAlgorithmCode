package com.algorithm.linkedlist.fengbin;
/**
 * 问题描述：
 * 删除无序链表中重复出现的节点
 * 
 * 详细描述：
 * 给定一个无序链表的头节点head，删除其中值重复出现的节点。
 * 例如：1->2->3->3->4->4->2->1->1->null,
 * 删除值重复的节点之后结果为:1->2->3->4->null,
 * 
 * 要求实现如下的两种方法：
 * 方法1：如果链表长度为N，时间复杂度达到O(N)
 * 方法2：额外空间复杂度为O(1)
 * 
 * @author fengbincao
 */
public class Problem_20171009_RemoveRepetition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array1[] = { 7, 2, 3, 3, 4, 4, 2, 1, 1, 8 };
		LinkedNode headLinkedNode1 = LinkedListUtil.initLinkedList(array1);
		LinkedListUtil.printLinkedList(headLinkedNode1);

		LinkedNode headLinkedNode2 = RemoveRepetition
				.removeRepetitionNode2(headLinkedNode1);
		LinkedListUtil.printLinkedList(headLinkedNode2);
	}

}
