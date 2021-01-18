package com.yit.exercise.graph;

import java.util.*;

public class BreadthFirstTraversal {

    public static void main(String[] args) {
        /**
         *             bob
         *          /       \
         *    alice -  mark -  rob
         *         \        /
         *            maria
         *
         * Sequence: Bob, Alice, Rob, Mark, Maria
         *
         */


        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");

        Set<String> result = traverse(graph, "Bob");
        System.out.println(result.toString());
    }

    public static Set<String> traverse(Graph graph, String start) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> state = new LinkedList<>();

        state.add(start);
        visited.add(start);

        while (!state.isEmpty()) {
            String value = state.poll();

            List<Vertex> edges = graph.getAdjVertices(value);

            for (Vertex edge : edges) {
                String edgeValue = edge.getO();
                if (!visited.contains(edgeValue)) {
                    visited.add(edgeValue);
                    state.add(edgeValue);
                }
            }


        }

        return visited;
    }

}
