class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class no_of_nodes_in_tree {
    public int countNodes(TreeNode root) {
        if (root.left == null) {
            return 0;
        }
        // Count nodes in the left subtree
        int leftCount = countNodes(root.left);
        // Count nodes in the right subtree
        int rightCount = countNodes(root.right);
        System.out.println("lf:"+leftCount );
        // Include the current node in the count
        System.out.println("rf:"+rightCount );
      return 1+ leftCount + rightCount;
    }
    int height(TreeNode head){
        int len=0;
        while(head.left!=null){
            head=head.left;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        no_of_nodes_in_tree treeSize = new no_of_nodes_in_tree();

        // Example usage:
        // Constructing a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Calculate the number of nodes in the tree
        int numOfNodes = treeSize.countNodes(root);
        System.out.println("Number of nodes in the binary tree: " + numOfNodes); // Output: 7

        System.out.println(treeSize.height(root));

    }
}
