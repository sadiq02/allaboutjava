package com.allaboutjava.basicconcepts.datastructure.list;

public class DoublyLinkedListMain {

  public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    System.out.println("isEmpty? : " + doublyLinkedList.isEmpty());
    doublyLinkedList.addNodeAtTheEnd(1);
    doublyLinkedList.addNodeAtTheEnd(2);
    doublyLinkedList.addNodeAtTheEnd(3);
    doublyLinkedList.addNodeInTheBeginning(11);
    doublyLinkedList.addAfterGivenNode(44, new DoublyLinkedListNode(2));
    doublyLinkedList.beforeAGivenNode(55, new DoublyLinkedListNode(2));
    //delete the head node
    doublyLinkedList.deleteNode(11);
    doublyLinkedList.deleteNode(55);
    doublyLinkedList.addNodeInTheBeginning(66);
    doublyLinkedList.addNodeAtTheEnd(77);
    doublyLinkedList.display();
    System.out.println("list size - " + doublyLinkedList.size);
    System.out.println("Current head node - " + doublyLinkedList.getHeadNodeValue());/**/
  }
}
