package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class RemoveLeafNodes {

  BstOperations bstOperations = new BstOperations();

  public BstNode removeLeafNodes(BstNode node) {
    if (node == null) {
      return null;
    }
    if (node.getLeft() == null && node.getRight() == null) {
      bstOperations.removeNode(node.getValue());
      return null;

    }
    node.setLeft(removeLeafNodes(node.getLeft()));
    node.setRight(removeLeafNodes(node.getRight()));

    return node;
  }

  public static void main(String[] args) {
    RemoveLeafNodes removeLeafNodes = new RemoveLeafNodes();
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    bst.insertNode(13);
    bst.insertNode(17);
    System.out.println("\nInorder display before removal of leaf nodes\n");
    bst.inOrderDisplay();
    removeLeafNodes.removeLeafNodes(bst.getRoot());
    System.out.println("\nInorder display after removal of leaf nodes\n");
    bst.inOrderDisplay();

  }

}
