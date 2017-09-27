package com.algorithm.linkedlist.fengbin;

/**
 * 打印两个有序链表的公共元素的方法
 * 
 * @author fengbincao
 */
public class PrintLinkListCommonPart {

	/**
	 * 打印两个有序链表的公共元素的方法
	 * 
	 * @param headLinkedNode1
	 *            待判断的链表1的头结点
	 * @param headLinkedNode2
	 *            待判断的链表2的头结点
	 */
	public static void printLinkListCommonPart(LinkedNode headLinkedNode1,
			LinkedNode headLinkedNode2) {
		LinkedNode sentinelNode1 = headLinkedNode1;
		LinkedNode sentinelNode2 = headLinkedNode2;

		while (sentinelNode1 != null && sentinelNode2 != null) {
			if (sentinelNode1.data == sentinelNode2.data) {
				System.out.print(sentinelNode1.data);
				System.out.print("\t");
				sentinelNode1 = sentinelNode1.next;
				sentinelNode2 = sentinelNode2.next;
			} else if (sentinelNode1.data > sentinelNode2.data) {
				sentinelNode2 = sentinelNode2.next;
			} else {
				sentinelNode1 = sentinelNode1.next;
			}
		}
	}
}
