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
    public int getDecimalValue(ListNode head) {
        if(head != null && head.next == null){
            return head.val;
        }
        
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){                
                next = next.next;
            }
        }
        
        int count = 0;
        int sum = 0;
        ListNode temp = prev;
        while(temp != null){
            if(temp.val == 1){
                sum += Math.pow(2, count);
            }
            count++;
            temp = temp.next;
        }
           
        return sum;
    }
}