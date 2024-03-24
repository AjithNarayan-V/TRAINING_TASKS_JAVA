import java.util.Stack;

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

    void iterativeInorderTraversal(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node current = node;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.key + " -> ");

            current = current.right;
        }
    }

    void iterativePreorderTraversal(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.key + " -> ");

            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }

    void iterativePostorderTraversal(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        Stack<Integer> output = new Stack<>();

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            output.push(current.key);

            if (current.left != null)
                stack.push(current.left);
            if (current.right != null)
                stack.push(current.right);
        }

        while (!output.isEmpty()) {
            System.out.print(output.pop() + " -> ");
        }
    }
}

public class iterative_tree_traversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Iterative Inorder traversal:");
        tree.iterativeInorderTraversal(tree.root);
        System.out.println("\nIterative Preorder traversal:");
        tree.iterativePreorderTraversal(tree.root);
        System.out.println("\nIterative Postorder traversal:");
        tree.iterativePostorderTraversal(tree.root);
    }
}
