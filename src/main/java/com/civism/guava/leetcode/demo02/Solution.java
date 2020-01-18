package com.civism.guava.leetcode.demo02;

import com.alibaba.fastjson.JSON;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Test02
 * @date 2020/1/17 4:01 下午
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2020 蓝鲸淘.
 * @return
 */
public class Solution {

//    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//    示例：
//
//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/add-two-numbers
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ll1 = l1;
        ListNode ll2 = l2;

        while (ll1.next != null || ll2.next != null) {
            if (ll1.next == null) {
                ll1.next = new ListNode(0);
            } else if (ll2.next == null) {
                ll2.next = new ListNode(0);
            }
            ll1 = ll1.next;
            ll2 = ll2.next;
        }

        ListNode node = new ListNode(0);
        ListNode temp = node;
        int flag = 0;
        while (l1 != null && l2 != null) {
            int value = (l1.val + l2.val + flag) % 10;

            if ((l1.val + l2.val + flag) >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
            temp.val = value;
            if (flag == 1) {
                temp.next = new ListNode(flag);
            } else {
                if (l1.next != null) {
                    temp.next = new ListNode(0);
                }
            }
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        return node;
    }


    public static void main(String[] args) {
//        ListNode listNode1 = new ListNode(2);
//
//        ListNode listNode2 = new ListNode(4);
//        ListNode listNode3 = new ListNode(3);
//
//        listNode2.next = listNode3;
//        listNode1.next = listNode2;
//
//        ListNode node1 = new ListNode(5);
//        ListNode node2 = new ListNode(6);
//        ListNode node3 = new ListNode(4);
//
//
//        node1.next = node2;
//        node2.next = node3;


//        ListNode listNode1 = new ListNode(5);
//        ListNode node1 = new ListNode(5);




//        ListNode listNode1 = new ListNode(1);
//
//        ListNode listNode2 = new ListNode(9);
//        ListNode listNode3 = new ListNode(9);
//
//        listNode2.next = listNode3;





        ListNode listNode1 = new ListNode(9);

        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(6);

        listNode2.next = listNode3;
        listNode1.next = listNode2;

        ListNode node1 = new ListNode(0);


        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(listNode1, node1);

        System.out.println(JSON.toJSONString(listNode));

    }
}
