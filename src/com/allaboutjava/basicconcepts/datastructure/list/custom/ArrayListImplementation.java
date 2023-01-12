package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class ArrayListImplementation {

  int capacity = -1;
  int a[];
  int index;

  public ArrayListImplementation(int capacity) {

    super();
    System.out.println("Empty? - " + isEmpty());
    this.capacity = capacity;
    this.a = new int[capacity];
    index = 0;
  }

  private void add(int i) {
    if (index == (capacity - 1)) {
      increaseArrayListSize();
    } else {
      a[index] = i;
      index++;
    }
  }

  private void increaseArrayListSize() {
    capacity = capacity + (capacity / 2);
    int newa[] = new int[capacity];
    for (int i = 0; i < a.length; i++) {
      newa[i] = a[i];
    }
    a = newa;
  }

  private void removeElement(int elementIndex) {
    if (capacity == -1) {
      System.out.println("Nothing to remove");
    } else if (elementIndex >= capacity) {
      System.out.println("index out of range");
    }
    for (int i = elementIndex; i < a.length - 1; i++) {
      // if(a[i]==element){
      // a[i]=0;
      a[i] = a[i + 1];
    }
    index--;

  }

  private int get(int elementIndex) {
    return a[elementIndex];
  }

  private boolean isEmpty() {
    return capacity == -1;
  }

  private boolean isFull() {
    return capacity == (a.length - 1);
  }

  public static void main(String[] args) {
    ArrayListImplementation a1 = new ArrayListImplementation(4);
    System.out.println("Empty? - " + a1.isEmpty());
    a1.add(1);
    a1.add(2);
    a1.add(3);
    a1.add(4);
    a1.add(5);
    System.out.println(a1.isFull());
    System.out.println("Element retrieved - " + a1.get(0));
		for (int i = 0; i < a1.a.length; i++) {
			System.out.println(a1.a[i]);
		}

    System.out.println("Arraylist length - " + a1.a.length);
  }

}
