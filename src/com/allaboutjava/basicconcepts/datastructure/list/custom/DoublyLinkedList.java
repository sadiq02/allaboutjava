package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class DoublyLinkedList {

  DoublyLinkedListNode head;
  int size;

  public DoublyLinkedList() {
    size = 0;
    this.head = null;
  }

  public DoublyLinkedListNode getHead(){
    return head;
  }
  public boolean isEmpty() {
    return head == null;
  }

  public void addNodeAtTheEnd(int data) {
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    if (isEmpty()) {
      head = newNode;
      size++;
      return;
    }
    DoublyLinkedListNode temp = head;
    for (int i = 0; i < size - 1; i++) {
      temp = temp.next;
    }
    temp.next = newNode;
    newNode.previous = temp;
    size++;
  }

  public void addNodeInTheBeginning(int data) {
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    if (isEmpty()) {
      head = newNode;
      size++;
      return;
    }
    head.previous = newNode;
    newNode.next = head;
    head = newNode;
    size++;
  }

  public void addAfterGivenNode(int data, DoublyLinkedListNode givenNode) {
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    DoublyLinkedListNode tempNode = head;
    for (int i = 0; i < size; i++) {
      if (tempNode.data == givenNode.data) {
        //reassign new node addresses
        newNode.previous = tempNode;
        newNode.next = tempNode.next;

        DoublyLinkedListNode newNext = tempNode.next;
        //reassign 'previous' pointer of next node
        newNext.previous = newNode;
        //reassign 'next' pointer of next node to newly added node
        tempNode.next = newNode;
        size++;
        break;
      } else {
        tempNode = tempNode.next;
      }
    }
  }

  public void beforeAGivenNode(int data, DoublyLinkedListNode givenNode) {
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    DoublyLinkedListNode tempNode = head;
    DoublyLinkedListNode previousNodePointer = null;
    for (int i = 0; i < size; i++) {
      if (tempNode.data == givenNode.data) {
        newNode.next = tempNode;
        tempNode.previous = newNode;
        newNode.previous = previousNodePointer;
        previousNodePointer.next = newNode;
        size++;
        break;
      } else {
        previousNodePointer = tempNode;
        tempNode = tempNode.next;
      }
    }
  }

  public void deleteNode(int data) {
    DoublyLinkedListNode nodeToBeDeleted = new DoublyLinkedListNode(data);
    DoublyLinkedListNode tempNode = head;
    for (int i = 0; i < size; i++) {
      if (i == 0 && tempNode.data
          == data) { //check if its the first node in the list that is to be removed
        head = head.next;
        size--;
        break;
      }
      if (tempNode.data == data
          && tempNode.next == null) { //check if its the last node in the list that is to be removed
        DoublyLinkedListNode lastNode = tempNode.previous;
        lastNode.next = null;
        size--;
        break;
      }
      if (tempNode.data == data) { //if its not head or tail node in the list

        DoublyLinkedListNode nextNodePointer = tempNode.next;
        DoublyLinkedListNode previousNodePointer = tempNode.previous;
        //reassign 'next' pointer of previous node
        previousNodePointer.next = tempNode.next;

        //reassign 'previous' pointer of next node
        nextNodePointer.previous = tempNode.next;

        //reassign node to be deleted addresses to null
        tempNode.next = null;
        tempNode.previous = null;
        size--;
        break;
      } else {
        tempNode = tempNode.next;
      }
    }
  }

  public int getHeadNodeValue() {
    return head.data;
  }

  public void display() {
    DoublyLinkedListNode temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

}
