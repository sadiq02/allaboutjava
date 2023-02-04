package com.allaboutjava.basicconcepts.concurrency;

//Even though each method is called upon separate objects, the lock is common because its a static lock
public class StaticLock {

  public static void method1() throws InterruptedException {
    synchronized (StaticLock.class) {
      System.out.println("I am inside method1 - " + Thread.currentThread().getName());
      Thread.sleep(300);
    }
  }

  public static void method2() throws InterruptedException {
    synchronized (StaticLock.class) {
      System.out.println("I am inside method2 - " + Thread.currentThread().getName());
      Thread.sleep(300);
    }
  }

  public static void method3() throws InterruptedException {
    synchronized (StaticLock.class) {
      System.out.println("I am inside method3 - " + Thread.currentThread().getName());
      Thread.sleep(300);
    }
  }

  public static void main(String[] args) {
    StaticLock staticLock1 = new StaticLock();
    StaticLock staticLock2 = new StaticLock();
    StaticLock staticLock3 = new StaticLock();
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          staticLock1.method1();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }, "Thread-1");

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          staticLock2.method2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }, "Thread-2");

    Thread t3 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          staticLock3.method3();
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
