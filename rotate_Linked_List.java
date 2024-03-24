class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class rotate_Linked_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 0;
        ListNode current = head;
        
        // Calculate the length of the list
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Adjust the value of k to avoid unnecessary rotations
        k = k % length;
        if (k == 0) {
            return head;
        }

        // Find the (length - k)th node
        ListNode newTail = head;
        for (int i = 0; i < length - k; i++) {
            newTail = newTail.next;
        }

        // Make the newTail the new end of the list
        current.next = head;
        head = newTail.next;
        newTail.next = null;

        return head;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        rotate_Linked_List solution = new rotate_Linked_List();

        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        int k = 2;
        ListNode rotatedHead = solution.rotateRight(head, k);

        System.out.println("\nAfter rotating by " + k + ":");
        printList(rotatedHead); // Output: 4 -> 5 -> 1 -> 2 -> 3 -> null
    }
}
