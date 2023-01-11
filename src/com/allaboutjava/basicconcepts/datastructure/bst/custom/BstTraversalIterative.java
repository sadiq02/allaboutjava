package com.allaboutjava.basicconcepts.datastructure.bst.custom;

import java.util.Stack;

public class BstTraversalIterative {

  BstNode root;

  public void addNode(int value) {
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

  public void inorderDisplayUingStack() {
    inorderTraversal(root);
  }

  private void inorderTraversal(BstNode root) {
    if (root == null) {
      return;
    }
    Stack<BstNode> stack = new Stack<>();
    BstNode current = root;
    while (current != null || stack.size() > 0) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }
      current = stack.pop();
      System.out.println(current.value);
      current = current.right;
    }
  }

  public void preOrderTraversalUsingStack() {
    preOrderTraversal(root);
  }

  private void preOrderTraversal(BstNode root) {
    if (root == null) {
      return;
    }
    Stack<BstNode> stack = new Stack<>();
    BstNode current = root;
    stack.push(current);
    while (!stack.isEmpty()) {
      current = stack.pop();
      System.out.println(
          current.value); //first printing root value since root comes first in pre-order traversal

      if (current.right
          != null) { //then pushing right because its stack (LIFO) and we want right subtree to be displayed last in pre-order
        stack.push(current.right);
      }
      if (null
          != current.left) { //pushing left subtree nodes after right so that it can be popped before right subtree nodes
        stack.push(current.left);
      }
    }
  }

  public static void main(String[] args) {
    BstTraversalIterative bst = new BstTraversalIterative();
    bst.addNode(10);
    bst.addNode(7);
    bst.addNode(11);
    bst.addNode(6);
    bst.addNode(8);
    bst.addNode(12);
    System.out.println("Current root value - " + bst.root.value);
    System.out.println("\nInorder Traversal");
    bst.inorderDisplayUingStack();
    System.out.println("\nPreorder Traversal");
    bst.preOrderTraversalUsingStack();
  }
}
