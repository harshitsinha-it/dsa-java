/*
=====================================================
LeetCode #2 - Add Two Numbers

Problem:

You are given two non-empty linked lists representing two 
non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two 
numbers and return the sum as a linked list.

Topic      : Linked List
=====================================================
*/

public class AddTwoNumbers {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            int digit = sum % 10;
            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        //Local test: 567 + 678 = 
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
