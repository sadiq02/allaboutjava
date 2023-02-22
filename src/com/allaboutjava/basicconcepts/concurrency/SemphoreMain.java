package com.allaboutjava.basicconcepts.concurrency;

import java.util.concurrent.Semaphore;

public class SemphoreMain {

  Semaphore semaphore;
  int i = 0;

  SemphoreMain(Semaphore semaphore) {
    this.semaphore = semaphore;
  }

  void display() throws InterruptedException {
    semaphore.acquire();
    System.out.println("Inside display method - " + Thread.currentThread().getName());
    for (int k = 0; k < 5; k++) {
      System.out.println(i);
      i++;
      Thread.sleep(500); // to give control to other waiting threads
    }

    semaphore.release();
  }

  public static void main(String[] args) throws InterruptedException {
    Semaphore semaphore = new Semaphore(1);
    SemphoreMain semphoreMain = new SemphoreMain(semaphore);
    Thread t1 = new Thread(() -> {
      try {
        semphoreMain.display();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }, "t1");

    Thread t2 = new Thread(() -> {
      try {
        semphoreMain.display();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }, "t2");

    Thread t3 = new Thread(() -> {
      try {
        semphoreMain.display();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }, "t3");

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    System.out.println("All threads completed execution");
  }
}
