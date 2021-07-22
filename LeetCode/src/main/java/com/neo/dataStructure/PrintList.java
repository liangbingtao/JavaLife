package com.neo.dataStructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.parsers.FactoryConfigurationError;
import java.security.PublicKey;
import java.util.*;

/**
 * @Description Author neo
 * Date 2021/3/12 14:49
 */

//从尾到头打印链表，输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
//
public class PrintList {
    public static void main(String[] args) {
        SingleList list = new SingleList();
        ListNode head = list.ListNodes();
        ArrayList<ListNode> resList = new ArrayList<ListNode>();
        ListNode res = head;

/*
        Deque<Integer> stack = new ArrayDeque<Integer>();
        while (head !=null){
            stack.push(head.val);
            head=head.next;
        }

        int[] res=new int[stack.size()];
        for (int i=0;i<res.length;i++){

            res[i]=stack.pop();
            System.out.println(res[i]);
        }

        System.out.println(Arrays.toString(res));

        LinkedList<Integer> integers = new LinkedList<Integer>();

 */

        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (stack.size() != 0) {

            res.val = stack.pop();
            resList.add(res);
            System.out.println(res.val);
            res = res.next;
        }
        for (int i = 0; i < resList.size(); i++) {
            if (i == resList.size() - 1) {
                System.out.println(resList.get(i).val + "=>NULL");
            } else {
                System.out.print(resList.get(i).val + "=>");
            }
        }
    }


}


class SingleList {

    public ListNode ListNodes() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}