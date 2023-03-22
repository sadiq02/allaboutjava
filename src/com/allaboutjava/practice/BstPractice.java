package com.allaboutjava.practice;

public class BstPractice {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;


    void insert(int value) {
        root = insertNode(root, value);
    }

    void delete(int value){
        root = removeNode(root, value);
    }

    Node insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertNode(root.left, value);
        }
        if (value > root.value) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    Node removeNode(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.value) {
            root.left = removeNode(root.left, value);
        } else if (value > root.value) {
            root.right = removeNode(root.right, value);
        } else {
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }
            root.value = findMinValueNode(root.right);
            root.right = removeNode(root.right, root.value);
        }
        return root;
    }

    private int findMinValueNode(Node right) {
        int min = right.value;
        Node temp = right;
        while (temp.left != null) {
            min = temp.left.value;
        }
        return min;
    }

    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.value);
            inorderTraversal(root.right);
        }
    }

    void preorderTraversal(Node root) {
        if (root != null) {
            System.out.println(root.value);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.value);
        }
    }

    public static void main(String arg[]) {
        BstPractice bst = new BstPractice();
        bst.insert(10);
        bst.insert(15);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);
        bst.insert(17);
        bst.delete(6);
        System.out.println("Inorder Traversal");
        bst.inorderTraversal(bst.root);
        System.out.println("Pre-Order Traversal");
        bst.preorderTraversal(bst.root);
        System.out.println("Post-Order Traversal");
        bst.postorderTraversal(bst.root);
    }
}
