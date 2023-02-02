package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashSet;
import java.util.Set;

import com.allaboutjava.basicconcepts.datastructure.list.custom.DoublyLinkedListNode;

public class DetectCycleInLinkedList {

  public static void main(String[] args) {
    DoublyLinkedListNode nodeOne = new DoublyLinkedListNode(1);
    DoublyLinkedListNode nodeTwo = new DoublyLinkedListNode(2);
    DoublyLinkedListNode nodeThree = new DoublyLinkedListNode(3);
    nodeOne.setNext(nodeTwo);
    nodeTwo.setPrevious(nodeOne);
    nodeTwo.setNext(nodeThree);
    nodeThree.setPrevious(nodeThree);
    nodeThree.setNext(nodeOne);

    System.out.println("Was there a loop detected ? - " + detectLoop(nodeOne));


  }

  private static boolean detectLoop(DoublyLinkedListNode nodeOne) {
    Set<DoublyLinkedListNode> set = new HashSet<>();
    DoublyLinkedListNode temp = nodeOne;
    while (temp != null) {
      if (set.contains(temp)) {
        System.out.println("Loop detected!");
        return true;
      } else {
        set.add(temp);
      }
      temp = temp.getNext();
    }
    return false;
  }

}
