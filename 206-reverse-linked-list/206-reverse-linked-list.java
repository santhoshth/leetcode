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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
           return head;
       }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
//     public ListNode reverseList(ListNode head) {
//         if(head == null){
//             return head;
//         }
        
//         if(head != null && head.next == null){
//             return head;
//         }
        
//         // using 3 pointer method
//         ListNode previous = null;
//         ListNode present = head;
//         ListNode next = head.next;
        
//         while(next != null){
//             present.next = previous;
//             previous = present;
//             present = next;              
//             next = next.next;
//         }
//         present.next = previous;
        
//         return present;
//     }
}