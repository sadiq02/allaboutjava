package com.allaboutjava.basicconcepts.datastructure.list.custom;

/**
 * Custom array list implementation
 */
public class CustomArrayList {

  int capacity;
  Object[] array;
  int index;

  CustomArrayList(int capacity) {
    this.capacity = capacity;
    index = 0;
    array = new Object[capacity];
  }

  public void add(Object value) {
    if (index == capacity - 1) {
      createBiggerArray();
      array[index] = value;
      index++;
    } else {
      array[index] = value;
      index++;
    }
    System.out.println(value + " - added to the array");
  }


  private void createBiggerArray() {
    System.out.println(
        "Current capacity of arraylist exhausted, creating a new and bigger arraylist");
    capacity = capacity * 2;
    Object[] newArray = new Object[capacity];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
  }

  public void removeAtIndex(int givenIndex) {
    if (givenIndex > capacity) {
      System.out.println("Index is outside the current size of arraylist");
      return;
    } else {
      System.out.println(array[givenIndex] + " - value to be removed from arraylist ");
      for (int i = 0; i < array.length - givenIndex - 1; i++) {
        array[i + givenIndex] = array[i + givenIndex + 1];
      }
    }

    System.out.println("Content of array list post remove operation");
    display();
  }

  public void removeItem(Object value) {
    for (int i = 0; i < index; i++) {
      if (array[i] != null && array[i].equals(value)) {
        System.out.println(value + " - to be removed from array");
        for (int j = i; j < array.length - i - 1; j++) {
          array[j] = array[j + 1];
        }
      }
    }
    System.out.println("Content of array list post remove operation");
    display();
  }

  public void display() {
    for (Object obj : array) {
      if(obj!=null)
      System.out.println(obj);
    }
  }

}
