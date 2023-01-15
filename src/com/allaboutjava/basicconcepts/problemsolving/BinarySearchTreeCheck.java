package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;

public class BinarySearchTreeCheck {

  public boolean isBinarySearchTree(BstNode node) {
    if (node.getLeft() == null && node.getRight() == null) {
      return true;
    }
    if ((node.getLeft() != null && node.getLeft().getValue() < node.getValue() && (
        node.getRight() != null && node.getRight().getValue() > node.getValue()))) {
      return isBinarySearchTree(node.getLeft()) && isBinarySearchTree(node.getRight());

    }
    return false;
  }

  public static void main(String[] args) {
    BinarySearchTreeCheck binarySearchTreeCheck = new BinarySearchTreeCheck();
    BstNode node = new BstNode(101);
    BstNode firstLeftNode = new BstNode(8);
    BstNode firstRightNode = new BstNode(18);
    node.setLeft(firstLeftNode);
    node.setRight(firstRightNode);
    System.out.println(
        "Is given tree a binary search tree? : " + binarySearchTreeCheck.isBinarySearchTree(node));

    BstNode node1 = new BstNode(10);
    BstNode firstLeftNode1 = new BstNode(8);
    BstNode leftNodeForFirstLeftNode = new BstNode(6);
    BstNode rightNodeForFirstLeftNode = new BstNode(9);
    firstLeftNode1.setLeft(leftNodeForFirstLeftNode);
    firstLeftNode1.setRight(rightNodeForFirstLeftNode);
    BstNode leftNodeForFirstRightNode = new BstNode(16);
    BstNode rightNodeForFirstRightNode = new BstNode(19);
    BstNode firstRightNode1 = new BstNode(18);
    firstRightNode1.setLeft(leftNodeForFirstRightNode);
    firstRightNode1.setRight(rightNodeForFirstRightNode);
    node1.setLeft(firstLeftNode1);
    node1.setRight(firstRightNode1);
    System.out.println(
        "Is given tree a binary search tree? : " + binarySearchTreeCheck.isBinarySearchTree(node1));
  }
}
