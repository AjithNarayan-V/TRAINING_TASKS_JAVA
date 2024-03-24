class Node {
    int key;
    Node left, right;
    int height;

    Node(int item) {
        key = item;
        left = right = null;
        height = 1;
    }
}

public class Avl_Tree {
    Node root;

    int getHeight(Node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    Node createNode(int key) {
        return new Node(key);
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int getBalanceFactor(Node n) {
        if (n == null)
            return 0;
        return getHeight(n.left) - getHeight(n.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        x.height = max(getHeight(x.right), getHeight(x.left)) + 1;
        y.height = max(getHeight(y.right), getHeight(y.left)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(getHeight(x.right), getHeight(x.left)) + 1;
        y.height = max(getHeight(y.right), getHeight(y.left)) + 1;

        return y;
    }

    Node insert(Node node, int key) {
        if (node == null)
            return createNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        int bf = getBalanceFactor(node);

        // Left Left Case
        if (bf > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        // Right Right Case
        if (bf < -1 && key > node.right.key) {
            return leftRotate(node);
        }
        // Left Right Case
        if (bf > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Left Case
        if (bf < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void printTree(Node root) {
        printTreeUtil(root, 0);
    }

    private static void printTreeUtil(Node node, int level) {
        if (node == null)
            return;

        printTreeUtil(node.right, level + 1);

        for (int i = 0; i < level; i++)
            System.out.print("\t");

        System.out.println(node.key);

        printTreeUtil(node.left, level + 1);
    }

    public static void main(String[] args) {
        Avl_Tree tree = new Avl_Tree();

        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 3);

        printTree(tree.root);
        tree.preOrder(tree.root);
    }
}
