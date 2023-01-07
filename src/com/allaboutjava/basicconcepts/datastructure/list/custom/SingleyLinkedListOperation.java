package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class SingleyLinkedListOperation {

  public static void main(String[] args) {
    SingleyLinkedList list = new SingleyLinkedList();
    System.out.println("isEmpty? : " + list.isEmpty());
    list.addNode(1);
    list.addNode(2);
    list.addNode(3);
    list.addNodeAtIndex(4,3);
    list.display();
    System.out.println("Current size - " + list.getSize());
  }
}
