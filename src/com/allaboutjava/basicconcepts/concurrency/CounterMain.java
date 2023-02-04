package com.allaboutjava.basicconcepts.concurrency;

public class CounterMain {

  public static void main(String[] args) throws InterruptedException {
    Counter c1 = new Counter(0);
    Thread t1 = new Thread(c1, "Thread-1");
    Thread t2 = new Thread(c1, "Thread-2");
    Thread t3 = new Thread(c1, "Thread-3");
    Thread t4 = new Thread(c1, "Thread-4");
    Thread t5 = new Thread(c1, "Thread-5");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    t1.join();// without this, the sout statement on line 24 will not be printed at last. It may be printed anytime in between during execution of other threads.
    t2.join();// without this, the sout statement on line 24 will not be printed at last. It may be printed anytime in between during execution of other threads.
    t3.join();// without this, the sout statement on line 24 will not be printed at last. It may be printed anytime in between during execution of other threads.
    t4.join();// without this, the sout statement on line 24 will not be printed at last. It may be printed anytime in between during execution of other threads.
    t5.join();// without this, the sout statement on line 24 will not be printed at last. It may be printed anytime in between during execution of other threads.
    System.out.println("All threads completed execution");
  }

}
