package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class SingleyLinkedList {

  SingleLinkedListNode head;
  int size;

  public SingleyLinkedList() {
    head = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void addNode(int data) {
    SingleLinkedListNode newNode = new SingleLinkedListNode(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      SingleLinkedListNode temp = head;
      for (int i = 0; i < size - 1; i++) { //size -1 because we want to get to the last node
        temp = temp.next;
      }
      temp.next = newNode;
    }
    size++;
  }

  public void addNodeAtIndex(int data, int index) {
    if (index > size) {
      System.out.println("Out of index!");
      System.out.println("Operation to add  - " + data + " failed!");
      return;
    }
    SingleLinkedListNode newNode = new SingleLinkedListNode(data);
    if (index == 0) {
      if (isEmpty()) {
        head = newNode;
        size++;
      } else {
        newNode.next = head;
        head = newNode;
        size++;
      }
    } else {
      SingleLinkedListNode newNextNode = head; //to track next node
      SingleLinkedListNode previousNode = newNextNode; // to track previous node
      //Very important: We keep 2 pointers to track the previous and the next node since this is singley linked list.
      for (int i = 0; i < index; i++) {
        previousNode = newNextNode;
        newNextNode = newNextNode.next;
      }
      previousNode.next = newNode;
      newNode.next = newNextNode;
      size++;
    }
  }

  public int getSize() {
    return size;
  }

  public void display() {
    System.out.println("Linked list content");
    SingleLinkedListNode temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
