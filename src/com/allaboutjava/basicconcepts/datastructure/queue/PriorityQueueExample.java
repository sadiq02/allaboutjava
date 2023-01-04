package com.allaboutjava.basicconcepts.datastructure.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args) {
    PriorityQueue priorityQueue = new PriorityQueue();
    priorityQueue.add("Raj");
    priorityQueue.add("Raj");
    priorityQueue.add("Amit");
    priorityQueue.add("Rahul");
    priorityQueue.add("Sham");
    priorityQueue.remove("Raj"); //removes only one occurence and NOT all
    System.out.println(priorityQueue);
  }
}
