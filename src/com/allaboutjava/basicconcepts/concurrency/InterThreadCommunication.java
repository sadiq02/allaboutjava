package com.allaboutjava.basicconcepts.concurrency;

public class InterThreadCommunication {

  static Object lock = new Object();
  static int count = 0;
  static int max = 20;

  public static void main(String[] args) throws InterruptedException {
    Runnable printOddNumbers = new Runnable() {
      @Override
      public void run() {
        synchronized (lock) {
          while (count < max) {
            if (count % 2 != 0) {
              System.out.println(Thread.currentThread().getName() + " - " + count);
              count++;
              lock.notify();
              try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            } else {
              System.out.println(
                  Thread.currentThread().getName() + " - Waiting for other thread to release lock");
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
          }
        }
      }

    };

    Runnable printEvenNumbers = new Runnable() {
      @Override
      public void run() {
        synchronized (lock) {
          while (count < max) {
            if (count % 2 == 0) {
              System.out.println(Thread.currentThread().getName() + " - " + count);
              count++;
              lock.notify();
              try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            } else {
              System.out.println(
                  Thread.currentThread().getName() + " - Waiting for other thread to release lock");
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
          }
        }

      }
    };

    Thread t1 = new Thread(printEvenNumbers, "EvenNumbersPrintingThread");
    Thread t2 = new Thread(printOddNumbers, "OddNumbersPrintingThread");

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("All threads completed execution");
  }
}
