package com.allaboutjava.basicconcepts.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableUsage {

  static Callable<String> callable = new Callable<String>() {
    @Override
    public String call() throws Exception {
      return "Hi there from callable";
    }
  };

  public static void main(String[] args) throws Exception {
    //calling directly
    CallableUsage callableUsage = new CallableUsage();
    System.out.println(callableUsage.callable.call());

    //calling via executor framework
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String> future = executorService.submit(callable);
    System.out.println(future.get());
  }

}
