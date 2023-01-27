package com.allaboutjava.basicconcepts.datastructure.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DijskrtaAlgoPractice {

  static int numberOfVertices = 9;

  void dijskrta(int adjacencyMatrix[][], int source) {
    boolean[] shortestPathSet = new boolean[numberOfVertices];
    int distance[] = new int[numberOfVertices];

    for (int i = 0; i < numberOfVertices; i++) {
      shortestPathSet[i] = false;
      distance[i] = Integer.MAX_VALUE;
    }

    distance[source] = 0;
    for (int i = 0; i < numberOfVertices - 1; i++) {
      int u = findMinimum(shortestPathSet, distance);
      shortestPathSet[u] = true;
      for (int v = 0; v < numberOfVertices; v++) {
        if (!shortestPathSet[v] //ensure that this vertex is not visited yet!
            && adjacencyMatrix[u][v] != 0 //ensure that there exists an edge between u and v
            && distance[u] != Integer.MAX_VALUE //ensure that u is already visited
            && distance[u] + adjacencyMatrix[u][v]
            < distance[v]) {// ensure that the edge weight is less than infinity
          distance[v] = distance[u] + adjacencyMatrix[u][v];
        }
      }
    }
    //print the shortest distance array content
   IntStream.of(distance).boxed().forEach(System.out::println);
  }

  private int findMinimum(boolean[] shortestPathSet, int[] distance) {
    int min = Integer.MAX_VALUE;
    int min_index = -1;
    for (int i = 0; i < numberOfVertices; i++) {
      if (shortestPathSet[i] == false && distance[i] <= min) {
        min = distance[i];
        min_index = i;
      }
    }
    return min_index;
  }

  public static void main(String[] args) {
    DijskrtaAlgoPractice dijskrtaAlgoPractice = new DijskrtaAlgoPractice();
    int adjacencyMatric[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9, 14, 0, 0, 0},
        {0, 0, 0, 9, 0, 10, 0, 0, 0},
        {0, 0, 4, 14, 10, 0, 2, 0, 0},
        {0, 0, 0, 0, 0, 2, 0, 1, 6},
        {8, 11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}};
    dijskrtaAlgoPractice.dijskrta(adjacencyMatric, 0);
  }

}
