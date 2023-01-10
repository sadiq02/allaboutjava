package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class FindBinarySearchTreeHeight {

  public int getHeight(BstNode root) {
    if (root == null) {
      return 0;
    }
    int leftTreeHeight = 0, rightTreeHeight = 0;
    if (root.getLeft() != null) {
      leftTreeHeight = getHeight(root.getLeft());
    }
    if (root.getRight() != null) {
      rightTreeHeight = getHeight(root.getRight());
    }
    return Math.max(leftTreeHeight, rightTreeHeight) + 1;
  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(5);
    bst.insertNode(2);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(9);
    bst.insertNode(5);
    FindBinarySearchTreeHeight findBinarySearchTreeHeight = new FindBinarySearchTreeHeight();
    System.out.println(
        "Current BST height : " + findBinarySearchTreeHeight.getHeight(bst.getRoot()));
  }

}
