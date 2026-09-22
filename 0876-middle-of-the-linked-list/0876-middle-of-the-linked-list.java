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
    public ListNode middleNode(ListNode head) {
        int l = len(head);
        int a = 0;
        while(a != (l/2)){
            a++;
            head = head.next;
        }
        return head;


        
    }

    static int len(ListNode h){
        int l = 0;
        ListNode tem = h;
        while(tem != null){
            l++;
            tem = tem.next;

        }return l;
    }
}