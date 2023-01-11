package com.allaboutjava.basicconcepts.datastructure.stack.custom;

public class StackOperations {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(23);
		stack.push(45);
		stack.push(55);
		System.out.println("Is Stack Full? "+stack.isFull());
		System.out.println(stack.top);
		
		stack.pop();
		System.out.println(stack.top);
		System.out.println("Is Stack Empty? "+stack.isEmpty());
		System.out.println("Stack Size "+stack.maxSize);

	}

}
