package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class MirrorTree {

  public void mirror(BstNode node) {
    if (node == null) {
      return;
    }
    mirror(node.getLeft());
    mirror(node.getRight());

    BstNode temp = node.getLeft();
    node.setLeft(node.getRight());
    node.setRight(temp);
  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(5);
    bst.insertNode(2);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(9);
    bst.insertNode(5);
    System.out.println("Before Mirroring");
    bst.inOrderDisplay();
    MirrorTree mirrorTree = new MirrorTree();
    mirrorTree.mirror(bst.getRoot());
    System.out.println("After mirroring");
    bst.inOrderDisplay();
  }
}
