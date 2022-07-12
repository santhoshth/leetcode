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
       int cycleLength = getCycleLength(head);
        if(cycleLength == 0){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < cycleLength; i++){
            second = second.next;
        }

        while (first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
    
    public int getCycleLength(ListNode head){
        ListNode node = checkCycleAndGetNode(head);
        if(node == null){
            return 0;
        }
        ListNode temp = node;
        temp = temp.next;
        int cycleLength = 1;
        while (temp != node){
            temp = temp.next;
            cycleLength += 1;
        }
        return cycleLength;
    }
    
    public ListNode checkCycleAndGetNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return fast;
            }
        }
        return null;
    }
    
    
}