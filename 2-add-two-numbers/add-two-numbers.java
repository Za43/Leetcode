/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while (l1 != null || l2!= null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            ret.next = new ListNode((x+y + carry) % 10);
            carry = (x + y + carry) / 10;
            ret = ret.next;
            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next: l2;
        }
        if (carry > 0){
            ret.next = new ListNode(1);
        }
        return head.next;
    }
}