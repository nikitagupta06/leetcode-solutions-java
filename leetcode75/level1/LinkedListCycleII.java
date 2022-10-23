// 142. Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null || head.next == null) return null;
        
        ListNode currT = head;
        ListNode currR = head;
        
        while (currT != null && currR != null && currR.next != null) {
            currT = currT.next;
            currR = currR.next.next;
            if (currT == currR) break;
        }
        
        if (currT == null || currR == null || currR.next == null)
            return null;        
        
        ListNode curr = head;
        
        while (curr != currT) {
            currT = currT.next;
            curr = curr.next;
        }
        
        return curr;
    }
}