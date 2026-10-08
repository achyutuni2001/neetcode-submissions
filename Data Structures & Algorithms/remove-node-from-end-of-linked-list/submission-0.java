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

         // Step 1: Count number of nodes
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        // Step 2: If we need to remove the head
        if(count == n){
            return head.next;
        }

         // Step 3: Find the node BEFORE the node to remove
        temp = head;
        int position = count - n;
        for(int i = 1; i < position; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

// BruteForce method
