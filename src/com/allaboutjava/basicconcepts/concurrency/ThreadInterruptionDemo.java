package com.allaboutjava.basicconcepts.concurrency;

public class ThreadInterruptionDemo {

  static void display() {
    for (int i = 0; i < 5; i++) {
      if (!Thread.currentThread().isInterrupted()) {
        System.out.println(i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException("Thread interrupted");
        }
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        display();
      }
    });

    t1.start();
    Thread.sleep(1000);
    t1.interrupt();
    t1.join();
    System.out.println("All threads completed execution");
  }

}
