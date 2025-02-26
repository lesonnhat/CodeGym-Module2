package org.example;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Phương thức thêm nút vào BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Phương thức duyệt theo thứ tự post-order
    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(TreeNode node) {
        if (node != null) {
            // Bước 1: Duyệt cây con bên trái
            postOrderRec(node.left);
            // Bước 2: Duyệt cây con bên phải
            postOrderRec(node.right);
            // Bước 3: Truy cập nút gốc
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Thêm các nút vào BST theo hình minh họa
        bst.insert(27);
        bst.insert(14);
        bst.insert(10);
        bst.insert(19);
        bst.insert(35);
        bst.insert(31);
        bst.insert(42);

        // Duyệt theo thứ tự post-order
        System.out.println("Duyệt theo thứ tự Post-order:");
        bst.postOrder();
    }
}