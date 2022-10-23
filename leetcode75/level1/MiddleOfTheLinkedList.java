// 876. Middle of the Linked List

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
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode curr = head.next;
        int count = 2;
        
        while (curr.next != null) {            
            curr = curr.next;
            count++;
        }
        curr = head;
        count /= 2;
        while (count > 0) {
            curr = curr.next;
            count--;
        }
        return curr;
    }
}