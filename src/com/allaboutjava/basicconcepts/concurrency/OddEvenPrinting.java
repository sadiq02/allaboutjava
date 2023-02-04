package com.allaboutjava.basicconcepts.concurrency;

public class OddEvenPrinting {

  public static void main(String[] args) throws InterruptedException {
    Runnable printOddNumbers = new Runnable() {
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

    Runnable printEvenNumbers = new Runnable() {
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

    Thread thread1 = new Thread(printOddNumbers);
    Thread thread2 = new Thread(printEvenNumbers);
    System.out.println("Thread-1 will print odd numbers");
    System.out.println("Thread-2 will print even numbers");
    thread1.setName("Thread-1");
    thread2.setName("Thread-2");

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
    System.out.println("All threads completed execution");
  }

}
