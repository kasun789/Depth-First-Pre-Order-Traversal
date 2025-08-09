public class TreeStructure {
    // Depth-First Pre-Order Traversal (Root -> Left -> Right)
    public static void preOrderTraversal(TreeNode node) {
        if(node == null) return;

        System.out.println("Visiting: " +  node.getValue()); // Visit current node
        preOrderTraversal(node.getLeft()); // Traverse left subtree
        preOrderTraversal(node.getRight()); // Traverse right subtree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(7));

        System.out.println("Depth-First Pre-Order Traversal:");
        preOrderTraversal(root);
    }
}