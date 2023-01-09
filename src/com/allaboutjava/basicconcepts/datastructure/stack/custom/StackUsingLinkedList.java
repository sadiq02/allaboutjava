package com.allaboutjava.basicconcepts.datastructure.stack.custom;

import com.allaboutjava.basicconcepts.datastructure.list.custom.SingleLinkedListNode;

public class StackUsingLinkedList {

  int size;
  SingleLinkedListNode head;

  StackUsingLinkedList() {
    this.size = 0;
    head = null;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int getCurrentSize() {
    return size;
  }

  public void push(Object data) {
    SingleLinkedListNode newNode = new SingleLinkedListNode(data);
    if (isEmpty()) {
      head = newNode;
      size++;
      return;
    }
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  public void display() {
    System.out.println("Stack content\n");
    SingleLinkedListNode temp = head;
    for (int i = 0; i < size; i++) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty, nothing to remove!");
      return;
    }
    System.out.println("Item popped : " + head.getData());
    head = head.getNext();
    size--;
  }

  public Object peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty, nothing to peek!");
      return null;
    }
    return head.getData();
  }

  public static void main(String[] args) {
    StackUsingLinkedList myStack = new StackUsingLinkedList();
    System.out.println("IsEmpty? : " + myStack.isEmpty());
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(55);
    System.out.println("Current size : " + myStack.size);
    myStack.display();
    System.out.println("Latest added item : " + myStack.peek());
    myStack.pop();
    myStack.pop();
    myStack.display();
    System.out.println("Current size - " + myStack.size);
  }

}
