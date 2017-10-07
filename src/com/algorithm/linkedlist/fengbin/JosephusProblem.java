package com.algorithm.linkedlist.fengbin;

/**
 * 通过环形单链表结构模拟实现“约瑟夫环”问题
 * 
 * @author fengbincao
 */
public class JosephusProblem {

	/**
	 * 模拟实现“约瑟夫环”问题
	 * 
	 * @param headNode
	 *            头结点
	 * @param num
	 *            "自杀"的报数位数
	 */
	public static LinkedNode simulationJosephus(LinkedNode headNode, int num) {
		if (headNode == null || headNode.next == headNode || num < 1) {
			return headNode;
		}
		LinkedNode last = headNode;
		while (last.next != headNode) {
			last = last.next;
		}
		int count = 0;
		while (headNode != last) {
			if (++count == num) {
				last.next = headNode.next;
				count = 0;
			} else {
				last = last.next;
			}
			headNode = last.next;
		}
		return headNode;
	}
}
