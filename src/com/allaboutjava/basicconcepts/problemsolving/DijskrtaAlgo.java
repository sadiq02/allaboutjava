package com.allaboutjava.basicconcepts.problemsolving;

import java.util.stream.IntStream;

public class DijskrtaAlgo {

  static int numberOfVertices = 9;

  void dijskrta(int adjacencyMatrix[][], int source) {
    boolean[] shortestPathSet = new boolean[numberOfVertices]; //this is to track if a vertex has been already visited. If yes, then we do not check that vertex again via different path.
    int distance[] = new int[numberOfVertices]; //this is the resultant array that will contain the shortest distance from source to each of the vertices in the adjacencyMatrix.

    for (int i = 0; i < numberOfVertices;
        i++) { //assigning default values.
      shortestPathSet[i] = false; // 'false' for visited since none of the vertices are visited at the beginning.
      distance[i] = Integer.MAX_VALUE; //INFINITY for shortest distance for all vertices from source
    }
    distance[source] = 0;

    for (int i = 0; i < numberOfVertices - 1; i++) {
      int u = findMinimumDistanceVertex(shortestPathSet, distance);
      shortestPathSet[u] = true;
      for (int v = 0; v < numberOfVertices; v++) {
        if (!shortestPathSet[v] //ensure that this vertex is not visited yet!
            && adjacencyMatrix[u][v] != 0 //ensure that there exists an edge between u and v
            && distance[u] != Integer.MAX_VALUE //ensure that u is already visited
            && distance[u] + adjacencyMatrix[u][v]
            < distance[v]) {// ensure that the edge weight is less than infinity
          distance[v] =
              distance[u] + adjacencyMatrix[u][v];
        }
      }
    }
    //print the shortest distance array content
    IntStream.of(distance).boxed().forEach(System.out::println);
  }

  private int findMinimumDistanceVertex(boolean[] shortestPathSet, int[] distance) {
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
    DijskrtaAlgo dijskrtaAlgo = new DijskrtaAlgo();
    int graph[][]
        = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9, 14, 0, 0, 0},
        {0, 0, 0, 9, 0, 10, 0, 0, 0},
        {0, 0, 4, 14, 10, 0, 2, 0, 0},
        {0, 0, 0, 0, 0, 2, 0, 1, 6},
        {8, 11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}};
    dijskrtaAlgo.dijskrta(graph, 4);
  }

}
