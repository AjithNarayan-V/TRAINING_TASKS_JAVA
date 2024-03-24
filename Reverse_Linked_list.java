    
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
// LINKED LIST CREATION
class Solution {

    public ListNode tail = null;

    public ListNode addNode(int data, ListNode head) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;     
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }

    public void display(ListNode head) {
        ListNode current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    //----------------------------------------REVERSE LOGIC---------------------------------------------

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;

            // Move pointers one position ahead
            prev = current;
            current = next;
        

        return prev;
    }
}

public class Reverse_Linked_list {
    public static void main(String[] args) {
        //lINKED LLIST CREATION 
        Solution solution = new Solution();
        int arr[] = {1, 2, 4, 5};
        ListNode head = null;
        for (int a : arr) {
            head = solution.addNode(a, head); 
        }
        solution.display(head);
//-----------------------------------------------------

        ListNode reversedHead = solution.reverseList(head);


        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        // Output will be: 5 4 2 1
    }
}
