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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode leftPointer=head;
        ListNode rightPointer= head;
        int stagger= 0;

        while(rightPointer!=null){
            if(stagger>n){
                leftPointer= leftPointer.next;
            }
            rightPointer=rightPointer.next;
            stagger++;
        }
        if(stagger==n){
            return head.next;
        }
        
        leftPointer.next= leftPointer.next.next;
        return head;
    }
}