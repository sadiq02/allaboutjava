package com.allaboutjava.basicconcepts.datastructure.bst.custom;

import java.util.LinkedList;
import java.util.Queue;

public class BstOperations {

  BstNode root;

  public void insertNode(int value) {
    root = addNode(root, value);
  }

  public BstNode getRoot() {
    return root;
  }

  private BstNode addNode(BstNode root, int value) {
    if (root == null) {
      root = new BstNode(value);
      return root;
    }
    if (value < root.value) {
      root.left = addNode(root.left, value);
    }
    if (value > root.value) {
      root.right = addNode(root.right, value);
    }
    return root;
  }

  public void inOrderDisplay() {
    inorder(root);
  }

  public void preOrderDisplay() {
    preOrder(root);
  }

  public void postOrderDisplay() {
    postOrder(root);
  }

  private void inorder(BstNode root) {
    if (root != null) {
      inorder(root.left);
      System.out.println(root.value);
      inorder(root.right);
    }
  }

  private void preOrder(BstNode root) {
    if (root != null) {
      System.out.println(root.value);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  private void postOrder(BstNode root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.value);
    }
  }

  public void levelOrderTraversal(BstNode root) {
    Queue<BstNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      BstNode temp = queue.poll();
      System.out.println(temp.value);
      if (temp.getLeft() != null) {
        queue.add(temp.getLeft());
      }
      if (temp.getRight() != null) {
        queue.add(temp.getRight());
      }
    }
  }

  public void removeNode(int value) {
    root = removeNode(root, value);
  }

  private BstNode removeNode(BstNode root, int value) {
    // best case scenario if bst is empty
    if (root == null) {
      return null;
    }
    // check the key value and decide which subtree to check further
    if (value < root.value) {
      root.left = removeNode(root.left, value);
    } else if (value > root.value) {
      root.right = removeNode(root.right, value);
    } else { //if its the root node
      //check for 3 conditions
      //1. if there is no left child for node-to-be-deleted just return root.right
      if (root.left == null) {
        return root.right;
      }
      //2. if there is no right child for node-to-be-deleted just return root.left
      if (root.right == null) {
        return root.left;
      }
      //3. in case the node-to-be-deleted have both left child and right child, need to find the
      // minimum value from right subtree which can replace root element data
      root.value = findMinimunValueNodeFromRightSubtree(root.right);

      // delete the node which was replaced as root in the previous step
      root.right = removeNode(root.right, root.value);
    }
    return root;
  }

  private int findMinimunValueNodeFromRightSubtree(BstNode node) {
    int minimum = node.value;
    while (node.left != null) {
      minimum = node.left.value; //because in BST left node will have smaller values
      node = node.left;
    }
    return minimum;
  }

}
