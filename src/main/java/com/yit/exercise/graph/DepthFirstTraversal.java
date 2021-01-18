package com.yit.exercise.graph;

import java.util.*;

/**
 * https://www.baeldung.com/java-graphs
 */
public class DepthFirstTraversal {

    public static void main(String[] args) {
        /**
         *             bob
         *          /       \
         *    alice -  mark -  rob
         *         \        /
         *            maria
         *
         * Sequence from tutorial: Bob, Rob, Maria, Alice, Mark
         * Sequence at runtime:    Bob, Rob, Maria, Mark, Alice
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
        Stack<String> state = new Stack<>();
        Set<String> visited = new LinkedHashSet<>();


        state.push(start);

        while (!state.isEmpty()) {
            String value = state.pop();

            if (!visited.contains(value)) {
                visited.add(value);
                List<Vertex> edges = graph.getAdjVertices(value);
                for (Vertex edge : edges) {
                    state.push(edge.getO());
                }
            }
        }

        return visited;

    }

}
