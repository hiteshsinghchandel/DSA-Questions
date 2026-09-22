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
        ListNode f = head;
        int legth = 0;
        ListNode s = head;
        while(f !=null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(f==s){
                legth = length(s);
                break;
            }
        }
        if(legth ==0){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        while(legth>0){
            slow = slow.next;
            legth--;
        }
        while(slow !=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;


        
    }

    static int length(ListNode head){
        ListNode f = head;
        ListNode s = head;
        int l  =0;
        while(f !=null && f.next != null){

            f = f.next.next;
            s = s.next;
            if(f==s){
                ListNode tem = s;
                do{
                    tem = tem.next;
                    l++;
                }while(tem !=s);
                return l;
            }
        }return l;

    }
}