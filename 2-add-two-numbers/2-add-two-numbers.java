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
//         if(l1 == null && l2 == null){
//             return l1;
//         }
        
//         if(l1 == null && l2 != null){
//             return l2;
//         }
        
//         if(l1 != null && l2 == null){
//             return l1;
//         }
        
        ListNode res = add(l1, l2, 0);
        
        return res;
    }
    
    public ListNode add(ListNode i, ListNode j, int carry){
        if(i == null && j == null){
            return carry == 1 ? new ListNode(carry) : i;
        }
        
        int val = 0;
        
        if(i == null && j != null){
            val = j.val + carry;
        }
        
        if(i != null && j == null){
            val = i.val + carry;
        }
        
        if( i != null && j != null){            
            val = (i.val + j.val + carry);
        }
        
        ListNode res = new ListNode(val % 10);
        
        ListNode iNext = i != null ? i.next : null;
        ListNode jNext = j != null ? j.next : null;
        
        carry = val > 9 ? 1 : 0;
    
        res.next = add(iNext, jNext, carry);
              
        return res;
    }
}