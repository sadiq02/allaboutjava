package com.allaboutjava.basicconcepts.concurrency;

public class MultiThreadDemo {

  public static void main(String[] args) throws InterruptedException {
    Runnable t1 = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 20; i++) {
          if (i % 2 != 0) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
          }
          try {
            Thread.sleep(200);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };

    Runnable t2 = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 20; i++) {
          if (i % 2 == 0) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
          }
          try {
            Thread.sleep(200);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };

    Thread thread1 = new Thread(t1);
    Thread thread2 = new Thread(t2);
    thread1.setName("Thread-1");
    thread2.setName("Thread-2");

    thread1.start();
    thread2.start();

    thread2.join();
    thread1.join();
    System.out.println("All threads completed execution");
  }

}
