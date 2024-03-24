import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BalanceTree {
    ArrayList<Integer> toList(TreeNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            list.add(temp.data);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return list;
    }

    TreeNode balance (TreeNode head){
        ArrayList<Integer> balanceList = new ArrayList<Integer>();
        balanceList=toList(head);
        balanceList.sort(Comparator.naturalOrder());
        System.out.println(balanceList);
        return create_bst(balanceList,0,balanceList.size()-1);
        
    }
    TreeNode create_bst(ArrayList<Integer> arr, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode newnode=new TreeNode(arr.get(mid));
        newnode.left=create_bst(arr,start,mid-1);
        newnode.right=create_bst(arr,mid+1,end);

        return newnode;
    }
   //-----------------print Tree------------------------     
    void printTree(TreeNode root) {
        printTreeUtil(root, 0);
    }

    private static void printTreeUtil(TreeNode node, int level) {
        if (node == null)
            return;

        printTreeUtil(node.right, level + 1);

        for (int i = 0; i < level; i++)
            System.out.print("\t");

        System.out.println(node.data);

        printTreeUtil(node.left, level + 1);
    }
}
public class unbalanced_balanced_Tree{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
		root.left = new TreeNode(11); 
		root.left.left = new TreeNode(7); 
		root.left.right = new TreeNode(12); 
		root.right = new TreeNode(9); 
		root.right.left = new TreeNode(15); 
		root.right.right = new TreeNode(8); 
        BalanceTree bt=new BalanceTree();
        root=bt.balance(root);
        bt.printTree(root);
    }
}