package LinkedList;
/*
* To reorder a linked list, we have to follow three steps
* 1. Find the middle of linked list
* 2. Reverse the second half of linked list
* 3. Merge both the lists
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        // Step 1: Find the middle of the linked list
        ListNode middle = middle(head);

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = secondHalf(middle.next);

        // Disconnect the first half from the second half
        middle.next = null;

        // Step 3: Merge both the lists
        mergeLists(head, secondHalf);
    }

    // Step 1: Find the middle of the linked list using slow and fast pointers
    static ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Step 2: Reverse the second half of the linked list
    static ListNode secondHalf(ListNode middle) {
        ListNode prev = null;
        ListNode curr = middle;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;  // Return the new head of the reversed second half
    }

    // Step 3: Merge the two halves
    static void mergeLists(ListNode head, ListNode secondHalf) {
        ListNode h1 = head;
        ListNode h2 = secondHalf;

        while (h2 != null) {
            ListNode temp1 = h1.next;
            ListNode temp2 = h2.next;

            // Merge the nodes alternately
            h1.next = h2;
            h2.next = temp1;

            // Move both pointers forward
            h1 = temp1;
            h2 = temp2;
        }
    }
}

