package com.allaboutjava.basicconcepts.datastructure.stack.custom;

public class Stack {
	int top;
	int maxSize;
	long[] stackArray;

	public Stack(int size) {
		top = -1;
		maxSize = size;
		stackArray = new long[maxSize];
	}

	public void push(long element) {
		if(isFull()){
			System.out.println("Stack Overflow! No more elements not be pushed to stack");
			return;
		}
		stackArray[++top] = element;
		System.out.println("Item "+element+" is pushed at "+top);
	}

	public long pop() {
		if(isEmpty()){
			System.out.println("Stack Underflow! No elements in the stack to pop out!");
		}
		long poppedElement = stackArray[top--];
		System.out.println("Element popped out of stack is "+poppedElement);
		return poppedElement;
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == (maxSize - 1));
	}
}
