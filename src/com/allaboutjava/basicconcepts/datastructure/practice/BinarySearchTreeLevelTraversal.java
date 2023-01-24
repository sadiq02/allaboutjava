package com.allaboutjava.basicconcepts.datastructure.practice;

import java.util.LinkedList;
import java.util.Queue;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class BinarySearchTreeLevelTraversal {

  void levelTraversal(BstNode node) {
    if (node == null) {
      return;
    }
    Queue<BstNode> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      BstNode current = queue.poll();
      System.out.println(current.getValue());

      if (current.getLeft() != null) {
        queue.add(current.getLeft());
      }

      if (current.getRight() != null) {
        queue.add(current.getRight());
      }
    }
  }

  public static void main(String[] args) {
    BinarySearchTreeLevelTraversal binarySearchTreeLevelTraversal = new BinarySearchTreeLevelTraversal();

    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    bst.insertNode(13);
    bst.insertNode(17);
    System.out.println("Level Order Traversal\n");
    binarySearchTreeLevelTraversal.levelTraversal(bst.getRoot());
  }
}
