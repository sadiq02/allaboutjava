package com.allaboutjava.basicconcepts.problemsolving;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class ConvertArrayToBst {

  public static void main(String[] args) {
    BstOperations bstOperations = new BstOperations();
    int a[] = {5, 7, 6, 8, 4};
    for (int i = 0; i < a.length; i++) {
      bstOperations.insertNode(a[i]);
    }
    bstOperations.inOrderDisplay();

  }
}
