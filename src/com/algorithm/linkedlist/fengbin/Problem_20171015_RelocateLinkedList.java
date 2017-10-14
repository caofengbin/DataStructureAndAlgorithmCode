package com.algorithm.linkedlist.fengbin;

/**
 * 按照左右半区的方式重新组合单链表
 * 
 * 详细描述：
 * 给定一个单链表的头结点head，长度为N，
 * 如果N为偶数，那么前N/2个节点算做左半区，后N/2个节点算作右半区；
 * 如果N为奇数，那么前N/2个节点算做左半区，后N/2 + 1 个节点算作右半区；
 * 左半区从左到右依次记为L1->L2->L3...
 * 右半区从左到右依次记为R1->R2->R3...
 * 请将单链表调整为L1->R2->L2->R2->L3->R3......的形式
 * 
 * 测试用例：
 * (1) 1->null,调整为1->null
 * (2) 1->2->null,调整为1->2->null
 * (3) 1->2->3->null,调整为1->2->3->null
 * (4) 1->2->3->4->null,调整为1->3->2->4->null
 * (5) 1->2->3->4->5->null,调整为1->3->2->4->5->null
 * (6) 1->2->3->4->5->6->null,调整为1->4->2->5->3->6->null
 * 
 * @author fengbincao
 */
public class Problem_20171015_RelocateLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
