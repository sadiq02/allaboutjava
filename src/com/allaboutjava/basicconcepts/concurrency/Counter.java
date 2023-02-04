package com.allaboutjava.basicconcepts.concurrency;

public class Counter implements Runnable {

  static int counter = 0;

  public Counter(int counter) {
    this.counter = counter;
  }


  @Override
  public void run() {
    synchronized (this) { //without this, the printing will not be in order.
      for (int i = 0; i < 10; i++) {
        counter++;
        System.out.println(Thread.currentThread().getName() + " - " + counter);
      }
    }
  }
}
