package com.algorithm.linkedlist.fengbin;
/**
 * 问题描述:
 * 两个单链表生成相加后的链表
 * 
 * 详细描述:
 * 假设链表中每一个节点的值都在0--9之间，那么链表整体就可以代表一个整数。
 * 例如:9->3->7，可以代表整数937。
 * 给定两个这种链表的头节点head1和head2，生成代表这两个整数相加值的结果链表。
 * 例如，链表1为9->3->7->null，链表2为6->3。
 * 最后的结果为:1->0->0->0->null
 * 
 * @author fengbincao
 */
public class Problem_20171011_AddTwoLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 9, 3, 7 };
		int array2[] = { 6, 3, 3, 2 };
		LinkedNode headLinkedNode1 = LinkedListUtil.initLinkedList(array);
		LinkedNode headLinkedNode2 = LinkedListUtil.initLinkedList(array2);
		LinkedNode newHeadNode = AddTwoLinkedLists.addListMethod1(
				headLinkedNode1, headLinkedNode2);
		
		System.out.println("待相加的链表1:");
		LinkedListUtil.printLinkedList(headLinkedNode1);
		
		System.out.println("待相加的链表2:");
		LinkedListUtil.printLinkedList(headLinkedNode2);
		System.out.println();
		
		System.out.println("通过方法1相加后的结果为:");
		LinkedListUtil.printLinkedList(newHeadNode);
		
		System.out.println();
		LinkedNode newHeadNode2 = AddTwoLinkedLists.addListMethod2(
				headLinkedNode1, headLinkedNode2);
		System.out.println("通过方法2相加后的结果为:");
		LinkedListUtil.printLinkedList(newHeadNode2);
		
	}

}
