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

        ListNode prev = null;
        ListNode pres = head;
        if(pres==null){
            return null;
            
        }
        ListNode ne = pres.next;

        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = ne;
            if(ne !=null){
                ne = ne.next;
            }
        }head = prev;
        return head;

        
    }
}