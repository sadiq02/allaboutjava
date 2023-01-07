package com.allaboutjava.basicconcepts.datastructure.queue.custom;

/**
 * Basic operations with custom queue
 */
public class CustomQueueOperations {

  public static void main(String[] args) {
    CustomQueue customQueue = new CustomQueue(3);
    System.out.println("isEmpty? : " + customQueue.isEmpty());
    System.out.println("isFull? : " + customQueue.isFull());
    customQueue.enqueue(1);
    customQueue.enqueue(2);
    customQueue.enqueue(3);
    customQueue.enqueue(4);
    customQueue.display();
    System.out.println("isFull? : " + customQueue.isFull());
    customQueue.dequeue();
    customQueue.dequeue();
    customQueue.dequeue();
  }

}
