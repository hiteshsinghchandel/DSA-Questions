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
    public void reorderList(ListNode head) {
        if(head ==null || head.next ==null){
            return;
        }
         ListNode m = midl(head);
          ListNode newn = rev(m.next);
          m.next = null;
           ListNode hf = head;
           
          while(hf !=null && newn !=null){
             ListNode temp = hf.next;
             hf.next = newn;
             hf = temp;
             temp = newn.next;
             newn.next = hf;
             newn = temp;



          }
          
        
    }

    static ListNode midl(ListNode h){
        ListNode f = h;
         ListNode s = h;
         while(f !=null && f.next != null){
            s = s.next;
            f= f.next.next;
         }return s;
    }

    static  ListNode rev( ListNode h){
        if(h==null){
            return h;
        }
         ListNode prev = null;
          ListNode pres = h;
           ListNode ne = pres.next;
           while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = ne;
            if(ne != null){
                ne = ne.next;
            }
           }return prev;
    }
}