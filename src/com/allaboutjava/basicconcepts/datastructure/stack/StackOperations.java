package com.allaboutjava.basicconcepts.datastructure.stack;

import java.util.Stack;

public class StackOperations {

  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.pop();
    System.out.println(s1.peek());
    System.out.println(s1);

  }
}
