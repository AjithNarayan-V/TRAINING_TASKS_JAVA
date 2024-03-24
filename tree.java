class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " -> ");
            inorderTraversal(node.right);
        }
    }

    void preoderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " -> ");
            preoderTraversal(node.left);
            preoderTraversal(node.right);
        }
    }

    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " -> ");
        }
    }

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }
        return node;
    }

    Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    Node inOrderPredecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    Node deleteNode(Node root, int value) {
        Node iPre;
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        if (value < root.key) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.key) {
            root.right = deleteNode(root.right, value);
        } else {
            iPre = inOrderPredecessor(root);
            root.key = iPre.key;
            root.left = deleteNode(root.left, iPre.key);
        }
        return root;
    }
    int height(Node head){
        int len=0;
        while(head.left!=null){
            head=head.left;
            len++;
        }
        return len;
    }
}

public class tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null;
        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 70);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);

        System.out.println("Preorder traversal:");
        tree.preoderTraversal(root);
        System.out.println("\nInorder traversal:");
        tree.inorderTraversal(root);
        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(root);

        Node n = tree.search(root, 70);
        if (n != null) {
            System.out.println("\nFound: " + n.key);
        } else {
            System.out.println("Element not found");
        }
        tree.deleteNode(root, 60);
        System.out.println("Preorder traversal after deletion:");
        tree.preoderTraversal(root);
        System.out.println("\nInorder traversal after deletion:");
        tree.inorderTraversal(root);
        System.out.println("\nPostorder traversal after deletion:");
        tree.postorderTraversal(root);

        System.out.println(tree.height(root));

    }
}
