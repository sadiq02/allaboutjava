package com.allaboutjava.basicconcepts.datastructure.bst;

public class BstNode {

  int value;
  BstNode left, right;

  public BstNode(int value) {
    this.value = value;
    left = right = null;
  }
}
