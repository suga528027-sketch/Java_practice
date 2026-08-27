class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;

        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }

        // Reverse k nodes
        ListNode previous = null;
        ListNode current = head;

        for (int i = 0; i < k; i++) {

            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // head is now the last node of reversed group
        head.next = reverseKGroup(current, k);

        // previous is the new head of this group
        return previous;
    }
}