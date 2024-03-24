import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeFromUserInput {
    public static TreeNode createTreeFromInput() {
        Scanner scanner = new Scanner(System.in);
        Queue<TreeNode> queue = new LinkedList<>();

        System.out.print("Enter the root value: ");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.print("Enter the left child of " + current.val + " (or -1 for null): ");
            int leftValue = scanner.nextInt();
            if (leftValue != -1) {
                current.left = new TreeNode(leftValue);
                queue.offer(current.left);
            }

            System.out.print("Enter the right child of " + current.val + " (or -1 for null): ");
            int rightValue = scanner.nextInt();
            if (rightValue != -1) {
                current.right = new TreeNode(rightValue);
                queue.offer(current.right);
            }
        }

        scanner.close();
        return root;
    }
    static void printTree(TreeNode root) {
        printTreeUtil(root, 0);
    }

    private static void printTreeUtil(TreeNode node, int level) {
        if (node == null)
            return;3

        printTreeUtil(node.right, level + 1);

        for (int i = 0; i < level; i++)
            System.out.print("\t");

        System.out.println(node.val);

        printTreeUtil(node.left, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = createTreeFromInput();
        System.out.println("Binary Tree created from user input.");
        printTree(root) ;
       }
}
