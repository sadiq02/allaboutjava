package com.allaboutjava.basicconcepts.misc;

public class ShutdownHooksDemo {

  public static void main(String[] args) {
    System.out.println("Hi There");
    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside shutdown hook");
      }
    }));

    System.out.println("Bye!");
  }
}
