package com.algorithm.linkedlist.fengbin;
/**
 * 思路分析
 * 对于指定的位置begin和end，
 * 需要找到begin位置的前一个元素preNode,
 * 以及end位置的后一个元素endNode。
 * 然后逆序preNode与endNode之间的所有元素即可。
 * 这里有一个问题需要注意，就是可能存在“换头”的情况，这种情况下需要返回新的头结点元素。
 * 
 * @author fengbincao
 */
public class ReversePartListUtil {

	/**
	 * 对于一个给定的链表，逆序从begin到end位置之间的元素
	 * 
	 * @param headNode
	 *            待操作的链表的头节点
	 * @param begin
	 *            开始位置
	 * @param end
	 *            结束位置
	 * @return 操作完成后的链表头节点
	 */
	public static LinkedNode reversePartList(LinkedNode headNode, int begin,
			int end) {
		if (begin < 0 || end < 0 || end < begin) {
			System.out.println("输入的参数begin或者end不合法");
			return headNode;
		}

		LinkedNode sentinelNode = headNode;
		LinkedNode preNode = null;
		LinkedNode endNode = null;
		int length = 0;

		// 进行一遍遍历，找到preNode与endNode所在的位置
		while (sentinelNode != null) {
			length++;
			if (length + 1 == begin) {
				preNode = sentinelNode;
			}
			if (length == end) {
				endNode = sentinelNode;
			}
			sentinelNode = sentinelNode.next;
		}

		if (endNode != null) {
			endNode = endNode.next;
		}

		// 判断参数begin与end是否合法
		if (end > length) {
			System.out.println("输入的参数end大于链表的长度");
			return headNode;
		}

//		System.out.println(preNode.data);
//		System.out.println(endNode.data);
		
		// 反转begin到end之间的元素
		LinkedNode curNode = (preNode == null ? headNode : preNode.next);
		sentinelNode = curNode.next;
		curNode.next = endNode;
		LinkedNode nextNode = null;
		
		while(sentinelNode != endNode) {
			nextNode = sentinelNode.next;
			sentinelNode.next = curNode;
			curNode = sentinelNode;
			sentinelNode = nextNode;
		}
		
		// 将反转后的链表与原本的链表连接上
		if(preNode != null) {
			preNode.next = curNode;
			return headNode;
		}
		
		// 存在“换头”的问题
		return curNode;

	}
}
