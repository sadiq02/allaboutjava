package com.allaboutjava.basicconcepts.datastructure.bst;

public class BstTraversalMain {

  public static void main(String[] args) {
    BstOperations bstNodeTraversal = new BstOperations();
    bstNodeTraversal.insertNode(10);
    bstNodeTraversal.insertNode(15);
    bstNodeTraversal.insertNode(6);
    bstNodeTraversal.insertNode(4);
    bstNodeTraversal.insertNode(7);
    bstNodeTraversal.insertNode(13);
    bstNodeTraversal.insertNode(17);
    System.out.println("\n****Inorder Display****");
    bstNodeTraversal.inOrderDisplay();
    System.out.println("\n****PreOrder Display****");
    bstNodeTraversal.preOrderDisplay();
    System.out.println("\n****Postorder Display****");
    bstNodeTraversal.postOrderDisplay();
  }
}
