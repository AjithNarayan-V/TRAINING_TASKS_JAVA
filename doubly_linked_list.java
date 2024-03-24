public class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    LinkedList(){
        this.val=0;
        this.next=null;
        this.prev=null;
    }
}
class Doublelist{
    ListNode addElement(ListNode head,int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        return head;
    }

}
