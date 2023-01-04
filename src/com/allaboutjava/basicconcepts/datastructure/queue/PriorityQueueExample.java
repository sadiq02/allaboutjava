package com.allaboutjava.basicconcepts.datastructure.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args) {
    PriorityQueue priorityQueue = new PriorityQueue();
    priorityQueue.add("Sadiq");
    priorityQueue.add("Sadiq");
    priorityQueue.add("Sarine");
    priorityQueue.add("Danish");
    priorityQueue.add("Amara");
    priorityQueue.remove("Sadiq"); //removes only one occurence and NOT all
    System.out.println(priorityQueue);
  }
}
