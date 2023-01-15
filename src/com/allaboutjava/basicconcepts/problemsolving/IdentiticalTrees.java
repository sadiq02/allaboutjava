package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class IdentiticalTrees {

  public boolean areIdentitcal(BstNode node1, BstNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }
    if (node1.getValue() == node2.getValue() && areIdentitcal(node1.getLeft(),
        node2.getLeft()) && areIdentitcal(node1.getRight(), node2.getRight())) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    BstOperations bst1 = new BstOperations();
    bst1.insertNode(5);
    bst1.insertNode(2);
    bst1.insertNode(6);
    bst1.insertNode(4);
    bst1.insertNode(9);
    bst1.insertNode(5);

    BstOperations bst2 = new BstOperations();
    bst2.insertNode(5);
    bst2.insertNode(2);
    bst2.insertNode(6);
    bst2.insertNode(4);
    bst2.insertNode(9);
    bst2.insertNode(5);

    BstOperations bst3 = new BstOperations();
    bst3.insertNode(5);
    bst3.insertNode(2);
    bst3.insertNode(66);
    bst3.insertNode(4);
    bst3.insertNode(9);
    bst3.insertNode(5);

    IdentiticalTrees identiticalTrees = new IdentiticalTrees();
    System.out.println(
        "Are bst1 and bst2 binary search trees identitcal ? : " + identiticalTrees.areIdentitcal(bst1.getRoot(),
            bst2.getRoot()));
    System.out.println(
        "Are bst1 and bst3 binary search trees identitcal ? : " + identiticalTrees.areIdentitcal(bst1.getRoot(),
            bst3.getRoot()));
  }
}
