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
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split into two lists
        ListNode mid = slow.next;
        slow.next = null;

        // Sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        // Merge sorted halves
        return merge(left, right);
    }

    private ListNode merge(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if (a != null) {
            temp.next = a;
        }

        if (b != null) {
            temp.next = b;
        }

        return dummy.next;
    }
}
// using bubble sort

// // public ListNode sortList(ListNode head) {


//         ListNode i = head;
//         while(i !=null){

//         ListNode tem = head;
//         while(tem.next != null){
//             if(tem.val>tem.next.val){
//                 int a = tem.val;
//                 tem.val =tem.next.val;
//                 tem.next.val = a;
                
//             }tem = tem.next;}i= i.next;

//         }return head;
        
//     }