package com.allaboutjava.practice;

public class SingleyLinkedList {

  static class SingleLinkedListNode {

    int data;
    SingleLinkedListNode next;

    SingleLinkedListNode(int data) {
      this.data = data;
      next = null;
    }
  }

  SingleLinkedListNode root;
  int size;

  public boolean isEmpty() {
    return size == 0;

  }

  public void addNode(int data) {
    SingleLinkedListNode newNode = new SingleLinkedListNode(data);
    if (isEmpty()) {
      root = newNode;
      size++;
      return;
    }
    SingleLinkedListNode tmp = root;
    while (tmp.next != null) {
      tmp = tmp.next;
    }
    tmp.next = newNode;
    size++;
  }

  public void addNodeAtIndex(int data, int index) {
    SingleLinkedListNode newNode = new SingleLinkedListNode(data);
    SingleLinkedListNode temp = root, prev = root, next = root;
    if (index + 1 > size) {
      System.out.println("Index out of bound!");
      return;
    }
    if (index == 0) {
      newNode.next = root;
      root = newNode;
      size++;
      return;
    }
    for (int i = 0; i < size; i++) {
      if (index == i) {
        prev.next = newNode;
        newNode.next = temp;
        break;
      } else {
        prev = temp;
        temp = temp.next;
      }
    }
    size++;

  }

  public void deleteNode(int data) {
    if (isEmpty()) {
      System.out.println("nothing to delete\n");
      return;
    }
    if (root.data == data) {
      root = root.next;
      size--;
      System.out.println(data + " - deleted\n");
      return;
    }
    if (size == 1) {
      System.out.println(data + " - deleted\n");
      root = null;
      size = 0;
      return;
    }
    SingleLinkedListNode temp = root;
    SingleLinkedListNode previos = temp;
    SingleLinkedListNode next = temp;
    while (temp != null) {
      if (temp.data == data) {
        next = temp.next;
        temp = null;
        break;
      } else {
        previos = temp;
        temp = temp.next;
      }
    }
    previos.next = next;
    size--;
    System.out.println(data + " - deleted\n");
  }

  public void display() {
    if (size > 0) {
      System.out.println("List content\n");
      SingleLinkedListNode temp = root;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    } else {
      System.out.println("Nothing to show, list is empty\n");
    }
  }

  public static void main(String[] args) {
    SingleyLinkedList singleyLinkedList = new SingleyLinkedList();
    System.out.println("IsEmpty ? : " + singleyLinkedList.isEmpty());
    singleyLinkedList.addNode(10);
    singleyLinkedList.addNode(20);
    singleyLinkedList.addNode(30);
    singleyLinkedList.addNode(40);
    singleyLinkedList.deleteNode(20);
    singleyLinkedList.display();
    singleyLinkedList.deleteNode(40);
    singleyLinkedList.display();
    System.out.println("Current list size - " + singleyLinkedList.size);
    singleyLinkedList.addNode(20);
    singleyLinkedList.addNode(40);
    singleyLinkedList.addNodeAtIndex(50,2);
    singleyLinkedList.display();
    System.out.println("Current list size - " + singleyLinkedList.size);
  }
}
