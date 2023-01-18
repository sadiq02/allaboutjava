package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class FindMinAndMaxInBst {

  public int getMin(BstNode node) {

    if (node.getLeft() == null) {
      return node.getValue();

    }
    return getMin(node.getLeft());
  }

  public int getMax(BstNode node) {

    if (node.getRight() == null) {
      return node.getValue();

    }
    return getMax(node.getRight());


  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    bst.insertNode(77);
    bst.insertNode(0);

    FindMinAndMaxInBst findMinAndMaxInBst = new FindMinAndMaxInBst();
    System.out.println("Minimum value in the BST - " + findMinAndMaxInBst.getMin(bst.getRoot()));
    System.out.println("Maximum value in the BST - " + findMinAndMaxInBst.getMax(bst.getRoot()));
  }
}
