package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class DoublyLinkedListNode {

  int data;
  DoublyLinkedListNode previous;
  DoublyLinkedListNode next;

  public DoublyLinkedListNode(int data) {
    this.data = data;
    this.previous = this.next = null;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public DoublyLinkedListNode getPrevious() {
    return previous;
  }

  public void setPrevious(
      DoublyLinkedListNode previous) {
    this.previous = previous;
  }

  public DoublyLinkedListNode getNext() {
    return next;
  }

  public void setNext(DoublyLinkedListNode next) {
    this.next = next;
  }
}
