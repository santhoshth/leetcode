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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null) {
            return list2;
        }

        if (list1 != null && list2 == null) {
            return list1;
        }

        if (list1 == null && list2 == null) {
            return null;
        }
        
        ListNode result = list1.val <= list2.val ? list1 : list2;
        
        if(list1.val <= list2.val)
            list1 = list1.next;
        else
            list2 = list2.next;
        
        result = merge(list1,list2, result);
        
        return result;
    }
    
    public ListNode merge(ListNode one, ListNode two, ListNode result){
        if(result == null){
            return result;
        }
        
        boolean good = valid(one) && valid(two);
        
        if(good && one.val <= two.val){
            result.next = one;
            one = one.next;
        }
        
        else if(good && one.val > two.val){
            result.next = two;
            two = two.next;            
        }
        
        if(!good && one != null){
            result.next = one;
            one = one.next;
        }
        
        if(!good && two != null){
            result.next = two;
            two = two.next;    
        }
        
        result.next = merge(one, two, result.next);
        
        return result;
    }
    
    public boolean valid(ListNode node){
        return node != null;
    }
}
