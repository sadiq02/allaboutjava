package com.allaboutjava.basicconcepts.datastructure.bst.custom;

public class BstNode {

  int value;
  BstNode left, right;

  public BstNode(int value) {
    this.value = value;
    left = right = null;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public BstNode getLeft() {
    return left;
  }

  public void setLeft(BstNode left) {
    this.left = left;
  }

  public BstNode getRight() {
    return right;
  }

  public void setRight(BstNode right) {
    this.right = right;
  }
}
