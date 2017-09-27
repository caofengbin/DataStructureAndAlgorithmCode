package com.algorithm.linkedlist.fengbin;

/**
 * 删除单链表中的倒数第K个节点的方法
 * 
 * @author fengbincao
 */
public class RemoveLastKthNode {

	/**
	 * 删除单链表的倒数第K个节点
	 * 
	 * @param headNode
	 *            待处理的单链表的头结点
	 * @param K
	 *            需要删除的位置
	 * @return 删除倒数第K个节点是否成功
	 */
	public static LinkedNode removeLastKthNode(LinkedNode headNode, int K) {
		/**
		 * 思路: 采用快慢指针法，快指针先移动到第K个位置，慢指针扔停留在头部head节点
		 * 而后，快指针与慢指针一起移动，当快指针移动到链表的尾部的时候，慢指针所处的位置就是链表的倒数第K个节点所在的位置
		 */
		LinkedNode fastNode = headNode;
		LinkedNode slowNode = headNode;
		// 先将快指针移动到第K个元素所在的位置
		while (K > 0) {
			K--;
			if (fastNode != null) {
				fastNode = fastNode.next;
			} else {
				throw new RuntimeException("输入的K值不合法，链表的长度小于K值");
			}
		}
		if (fastNode == null) {
			System.out.println("删除的元素在第一个");
			// 删除掉链表头部的元素即可以
			return headNode.next;
		} else {
			// 快指针与慢指针开始同时往后移,移动到待删除的元素的前一个元素所在的位置
			while (fastNode.next != null) {
				fastNode = fastNode.next;
				slowNode = slowNode.next;
			}
			System.out.println("慢指针所在的位置:" + slowNode.data);

			return null;
		}

	}
}
