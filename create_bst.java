class Node { 
    int key; 
    Node left, right; 

    // Constructor 
    Node(int key) 
    { 
        this.key = key; 
        left = null; 
        right = null; 
    } 
} 


class create_bst{

    int findmid(ArrayList<Integer> list){
        int mid = list.size()/2;
        return mid;
    } 


    public static void main(String[] args){
        ArrayListList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);


        create_bst bst = new create_bst();
        System.out.println(bst.findmid(list));


    }
}
