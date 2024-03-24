 public class deleteMe3 {
    private Node head;
    private int size;

    public linked1() {
        head = null;
        size = 0;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void addAtIndex(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node reference = head;
        for (int i = 0; i < index - 1; i++) {
            reference = reference.next;
        }
        newNode.next = reference.next;
        reference.next = newNode;
        size++;
    }

    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node reference = head;
        for (int i = 0; i < index - 1; i++) {
            reference = reference.next;
        }
        reference.next = reference.next.next;
        size--;
    }

    void deletefirst() {
        if (head != null) {
            head = head.next;
            size--;
        } else {
            System.out.println("List is empty");
        }
    }

    void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    int middleelpick() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.data;
    }

    int middledel() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        Node slowPointer = head;
        Node fastPointer = head;
        Node prevToSlowPointer = null;
        while (fastPointer != null && fastPointer.next != null) {
            prevToSlowPointer = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        if (prevToSlowPointer != null) {
            prevToSlowPointer.next = slowPointer.next;
        } else {
            head = slowPointer.next;
        }
        int middleValue = slowPointer.data;
        size--;
        return middleValue;
    }

    public int findMax() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int findMin() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public double findaverage() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        double average = (double) sum / size;
        return average;
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; 
        }

  
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

     
        Node secondHalf = reverseList(slow.next);

    
        Node p1 = head;
        Node p2 = secondHalf;
        while (p2 != null) {
            if (p1.data != p2.data) {
             
                slow.next = reverseList(secondHalf);
                return false; 
            }
            p1 = p1.next;
            p2 = p2.next;
        }

      
        slow.next = reverseList(secondHalf);
        return true; 
    }
    private Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                    size--;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    public void rightRotation(int k) {
        if (head == null || head.next == null || k == 0) {
            return; 
        }

        int length = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return; 
        }

        current.next = head; 
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }

        head = current.next;
        current.next = null;
    }

    public void leftRotation(int k) {
        if (head == null || head.next == null || k == 0) {
            return; 
        }

        int length = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return;
        }

        current.next = head;

        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }

        head = current.next;
        current.next = null;
    }

    public void displayLinkedList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linked1 myList = new linked1();

        myList.addAtIndex(10, 0);
        myList.addLast(78);
        myList.addFirst(5);
        myList.addAtIndex(15, 1);
        myList.addAtIndex(40, 3);

        System.out.println("searched element: " + myList.search(10));
        System.out.println("deleted element from the list: " + myList.middledel());
        System.out.println("maximum element from the list: " + myList.findMax());
        System.out.println("minimum element from the list: " + myList.findMin());
        System.out.println("Average element from the list: " + myList.findaverage());

        System.out.println("Linked List before removing duplicates:");
        myList.displayLinkedList();

        myList.removeDuplicates();

        System.out.println("Linked List after removing duplicates:");
        myList.displayLinkedList();

        int rightRotationCount = 2;
        myList.rightRotation(rightRotationCount);
        System.out.println("Linked List after rotating " + rightRotationCount + " positions to the right:");
        myList.displayLinkedList();

        int leftRotationCount = 3;
        myList.leftRotation(leftRotationCount);
        System.out.println("Linked List after rotating " + leftRotationCount + " positions to the left:");
        myList.displayLinkedList();
        System.out.println(myList.isPalindrome());
    }
}