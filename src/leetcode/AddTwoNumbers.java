package leetcode;

/**
 * Created by Fan on 10/04/2015.
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    public AddTwoNumbers() {}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode pre = res;
        int carry = 0;

        while (l1 != null || l2 != null){

            if (l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }

            pre.next = new ListNode(carry%10);
            pre = pre.next;
            carry /= 10;
        }

        if (carry == 1)
            pre.next = new ListNode(1);

        return res.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;

        AddTwoNumbers a = new AddTwoNumbers();

        ListNode res1 = a.addTwoNumbers(l1, l4);

        System.out.print(res1.val + " -> " + res1.next.val + " -> " + res1.next.next.val);
    }
}
