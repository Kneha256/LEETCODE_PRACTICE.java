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
        //create fast and slow pointer
        ListNode fast=head;
        ListNode slow=head;

        //move fast n steps ahead
        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        //if fast is null we are deleating the head node
        if(fast==null){
             ListNode newhead=head.next;
             return newhead;
            
        }


        //move both pointer until fast reaches end
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        //delete the nth node from end
        slow.next=slow.next.next;
        return head;
        
    }
}
