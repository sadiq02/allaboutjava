package com.allaboutjava.practice;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class BinaryTreeHeight {

  static int getHeight(BstNode root) {
    if (root == null) {
      return 1;
    }
    int leftSubtreeHeight = 0, rightSubtreeHeight = 0;
    if (root.getLeft() != null) {
      leftSubtreeHeight = getHeight(root.getLeft());
    }
    if (root.getRight() != null) {
      rightSubtreeHeight = getHeight(root.getRight());
    }

    return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;

  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(5);
    bst.insertNode(2);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(9);
    bst.insertNode(5);
    System.out.println("Height of the tree -  " + getHeight(bst.getRoot()));
  }
}
