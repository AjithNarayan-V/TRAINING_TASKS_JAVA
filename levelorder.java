import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class Traversal {
    void levelorder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node != null) {
                System.out.print(node.key + "->");
                queue.add(node.left);
                queue.add(node.right);
             }
        }
    }
}

public class levelorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Traversal tr = new Traversal();
        tr.levelorder(root);
    }
}
