package com.yit.exercise.leetcode;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode lSum = addTwoNumbers(l1, l2);

        System.out.println(lSum);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;

        int carry = 0;
        while (l1 != null || l2 != null) {

            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            current.val = sum;
            current.next = new ListNode();
            current = current.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry == 0) {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp = null;
        }

        return head;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
