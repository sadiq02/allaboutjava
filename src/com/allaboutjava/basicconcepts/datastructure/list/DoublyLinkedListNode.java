package com.allaboutjava.basicconcepts.datastructure.list;

public class DoublyLinkedListNode {

  int data;
  DoublyLinkedListNode previous;
  DoublyLinkedListNode next;

  public DoublyLinkedListNode(int data) {
    this.data = data;
    this.previous = this.next = null;
  }
}
