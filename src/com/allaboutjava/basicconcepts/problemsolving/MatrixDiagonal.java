package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Scanner;

/**
 * Program to print 0 for a row and a column of a 2D array 'a' if either a[i][x] or a[x][j] is 0
 */
public class MatrixDiagonal {

  public static void main(String[] args) {
    System.out.println("Enter matrix size");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int a[][] = new int[size][size];
    System.out.println("Enter elements of matrix");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Given matrix");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    int temp[][] = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        temp[i][j] = -1; //initialising the resultant 2D array with something other than 0 for later comparison
      }
    }
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (a[i][j] == 0) {
          for (int k = 0; k < size; k++) {
            temp[i][k] = 0;
          }
          for (int x = 0; x < size; x++) {
            temp[x][j] = 0;
          }
        } else {
          if (temp[i][j] != 0) {
            temp[i][j] = a[i][j];
          }
        }

      }
    }

    System.out.println("Output");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(temp[i][j] + " ");
      }
      System.out.println();

    }
  }

}
