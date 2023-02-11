package com.allaboutjava.practice;

class Bst {

  static class BstNode {

    int data;
    BstNode right, left;

    BstNode(int data) {
      this.data = data;
      right = left = null;
    }
  }

  BstNode root;

  public boolean isEmpty() {
    return root == null;
  }

  public BstNode getRoot() {
    return root;
  }

  public void insertNode(int data) {
    root = add(root, data);
  }

  private BstNode add(BstNode root, int data) {
    if (root == null) {
      root = new BstNode(data);
      return root;
    }
    if (data < root.data) {
      root.left = add(root.left, data);
    }
    if (data > root.data) {
      root.right = add(root.right, data);
    }

    return root;
  }

  public void removeNode(int data) {
    root = remove(root, data);
  }

  private BstNode remove(BstNode root, int data) {
    if (root == null) {
      return root;
    }
    if (data < root.data) {
      root.left = remove(root.left, data);
    } else if (data > root.data) {
      root.right = remove(root.right, data);
    } else {
      if (root.left == null) {
        return root.right;
      }
      if (root.right == null) {
        return root.left;
      }
      root.data = findMinInRightSubtree(root.right);
      root.right = remove(root.right, root.data);

      return root;
    }
    return root;
  }

  private int findMinInRightSubtree(BstNode right) {
    int min = right.data;
    while (right.left != null) {
      min = right.data;
    }
    return min;
  }

  public void inorder() {
    inorderTraversal(root);
  }

  private void inorderTraversal(BstNode root) {
    if (root == null) {
      return;
    }
    inorderTraversal(root.left);
    System.out.println(root.data);
    inorderTraversal(root.right);
  }

  public static void main(String[] args) {
    Bst bst = new Bst();
    System.out.println("Is tree empty ? " + bst.isEmpty());
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    bst.insertNode(13);
    bst.insertNode(17);
    bst.removeNode(15);
    System.out.println("Inorder traversal");
    bst.inorder();
  }
}