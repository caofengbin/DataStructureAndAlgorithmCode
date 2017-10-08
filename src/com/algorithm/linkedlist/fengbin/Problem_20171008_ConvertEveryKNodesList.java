package com.algorithm.linkedlist.fengbin;
/**
 * 问题藐视：
 * 将单链表的每K个节点之间逆序
 * 
 * 详细：
 * 给定一个单链表的头结点head，实现一个调整单链表的函数，是的每K个节点之间逆序，
 * 如果最后一组不够K个节点，则不调整最后几个节点
 * 
 * 用例：
 * 链表：1->2->3->4->5->6->7->8->null，K=3
 * 调整之后的结构：
 * 3->2->1->6->5->4->7->8->null
 * 其中7,8不做调整，因为不够一组
 * 
 * @author fengbincao
 */
public class Problem_20171008_ConvertEveryKNodesList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		final int K = 5;
		LinkedNode headLinkedNode1 = LinkedListUtil.initLinkedList(array);
		LinkedListUtil.printLinkedList(headLinkedNode1);
		LinkedNode newheadNode = ConvertEveryKNodesList.methodOne(headLinkedNode1, K);
		LinkedListUtil.printLinkedList(newheadNode);
		
		System.out.println();
		
		

	}

}
