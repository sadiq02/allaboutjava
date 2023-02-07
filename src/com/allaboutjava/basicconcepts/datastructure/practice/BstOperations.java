package com.allaboutjava.basicconcepts.datastructure.practice;

import java.util.LinkedList;
import java.util.Queue;

public class BstOperations {

  BstNode root;

  public void addNode(int data) {
    root = add(root, data);
  }

  BstNode add(BstNode root, int data) {
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

  BstNode remove(BstNode root, int data) {
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
      root.data = findMinValueNodeInRightSubtree(root.right);
      root.right = remove(root.right, root.data);
    }
    return root;
  }

  private int findMinValueNodeInRightSubtree(BstNode node) {
    int min = node.data;
    while (node.left != null) {
      min = node.left.data;
      node = node.left;
    }
    return min;
  }

  void inorderDisplay() {
    inorder(root);
  }

  private void inorder(BstNode root) {
    if (root != null) {
      inorder(root.left);
      System.out.println(root.data);
      inorder(root.right);
    }
  }

  void preorderDisplay() {
    preorder(root);
  }

  private void preorder(BstNode root) {
    if (root != null) {
      System.out.println(root.data);
      preorder(root.left);
      preorder(root.right);
    }
  }

  void postorderDisplay() {
    postorder(root);
  }

  private void postorder(BstNode root) {
    if (root != null) {
      postorder(root.left);
      postorder(root.right);
      System.out.println(root.data);
    }
  }

  public int getTreeHeight() {
    return getHeight(root);
  }

  int getHeight(BstNode root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }

  void levelOrderDisplay() {
    levelOrder(root);
  }

  private void levelOrder(BstNode root) {
    Queue<BstNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BstNode temp = queue.poll();
      System.out.println(temp.data);
      if (temp.left != null) {
        queue.add(temp.left);
      }
      if (temp.right != null) {
        queue.add(temp.right);
      }
    }
  }


  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.addNode(10);
    bst.addNode(15);
    bst.addNode(6);
    bst.addNode(4);
    bst.addNode(7);
    bst.addNode(13);
    bst.addNode(17);
   // bst.removeNode(10);
    System.out.println("Inorder\n");
    bst.inorderDisplay();
    System.out.println("Preorder\n");
    bst.preorderDisplay();
    System.out.println("PostOrder\n");
    bst.postorderDisplay();
    System.out.println("LevelOrder\n");
    bst.levelOrderDisplay();
    System.out.println("Height - " + bst.getTreeHeight());

  }
}
