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
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode tail = null;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        // Initialize tail to the last node
        if (!stack.isEmpty()) {
            tail = stack.pop();
            head = tail;
        }   
        // Pop nodes from the stack and connect them in reverse order
        while (!stack.isEmpty()) {
            head.next = stack.pop();
            head = head.next;
        }
        // Set the next of the last node to null to terminate the list
        if (head != null) {
            head.next = null;
        }
        return tail;
    }
    
}

public class deleteMe2{
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

// public ListNode reverseList(ListNode head) {
//     Stack<ListNode> stack=new Stack<ListNode>();
//     ListNode tail=null;
//     while(head!=null){
//         stack.push(head);
//         head=head.next;
//     }
//     while(!stack.isEmpty()){
//         head=stack.pop();
//         tail.next=head;
//         tail=head;
//     }
//     return head;
// }