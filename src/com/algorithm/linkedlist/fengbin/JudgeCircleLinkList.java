package com.algorithm.linkedlist.fengbin;
/**
 * 判断一个链表是否有环的方法，具体过程思路如下所示：
 * 1.设置一个慢指针slow和一个快指针fast。在开始时，slow和fast都指向链表的头节点head。然后slow每次移动一步，fast每次移动两步。在链表中遍历起来；
 * 2.如果链表无环，那么fast指针在移动的过程中一定先遇到终点，一旦fast到达终点，说明链表是没有环的。直接返回null，表示链表无环，当然也没有第一个入环的节点；
 * 3.如果链表有环，那么fast指针和slow指针一定会在环中的某个位置相遇，当fast和slow相遇时，fast指针重新回到head的位置，slow指针不动。接下来，fast指针
 * 从每次移动两步改为每次移动一步，slow指针依然每次移动一步，然后继续遍历；
 * 4.fast指针和slow指针一定会再次相遇，并且在第一个入环的节点处相遇。
 * 
 * @author fengbincao
 */
public class JudgeCircleLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
