package com.yit.exercise.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearchMatrix {

    public static void main(String[] args) {
        char[][] mat = {
                {'s', '.', '.', '#', '.', '.', '#'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.'},
                {'#', '.', '#', '.', '.', '#', 'e'},
        };

        int sr = 0, sc = 0; // start row , column

        int moveCount = 0;
        int nodesLeftInLayer = 1; // start with 1 because of start coordinate
        int nodesInNextLayer = 0;


        boolean reachedEnd = false;

        int numRow = 5;
        int numColumn = 7;
        boolean[][] visited = new boolean[numRow][numColumn];

        /*
             Direction vector
             North, south, east, west
         */
        Integer[] directionalRow = {-1, 1, 0, 0};
        Integer[] directionalColumn = {0, 0, 1, -1};

        /* State representation */
        Queue<Integer> rq = new LinkedList<>(); // row queue
        Queue<Integer> cq = new LinkedList<>(); // column queue

        rq.add(sr);
        cq.add(sc);
        visited[sc][sr] = true;

        while (!rq.isEmpty()) {
            int currentRow = rq.remove();
            int currentColumn = cq.remove();
            if (mat[currentRow][currentColumn] == 'e') {
                reachedEnd = true;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nextLayerRow = currentRow + directionalRow[i];
                int nextLayerColumn = currentColumn + directionalColumn[i];

                /*
                  Check to see if coordinates is outside the matrix
                  */
                if (nextLayerRow < 0 || nextLayerColumn < 0) {
                    continue;
                }
                if (nextLayerRow >= numRow || nextLayerColumn >= numColumn) {
                    continue;
                }

                if (visited[nextLayerRow][nextLayerColumn]) {
                    continue;
                }
                if (mat[nextLayerRow][nextLayerColumn] == '#') {
                    continue;
                }

                rq.add(nextLayerRow);
                cq.add(nextLayerColumn);

                visited[nextLayerRow][nextLayerColumn] = true;
                nodesInNextLayer++;
            }

            nodesLeftInLayer--;
            if (nodesLeftInLayer == 0) {
                nodesLeftInLayer = nodesInNextLayer;
                nodesInNextLayer = 0;
                moveCount++;
            }
        }

        if (reachedEnd) {
            System.out.printf("Took %d steps%n", moveCount);
        } else {
            System.out.println("NO");
        }
    }
}
