package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class SingleLinkedListNode {

  Object data;
  SingleLinkedListNode next;

  public SingleLinkedListNode(Object data) {
    this.data = data;
    next = null;
  }

  public SingleLinkedListNode getNext() {
    return next;
  }

  public void setNext(SingleLinkedListNode next) {
    this.next = next;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
