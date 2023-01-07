package com.allaboutjava.basicconcepts.datastructure.queue.custom;

/**
 * Custom queue implementation
 */
public class CustomQueue {

  Object[] queueArray;
  int top;
  int rear;
  int capacity;

  public CustomQueue(int capacity) {
    this.capacity = capacity;
    top = rear = -1;
    queueArray = new Object[capacity];
  }

  public boolean isFull() {
    return (rear + 1) % capacity == top ? true : false;
  }

  public boolean isEmpty() {
    return top == -1 && rear == -1 ? true : false;
  }

  public void enqueue(Object value) {
    if (isFull()) {
      System.out.println("No place to add any new values!");
      return;
    }
    if (isEmpty()) {
      top = rear = 0;
    } else {
      rear = (rear + 1) % capacity;
    }
    queueArray[rear] = value;
    display();
  }

  public void dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty, nothing to remove!");
      return;
    }
    if (top == rear) {
      System.out.println(queueArray[top] + " - removed from the queue");
      top = rear = -1;
    } else {
      System.out.println(queueArray[top] + " - removed from the queue");
      top = (top + 1) % capacity;
    }
    display();
  }

  public void display() {
    if(isEmpty()){
      System.out.println("Queue is empty!!");
      return;
    }
    System.out.println("Queue content");
    for (int i = top; i <= rear; i++) {
      System.out.println(queueArray[i]);
    }
  }
}
