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
        ListNode res = add(l1, l2, 0);
        
        return res;
    }
    
    public ListNode add(ListNode i, ListNode j, int carry){
        // when both node are null, return based on carry value
        // if carry is 0 return null else return the carry value as node
        
        if(i == null && j == null){
            return carry == 1 ? new ListNode(carry) : i;
        }
        
        int iValue = i != null ? i.val : 0;
        int jValue = j != null ? j.val : 0;
        
        int sum = iValue + jValue + carry;
        
        // creating a node with calculated value
        ListNode res = new ListNode(sum % 10);
        
        // when both the list have different length
        // once the shortest list is completed, it can be passed as null
        // then val will be calculated based on remaining nodes of longest list        
        ListNode iNext = i != null ? i.next : null;
        ListNode jNext = j != null ? j.next : null;
        
        carry = sum > 9 ? 1 : 0;
    
        res.next = add(iNext, jNext, carry);
              
        return res;
    }
}