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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = midi(head);
        ListNode headSec = rev(mid);
        ListNode revse = headSec;
        while(head !=null && headSec !=null){
            if(head.val !=headSec.val){
                break;
            }head = head.next;
            headSec= headSec.next;
        }
        // rev(revse);

        return head == null ||headSec==null;


        
    }

    static ListNode rev(ListNode g){

        ListNode prev = null;
        ListNode pres = g;
        if(pres ==null){
            return null;
        }ListNode ne = pres.next;

        while(pres!=null){
            pres.next =prev;
            prev = pres;
            pres = ne;
            if(ne != null){
                ne = ne.next;
            }
        } 

        return prev;

    }

    static ListNode midi(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next !=null){
            s= s.next;
            f = f.next.next;
        }return s;
    }


}