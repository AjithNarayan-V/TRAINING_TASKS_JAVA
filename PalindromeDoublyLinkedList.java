class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int x) {
        val = x;
    }
}

public class PalindromeDoublyLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or single-node list is always a palindrome
        }

        int length = 0;
        ListNode current = head;
        ListNode tail = null;

        // Find the length of the doubly linked list
        while (current != null) {
            length++;
            tail = current;
            current = current.next;
        }

        current = head;
        tail = tail;
        
        // Check for palindrome property
        for (int i = 0; i < length / 2; i++) {
            if (current.val != tail.val) {
                return false;
            }
            current = current.next;
            tail = tail.prev;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeDoublyLinkedList solution = new PalindromeDoublyLinkedList();

        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.prev = head;
        head.next.next = new ListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new ListNode(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Is the doubly linked list a palindrome? " + solution.isPalindrome(head)); // Output: true
    }
}
