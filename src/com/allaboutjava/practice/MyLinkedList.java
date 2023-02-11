package com.allaboutjava.practice;

public class MyLinkedList {

  static class LinkListNode {

    int data;
    LinkListNode next, previous;

    LinkListNode(int data) {
      this.data = data;
      next = null;
      previous = null;
    }
  }

  int size;
  LinkListNode head;

  public boolean isEmpty() {
    return size == 0;
  }

  public int getCurrentSize() {
    return size;
  }

  void addInTheBeginning(int data) {
    LinkListNode newNode = new LinkListNode(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      head.previous = newNode;
      newNode.next = head;
      head = newNode;
    }
    size++;
  }

  void remove(int data) {
    LinkListNode temp = head;
    if (isEmpty()) {
      System.out.println("Nothing to remove");
      return;
    }
    for (int i = 0; i < size; i++) {
      if (i == 0 && temp.data == data) {
        LinkListNode temp1 = head.next;
        temp1.previous = null;
        head = temp1;
        size--;
        break;
      }
      if (i == size - 1 && temp.data == data) {
        LinkListNode temp2 = temp.previous;
        temp.previous = null;
        size--;
        break;
      }
      if (temp.data == data) {
        LinkListNode prevPointer = temp.previous;
        LinkListNode nextPointer = temp.next;
        prevPointer.next = temp.next;
        nextPointer.previous = temp.next;
        temp.next = null;
        temp.previous = null;
        size--;
        break;
      } else {
        temp = temp.next;
      }
    }
  }

  public void display() {
    LinkListNode temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void reverse() {
    LinkListNode current = head;
    LinkListNode tempNext, tempPrevious = null;
    while (current != null) {
      tempNext = current.next;
      current.next = tempPrevious;
      tempPrevious = current;
      current = tempNext;
    }
    head = tempPrevious;
  }

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addInTheBeginning(10);
    myLinkedList.addInTheBeginning(20);
    myLinkedList.addInTheBeginning(30);
    myLinkedList.addInTheBeginning(40);
    System.out.println("Current head - " + myLinkedList.head.data);
    System.out.println("Original content");
    myLinkedList.display();
    myLinkedList.remove(20);
    System.out.println("After removal of an element");
    myLinkedList.display();
    System.out.println("After reversing");
    myLinkedList.reverse();
    myLinkedList.display();
  }
}
