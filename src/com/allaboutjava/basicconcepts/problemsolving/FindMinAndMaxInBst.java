package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Scanner;
import java.util.TreeSet;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class FindMinAndMaxInBst {

  TreeSet<Integer> minValueSet = new TreeSet<>();
  TreeSet<Integer> maxValueSet = new TreeSet<>();

  public int getMin(BstNode node) {

    if (node.getLeft() == null) {
      return node.getValue();

    }
    minValueSet.add(node.getValue());
    return getMin(node.getLeft());
  }

  public int getMax(BstNode node) {

    if (node.getRight() == null) {
      return node.getValue();

    }
    maxValueSet.add(node.getValue());
    return getMax(node.getRight());


  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);
    bst.insertNode(77);
    bst.insertNode(0);

    FindMinAndMaxInBst findMinAndMaxInBst = new FindMinAndMaxInBst();
    System.out.println("Minimum value in the BST - " + findMinAndMaxInBst.getMin(bst.getRoot()));
    System.out.println("Maximum value in the BST - " + findMinAndMaxInBst.getMax(bst.getRoot()));
    System.out.println("Minimun values set content - " + findMinAndMaxInBst.minValueSet);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the k value for minimun search");
    int k = scan.nextInt();
    int i = 0;
    for (int temp : findMinAndMaxInBst.minValueSet) {
      if (i + 1 == k) {
        System.out.println(temp);
        break;
      } else {
        i++;
      }
    }
    System.out.println("Maximum values set content - " + findMinAndMaxInBst.maxValueSet);
    System.out.println("Enter the k value for maximum search");
    int k1 = scan.nextInt();
    int i1 = 0;
    for (int temp : findMinAndMaxInBst.maxValueSet) {
      if (i1 + 1 == k1) {
        System.out.println(temp);
        break;
      } else {
        i1++;
      }
    }

  }
}
