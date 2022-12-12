package org.leetcode.sanzhar.T2;

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

public class AddTwoNumbers {
    /*
    Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode();
        ListNode result = tempNode;
        int remain = 0;
        while (tempNode != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + remain;
            if (sum >= 10)
                remain = 1;
            else
                remain = 0;
            tempNode.val = sum % 10;
            tempNode.next = ((l1 == null || l1.next == null)
                    && (l2 == null || l2.next == null)
                    && remain == 0) ?
                    null : new ListNode();
            l1 = l1 == null || l1.next == null ? null : l1.next;
            l2 = l2 == null || l2.next == null ? null : l2.next;

            if (tempNode.next != null)
                tempNode = tempNode.next;
            else
                tempNode = null;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(5)));

        ListNode listNode2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));

        ListNode listNode = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);
        System.out.println("listNode = " + listNode);
    }
}
