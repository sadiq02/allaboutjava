package com.allaboutjava.basicconcepts.concurrency;

//Three non static methods called on 3 different objects so there they all run parallely even thought there is a synchronized block (obviously)!
public class NonStaticLock {

  public void method1() throws InterruptedException {
    synchronized (this) {
      System.out.println("I am inside method1 - " + Thread.currentThread().getName());
      Thread.sleep(3000);
    }
  }

  public void method2() throws InterruptedException {
    synchronized (this) {
      System.out.println("I am inside method2 - " + Thread.currentThread().getName());
      Thread.sleep(3000);
    }
  }

  public void method3() throws InterruptedException {
    synchronized (this) {
      System.out.println("I am inside method3 - " + Thread.currentThread().getName());
      Thread.sleep(3000);
    }
  }

  public static void main(String[] args) {
    NonStaticLock nonStaticLock1 = new NonStaticLock();
    NonStaticLock nonStaticLock2 = new NonStaticLock();
    NonStaticLock nonStaticLock3 = new NonStaticLock();
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          nonStaticLock1.method1();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }, "Thread-1");

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          nonStaticLock2.method2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }, "Thread-2");

    Thread t3 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          nonStaticLock3.method3();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }, "Thread-3");

    t1.start();
    t2.start();
    t3.start();
  }


}
