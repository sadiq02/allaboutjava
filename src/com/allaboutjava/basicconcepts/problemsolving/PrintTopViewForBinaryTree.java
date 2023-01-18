package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Map;
import java.util.TreeMap;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class PrintTopViewForBinaryTree {

  void printBottomView(BstNode node, Map<Integer, int[]> map, int horizontalDistance, int height) {
    if (node == null) {
      return;
    }
    if (!map.containsKey(horizontalDistance)) {
      map.put(horizontalDistance, new int[]{node.getValue(), height});
    } else {
      int temp[] = map.get(horizontalDistance);
      if (temp[1] >= height) {
        temp[1] = height;
        temp[0] = node.getValue();
      }
      map.put(horizontalDistance, temp);
    }
    printBottomView(node.getLeft(), map, horizontalDistance - 1, height + 1);
    printBottomView(node.getRight(), map, horizontalDistance + 1, height + 1);
  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);

    BstNode _1 = new BstNode(1);
    BstNode _2 = new BstNode(2);
    BstNode _3 = new BstNode(3);
    BstNode _4 = new BstNode(4);
    BstNode _5 = new BstNode(5);
    BstNode _7 = new BstNode(7);
    BstNode _8 = new BstNode(8);
    BstNode _9 = new BstNode(9);
    _1.setLeft(_2);
    _1.setRight(_3);
    _2.setLeft(_4);
    _2.setRight(_5);
    _4.setLeft(_8);
    _4.setRight(_9);
    _3.setRight(_7);





    System.out.println("\nInorder display\n");
    bst.inOrderDisplay();

    Map<Integer, int[]> map1 = new TreeMap<>();
    PrintTopViewForBinaryTree printBottomViewForBinaryTree = new PrintTopViewForBinaryTree();
    printBottomViewForBinaryTree.printBottomView(_1, map1, 0, 0);
    System.out.println("\nBottom view\n");
    for (int[] temp : map1.values()) {
      System.out.println(temp[0]);
    }

    Map<Integer, int[]> map2 = new TreeMap<>();
    printBottomViewForBinaryTree.printBottomView(bst.getRoot(), map2, 0, 0);
    System.out.println("\nTop view\n");
    for (int[] temp : map2.values()) {
      System.out.println(temp[0]);
    }
  }
}
