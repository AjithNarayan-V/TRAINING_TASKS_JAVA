
class hello{
    int data;
    hello prev;
    hello next;


    hello() {
        this.data = 0;
        this.prev = null;
        this.next = null;
        hello.head = null; // Corrected to Node1.head
    }

    hello(int data, hello prev, hello next, hello head) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        hello.head = head; // Corrected to Node1.head
    }

    public void addfi(int data) {
        hello newnode = new hello();
        newnode.data = data;

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public ArrayList<Integer> listofele() {
        ArrayList<Integer> see = new ArrayList<>();
        hello temp = head;
        while (temp != null) {
            see.add(temp.data);
            temp = temp.next;
        }
        return see;
    }
}

public class packagee {
    public static void main(String[] args) {
        hello ss = new hello();
        ss.addfi(83);
        ss.addfi(45);
        ss.addfi(89);
        ss.addfi(43);
        System.out.println("List of elements in the doubly linked list:");
        System.out.println(ss.listofele());
    }
}