package com.allaboutjava.basicconcepts.concurrency;

import java.util.LinkedList;

public class ProducerConsumer {

  static LinkedList<Integer> list = new LinkedList<>();
  static int capacity = 2;
  static Object lock = new Object();


  public static void main(String[] args) throws InterruptedException {
    Runnable producer = new Runnable() {
      @Override
      public void run() {
        int value = 0;
        while (true) {
          synchronized (lock) {

            if (list.size() == capacity) {
              System.out.println("List is full currently, so waiting!");
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
              System.out.println("Produced - " + value);
              value++;
              list.add(value);
              lock.notify();
            try {
              Thread.sleep(300);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }

          }
        }
      }
    };

    Runnable consumer = new Runnable() {
      @Override
      public void run() {
        while (true) {
          synchronized (lock) {
            if (list.isEmpty()) {
              System.out.println("List is empty currently, so waiting!");
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            } else {
              System.out.println("Consumed - " + list.removeFirst());
              lock.notify();
              try {
                Thread.sleep(300);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
          }
        }
      }
    };

    Thread p = new Thread(producer, "producer_thread");
    Thread c = new Thread(consumer, "consumer_thread");

    p.start();
    c.start();

    p.join();
    c.join();
    System.out.println("All threads finished execution");
  }

}
