import java.util.Scanner;

class TreeNode {
    String name;
    TreeNode left, right;
    TreeNode(String name) {
        this.name = name;
        left = right = null;
    }
}

public class FamilyTree {
    TreeNode root;

    // Build a family tree with 15 members, names given at runtime
    TreeNode buildTreeFromInput(Scanner sc) {
        int n = 15;
        TreeNode[] members = new TreeNode[n];
        System.out.println("Enter names for 15 family members:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for member " + (i + 1) + ": ");
            members[i] = new TreeNode(sc.nextLine());
        }
        for (int i = 0; i < n / 2; i++) {
            int leftIdx = 2 * i + 1;
            int rightIdx = 2 * i + 2;
            if (leftIdx < n) members[i].left = members[leftIdx];
            if (rightIdx < n) members[i].right = members[rightIdx];
        }
        return members[0];
    }

    // Print the tree in level order
    void printLevelOrder(TreeNode root) {
        if (root == null) return;
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print("Level " + level + ": ");
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.name + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            System.out.println();
            level++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FamilyTree tree = new FamilyTree();
        tree.root = tree.buildTreeFromInput(sc);
        System.out.println("Family Tree (Level Order):");
        tree.printLevelOrder(tree.root);
        sc.close();
    }
}