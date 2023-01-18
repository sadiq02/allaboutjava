package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Scanner;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class CommonAncestorBetweenNodes {

  public BstNode getCommonAncestor(BstNode node, int key1, int key2) {
    if (node == null) {
      return node;
    }
    if (key1 < node.getValue() && key2 < node.getValue()) {
      return getCommonAncestor(node.getLeft(), key1, key2);
    }
    if (key1 > node.getValue() && key2 > node.getValue()) {
      return getCommonAncestor(node.getRight(), key1, key2);
    }
    return node;
  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    System.out.println("\nInorder display\n");
    bst.inOrderDisplay();

    System.out.println("Enter values of 2 nodes");
    Scanner scanner = new Scanner(System.in);
    int key1 = scanner.nextInt();
    int key2 = scanner.nextInt();
    CommonAncestorBetweenNodes commonAncestorBetweenNodes = new CommonAncestorBetweenNodes();
    System.out.println(
        "Common ancestor between given nodes - " + commonAncestorBetweenNodes.getCommonAncestor(
            bst.getRoot(), key1, key2).getValue());
  }

}
