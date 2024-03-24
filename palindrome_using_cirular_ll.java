class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Function to insert a node at the end of the circular linked list
    public void insert(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself to form a circular list
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Function to check if the circular linked list is palindrome
    public boolean isPalindrome() {
        if (head == null)
            return true;

        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Now 'slow' is pointing to the middle of the list
        // Reverse the second half of the list
        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;

        // Compare first half and reversed second half
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    // Function to reverse a linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}

public class palindrome_using_cirular_ll {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert('a');
        list.insert('b');
        list.insert('c');
        list.insert('b');
        list.insert('a');

        if (list.isPalindrome())
            System.out.println("The list is a palindrome.");
        else
            System.out.println("The list is not a palindrome.");
    }
}
