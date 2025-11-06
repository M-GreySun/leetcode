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
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet <Integer> values= new HashSet <Integer> ();
        for(int ele: nums){
            values.add(ele);
        }
        while(head!=null && values.contains(head.val)){
            head=head.next;
        }
        ListNode tempHead= head;
        while(tempHead!=null){
            ListNode curr= tempHead.next;
            while(curr!=null && values.contains(curr.val)){
                curr=curr.next;
            }
            tempHead.next=curr;
            tempHead=tempHead.next;
        }

        return head;
        
    }
}