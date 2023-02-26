package com.allaboutjava.practice;

import java.util.Map;
import java.util.TreeMap;

import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstNode;
import com.allaboutjava.basicconcepts.datastructure.bst.custom.BstOperations;

public class TopViewOfBst {

  private static BstOperations bst = new BstOperations();

  private static void printTopView(BstNode root, int hd, Map<Integer, int[]> map, int height) {
    if (root == null) {
      return;
    }
    if (!map.containsKey(hd)) {
      map.put(hd, new int[]{root.getValue(), height});
    } else {
      int temp[] = map.get(hd);
      if (temp[1] >= height) {
        temp[1] = height;
        temp[0] = root.getValue();
      }
      map.put(hd, temp);
    }
    printTopView(root.getLeft(), hd - 1, map, height + 1);
    printTopView(root.getRight(), hd + 1, map, height + 1);
  }

  private static void printBottomView(BstNode root, int hd, Map<Integer, int[]> map, int height) {
    if (root == null) {
      return;
    }
    if (!map.containsKey(hd)) {
      map.put(hd, new int[]{root.getValue(), height});
    } else {
      int temp[] = map.get(hd);
      if (temp[1] <= height) {
        temp[1] = height;
        temp[0] = root.getValue();
      }
      map.put(hd, temp);
    }
    printBottomView(root.getLeft(), hd - 1, map, height + 1);
    printBottomView(root.getRight(), hd + 1, map, height + 1);
  }

  static int getHeight(BstNode root) {
    if (root == null) {
      return 1;
    }
    int leftSubtreeHeight = 0, rightSubtreeHeight = 0;
    if (root.getLeft() != null) {
      leftSubtreeHeight = getHeight(root.getLeft());
    }
    if (root.getRight() != null) {
      rightSubtreeHeight = getHeight(root.getRight());
    }

    return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;

  }

  public static void main(String[] args) {
    BstOperations bst = new BstOperations();
    bst.insertNode(10);
    bst.insertNode(15);
    bst.insertNode(6);
    bst.insertNode(4);
    bst.insertNode(7);

    System.out.println("\nInorder display\n");
    bst.inOrderDisplay();

    Map<Integer, int[]> map = new TreeMap<>();
    printTopView(bst.getRoot(), 0, map, 0);
    System.out.println("\nTop view\n");
    for (Map.Entry<Integer, int[]> temp : map.entrySet()) {
      System.out.println(temp.getValue()[0]);
    }

    Map<Integer, int[]> map1 = new TreeMap<>();
    printBottomView(bst.getRoot(), 0, map1, 0);
    System.out.println("\nBottom view\n");
    for (Map.Entry<Integer, int[]> temp1 : map1.entrySet()) {
      System.out.println(temp1.getValue()[0]);
    }
  }

}
