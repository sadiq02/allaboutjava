package com.allaboutjava.basicconcepts.datastructure.bst.custom;

public class BstLevelOrderTraversalMain {

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    bst.insertNode(13);
    bst.insertNode(17);
    bst.levelOrderTraversal(bst.getRoot());
  }
}
