class List{
    int data;
    List prev;
    List next;
    
    List(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class solution{
    public List addNode(List head,int data) {
        List newnode = new List(data);
        if(head==null){

            return newnode;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;

        return head;
    }
    public List adddlast(List head,int data) {
        List newnode = new List(data);
        if(head==null){

            return newnode;
        }
        List current = head;
        while(current.next!=null){
            current=current.next;
        }
        newnode.prev=current;
        current.next=newnode;
        return head;
    }    

    public List addmid(List head,int data) {
        List newnode = new List(data);
        if(head==null){

            return newnode;
        }
        List slow =head ;
        List fast =head ;
        while(fast.next != null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        }
        List temp=slow.next;
        slow.next=newnode;
        newnode.prev=slow;
        newnode.next=temp;
        temp.prev=newnode;
        return head;
    }

    public List adddindex(List head,int data,int index) {
        List newnode = new List(data);
        if(head==null){

            return newnode;
        }
        List current = head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        List temp=current.next;
        current.next=newnode;
        newnode.prev=current;
        newnode.next=temp;
        temp.prev=newnode;
        return head;
    }  


    public void display(List head) {
        List current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class gracytest2 {
    public static void main(String[] args) {
        solution ss = new solution();
        List head=null;
        head=ss.addNode(head,2);
        head=ss.addNode(head,3);
        head=ss.addNode(head,4);
        head=ss.addNode(head,10);
        head=ss.addNode(head,49);
        head=ss.adddlast(head,7);
        head=ss.addmid(head,6);
        head=ss.adddindex(head,65,2);

        

        ss.display(head);
        System.out.println(head.data);
        System.out.println(head.next.data);
        
    }
}


// public class gracytest2 {
//     public static void main(String[] args) {
//         Solution ss = new Solution();
//         List head = null; // Initialize head to null
//         head = ss.addNode(head, 2); // Update head with the new head returned from addNode
//         System.out.println(head.data);
//     }
// }

    //     ss.addfi(83);
    //     ss.addfi(45);
    //     ss.addfi(89);
    //     ss.addfi(43);
    //     System.out.println("List of elements in the doubly linked list:");
    //     System.out.println(ss.listofele());
        
        //     public void addfi(int data) {
        //         hello newnode = new hello();
        //         newnode.data = data;
        
        //         if (head == null) {
        //             head = newnode;
        //             return;
        //         }
        
        //         newnode.next = head;
        //         head.prev = newnode;
        //         head = newnode;
        //     }
        
        //     public ArrayList<Integer> listofele() {
        //         ArrayList<Integer> see = new ArrayList<>();
        //         hello temp = head;
        //         while (temp != null) {
        //             see.add(temp.data);
        //             temp = temp.next;
        //         }
        //         return see;
        //     }
        // }