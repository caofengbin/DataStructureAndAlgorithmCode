package com.algorithm.linkedlist.fengbin;

/**
 * 用环形单链表结构来模拟实现“约瑟夫环问题”
 * 
 * @author fengbincao
 */
public class Problem_20171007_JosephusProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		LinkedNode headLinkedNode = LinkedListUtil.initCircleLinkedList(array);
		LinkedNode headLinkedNode2 = JosephusProblem.simulationJosephus(headLinkedNode, 3);
		System.out.println(headLinkedNode2.data);
	}

}
