package com.allaboutjava.basicconcepts.datastructure.queue.custom;

import java.util.Stack;

/**
 * This approach uses stack one for enqueue and stack 2 for dequeue but the performance remains same.
 * Here denqeue operation is costly.
 */
public class QueueUsingStacksApproach2 {

  int size;
  Stack<Object> s1;
  Stack<Object> s2;

  QueueUsingStacksApproach2() {
    this.size = 0;
    s1 = new Stack<Object>();
    s2 = new Stack<Object>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void enqueue(Object item) {
    s1.push(item);
    size++;
  }

  public void dequeue() {
    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }
    System.out.println("Item being popped - " + s2.pop());
    size--;
    while (!s2.isEmpty()) {
      s1.push(s2.pop());
    }
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
    QueueUsingStacksApproach2 queue = new QueueUsingStacksApproach2();
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
