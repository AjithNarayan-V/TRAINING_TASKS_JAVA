class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Binary_Tree_Height {
    Node root;

    /* Compute the "maxDepth" of a tree -- the number of
     nodes along the longest path from the root node
     down to the farthest leaf node.*/
    int maxDepth(Node node) {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            /* use the larger one */
            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    public static void main(String[] args) {
        Binary_Tree_Height tree = new Binary_Tree_Height();

        /* Constructed binary tree is
                1
              /   \
             2     3
            / \
           4   5
          /
         6     */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);

        System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
    }
}
