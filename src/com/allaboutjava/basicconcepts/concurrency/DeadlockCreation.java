package com.allaboutjava.basicconcepts.concurrency;

public class DeadlockCreation {

  Object lock1 = new Object();
  Object lock2 = new Object();

  void method1() throws InterruptedException {
    synchronized (lock1) {
      System.out.println("Inside method1");
      synchronized (lock2) {
        display();
      }
    }
  }

  void method2() throws InterruptedException {
    synchronized (lock2) {
      System.out.println("Inside method2");
      synchronized (lock1) {
        display();
      }
    }
  }

  void display() {
    System.out.println("Inside display method");
  }

  public static void main(String[] args) throws InterruptedException {
    DeadlockCreation deadlockCreation = new DeadlockCreation();
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          deadlockCreation.method1();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          deadlockCreation.method2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Completed execution of all threads");
  }

}
