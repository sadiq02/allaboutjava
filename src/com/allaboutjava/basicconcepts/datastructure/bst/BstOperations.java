package com.allaboutjava.basicconcepts.datastructure.bst;

public class BstOperations {

  BstNode root;

  public void insertNode(int value) {
    root = addNode(root, value);
  }

  private BstNode addNode(BstNode root, int value) {
    if (root == null) {
      root = new BstNode(value);
      return root;
    }
    if (value < root.value) {
      root.left = addNode(root.left, value);
    }
    if (value > root.value) {
      root.right = addNode(root.right, value);
    }
    return root;
  }

  public void inOrderDisplay() {
    inorder(root);
  }

  public void preOrderDisplay() {
    preOrder(root);
  }

  public void postOrderDisplay() {
    postOrder(root);
  }

  private void inorder(BstNode root) {
    if (root != null) {
      inorder(root.left);
      System.out.println(root.value);
      inorder(root.right);
    }
  }

  private void preOrder(BstNode root) {
    if (root != null) {
      System.out.println(root.value);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  private void postOrder(BstNode root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.value);
    }
  }

}
