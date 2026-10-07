class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        // Step 2: Reverse the second half
        ListNode current = slow.next;
        ListNode prev = null;

        while (current != null) {

            // Save next node
            ListNode nextNode = current.next;

            // Reverse pointer
            current.next = prev;

            // Move prev forward
            prev = current;

            // Move current forward
            current = nextNode;
        }


        // Disconnect the first half
        slow.next = null;


        // Step 3: Merge two halves alternately
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            // Save next nodes
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            // Connect first → second
            first.next = second;

            // Connect second → next first
            second.next = firstNext;

            // Move both pointers
            first = firstNext;
            second = secondNext;
        }
    }
}