package com.allaboutjava.basicconcepts.datastructure.list.custom;

import java.util.Scanner;

/**
 * Performing basic operations using the custom array list
 */
public class CustomArrayListOperations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = scanner.nextInt();
    CustomArrayList customArrayList = new CustomArrayList(size);
    System.out.println("Enter values");
    for(int i=0;i<size;i++){
      customArrayList.add(scanner.next());
    }
    System.out.println("Enter the index of the item to be removed");
    int index = scanner.nextInt();
    customArrayList.removeAtIndex(index);

    System.out.println("Enter item to be removed");
    customArrayList.removeItem(scanner.next());




  }
}
