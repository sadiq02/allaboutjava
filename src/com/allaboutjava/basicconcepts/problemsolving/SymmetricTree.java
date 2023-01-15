package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class SymmetricTree {

  public boolean areSymmetric(BstNode node1, BstNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }
    if (node1.getValue() == node2.getValue() && areSymmetric(node1.getLeft(), node2.getRight())
        && areSymmetric(node1.getRight(), node2.getLeft())) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    BstNode tree1 = new BstNode(1);
    tree1.setLeft(new BstNode(2));
    tree1.setRight(new BstNode(2));

    BstNode tree2 = new BstNode(1);
    tree2.setLeft(new BstNode(2));
    tree2.setRight(new BstNode(3));

    SymmetricTree symmetricTree = new SymmetricTree();
    System.out.println(
        "Is given tree 'tree1'  symmetric ? : " + symmetricTree.areSymmetric(tree1, tree1));
    System.out.println(
        "Is given tree 'tree2'  symmetric ? : " + symmetricTree.areSymmetric(tree2, tree2));
  }
}
