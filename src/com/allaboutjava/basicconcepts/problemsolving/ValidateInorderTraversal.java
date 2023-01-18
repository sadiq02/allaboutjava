package com.allaboutjava.basicconcepts.problemsolving;

public class ValidateInorderTraversal {

  public boolean isInorderTraversal(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ValidateInorderTraversal validateInorderTraversal = new ValidateInorderTraversal();
    int[] input1 = new int[]{4, 6, 7, 10, 13, 15, 17};
    System.out.println("Is given binary search tree's inorder traversal correct ? : "
        + validateInorderTraversal.isInorderTraversal(input1));

    int[] input2 = new int[]{34, 56, 78, 99, 56};
    System.out.println("Is given binary search tree's inorder traversal correct ? : "
        + validateInorderTraversal.isInorderTraversal(input2));
  }

}
