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

  void add(int data) {
    LinkListNode newNode = new LinkListNode(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      newNode.next = head;
      head.previous = newNode;
      head = newNode;
    }
    size++;
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
    myLinkedList.add(10);
    myLinkedList.add(20);
    myLinkedList.add(30);
    myLinkedList.add(40);
    System.out.println("Original content");
    myLinkedList.display();
    System.out.println("After reversing");
    myLinkedList.reverse();
    myLinkedList.display();
    /*myLinkedList.remove(20);
    System.out.println("After removal of an element");
    myLinkedList.display();*/
  }
}
