package com.allaboutjava.basicconcepts.datastructure.list.custom;

public class ReverseLinkedListMain {

  public static void main(String[] args) {

    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.addNodeAtTheEnd(1);
    doublyLinkedList.addNodeAtTheEnd(2);
    doublyLinkedList.addNodeAtTheEnd(3);
    doublyLinkedList.addNodeInTheBeginning(11);
    doublyLinkedList.addAfterGivenNode(44, new DoublyLinkedListNode(2));
    doublyLinkedList.beforeAGivenNode(55, new DoublyLinkedListNode(2));
    doublyLinkedList.addNodeInTheBeginning(66);
    doublyLinkedList.addNodeAtTheEnd(77);
    System.out.println("Before Reversing/n");
    doublyLinkedList.display();
    reverse(doublyLinkedList);
    System.out.println("After Reversing/n");
    doublyLinkedList.display();

  }

  static void reverse(DoublyLinkedList doublyLinkedList) {
    DoublyLinkedListNode current, next, previous = null;
    current = doublyLinkedList.getHead();
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    doublyLinkedList.head = previous;
  }
}
