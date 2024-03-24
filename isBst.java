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

class BinaryTree {
    boolean isBst(Node node){
        if(node == null)
            return true;
        if(node.left == null && node.right == null)
            return true;
        if(node.left!= null && node.left.key > node.key)
            return false;
        if(node.right!= null && node.right.key < node.key)
            return false;
        return isBst(node.left) && isBst(node.right);
    }
}

public class isBst {
    public static void main(String args[]) 
    { 
        Node root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.left.right = new Node(12); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
        
        BinaryTree bt = new BinaryTree();
        System.out.println("Is BST: " + bt.isBst(root));
    } 
}
