package com.allaboutjava.basicconcepts.datastructure.queue.custom;

import java.util.Stack;

/**
 * This approach used stack1 for enqueue and dequeue oepration but performance remains same as that of another approach.
 * Here enqeue operation is costly.
 */
public class QueueUsingStacksApproach1 {

  int size;
  Stack<Object> s1;
  Stack<Object> s2;

  QueueUsingStacksApproach1() {
    this.size = 0;
    s1 = new Stack<Object>();
    s2 = new Stack<Object>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void enqueue(Object item) {
    while (!s1.empty()) {
      s2.push(s1.pop());
    }
    s1.push(item);
    size++;
    while (!s2.isEmpty()) {
      s1.push(s2.pop());
    }
  }

  public void dequeue() {
    if (s1.isEmpty()) {
      System.out.println("Nothing to pop!");
      System.exit(0);
    }
    System.out.println("Topmost element currently - "+s1.peek());
    System.out.println("Popped : " + s1.pop());

    size--;
  }

  public int getSize() {
    return size;
  }

  public void display() {
    for (Object temp : s1) {
      System.out.println(temp);
    }
  }

  public static void main(String[] args) {
    QueueUsingStacksApproach1 queue = new QueueUsingStacksApproach1();
    System.out.println("IsEmpty? : " + queue.isEmpty());
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    System.out.println("Queue size : " + queue.getSize());
    queue.dequeue();
    queue.display();
    queue.enqueue(5);
    queue.dequeue();
    queue.display();
  }
}
