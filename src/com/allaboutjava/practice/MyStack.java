package com.allaboutjava.practice;

public class MyStack {

  Object[] stack;
  int size;
  int top;

  MyStack(int size) {
    stack = new Object[size];
    this.size = size;
    top = -1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == size - 1;
  }

  void push(int data) {
    if (isFull()) {
      System.out.println("Stack overflowing!");
      return;
    }
    top++;
    stack[top] = data;
  }

  void pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty, nothing to pop!");
      return;
    }
    System.out.println("element popped - " + stack[top]);
    top--;
  }

  void display() {
    for (int i = 0; i < stack.length; i++) {
      System.out.println(stack[i]);
    }
  }

  public static void main(String[] args) {
    MyStack myStack = new MyStack(3);
    myStack.pop();
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.push(40);
    System.out.println("IsFull ? - " + myStack.isFull());
    System.out.println("Stack content\n");
    myStack.display();
  }

}
