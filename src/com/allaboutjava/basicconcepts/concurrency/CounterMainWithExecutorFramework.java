package com.allaboutjava.basicconcepts.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterMainWithExecutorFramework {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    Counter c1 = new Counter(0);
    Thread t1 = new Thread(c1, "Thread-1");
    Thread t2 = new Thread(c1, "Thread-2");
    Thread t3 = new Thread(c1, "Thread-3");
    Thread t4 = new Thread(c1, "Thread-4");
    Thread t5 = new Thread(c1, "Thread-5");

    executorService.submit(t1);
    executorService.submit(t2);
    executorService.submit(t3);
    executorService.submit(t4);
    executorService.submit(t5);

    executorService.shutdownNow(); //without this statement, the sout statment on line 25 will not be printed at last. It may be printed anytime in between during execution of other threads.

    System.out.println("All threads completed execution");
  }

}
