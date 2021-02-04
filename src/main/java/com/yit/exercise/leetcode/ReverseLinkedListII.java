package com.yit.exercise.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii
 */
public class ReverseLinkedListII {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode l1 = new ListNode(1, new ListNode(2));

        ListNode listNode = reverseBetween(l1, 1, 2);

        System.out.println(listNode);

    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode newListNodeHead = new ListNode();
        ListNode newListNode = newListNodeHead;
        int stepCounter = 1;
        Stack<Integer> stackToReverse = new Stack<>();
        ListNode current = head;

        while (current != null) {

            if (stepCounter >= m && stepCounter <= n) {
                stackToReverse.push(current.val);
            } else if (stepCounter > n) {
                while (!stackToReverse.isEmpty()) {
                    newListNode.val = stackToReverse.pop();
                    newListNode.next = new ListNode();
                    newListNode = newListNode.next;
                }
                while (current != null) {
                    newListNode.val = current.val;
                    if (current.next != null) {
                        newListNode.next = new ListNode();
                    }
                    newListNode = newListNode.next;

                    current = current.next;
                }
                break;
            } else {
                newListNode.val = current.val;
                newListNode.next = new ListNode();
                newListNode = newListNode.next;
            }

            current = current.next;
            stepCounter++;
        }

        // Edge case
        while (!stackToReverse.isEmpty()) {
            newListNode.val = stackToReverse.pop();
            if (!stackToReverse.isEmpty()) {
                newListNode.next = new ListNode();
            }
            newListNode = newListNode.next;
        }
        return newListNodeHead;
    }
}


