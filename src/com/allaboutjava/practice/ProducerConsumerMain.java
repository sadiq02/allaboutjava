package com.allaboutjava.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerMain {

  int limit;
  LinkedList<Integer> commonnList;
  Object lock;
  int i = 0;

  ProducerConsumerMain(int limit) {
    this.limit = limit;
    commonnList = new LinkedList<>();
    lock = new Object();
  }

  void produce() throws InterruptedException {
    synchronized (lock) {
      while (i<50) {
        if (commonnList.size() == limit) {
          System.out.println("List is full, waiting for consumer thread to consume");
          lock.wait();
        }
        commonnList.add(i);
        System.out.println("Producer produced - " + i);
        i++;
        lock.notify();
        //Thread.sleep(2000);
      }
    }
  }

  void consume() throws InterruptedException {
    synchronized (lock) {
      while (true) {
        if (commonnList.isEmpty()) {
          System.out.println("List is empty, nothing to consume. Waiting for producer to produce!");
          lock.wait();
        }
        System.out.println("Consumer consumed - " + commonnList.removeFirst());
        lock.notify();
       // Thread.sleep(2000);

      }
    }
  }

  public static void main(String[] args) {
    ProducerConsumerMain producerConsumerMain = new ProducerConsumerMain(2);
    Thread producer = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          producerConsumerMain.produce();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread consumer = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          producerConsumerMain.consume();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    producer.start();
    consumer.start();
  }

}
