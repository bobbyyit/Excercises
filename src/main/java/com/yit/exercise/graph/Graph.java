package com.yit.exercise.graph;

import java.util.*;

/**
 * https://www.baeldung.com/java-graphs
 */
public class Graph {

    public static void main(String[] args) {
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
    }

    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    public void addVertex(String o) {
        Vertex vertex = new Vertex(o);
        adjVertices.put(vertex, new LinkedList<>());
    }

    public void addEdge(String sourceVertex, String destinationVertex) {
        Vertex source = new Vertex(sourceVertex);
        Vertex destination = new Vertex(destinationVertex);

        List<Vertex> vertices = adjVertices.get(source);
        vertices.add(destination);
    }

    public void removeVertex(String o) {
        Vertex vertex = new Vertex(o);

        // Remove edge relationship to other vertices
        adjVertices.values().stream().forEach(e -> e.remove(vertex));
        // Remove vertex itself
        adjVertices.remove(vertex);
    }

    public void removeEdge(String o1, String o2) {
        Vertex vertex1 = new Vertex(o1);
        Vertex vertex2 = new Vertex(o2);

        List<Vertex> edgesOfV1 = adjVertices.get(vertex1);
        List<Vertex> edgesOfV2 = adjVertices.get(vertex2);

        edgesOfV1.remove(vertex2);
        edgesOfV2.remove(vertex1);
    }

    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }
}

class Vertex {
    private String o;

    Vertex(String o) {
        this.o = o;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    @Override
    public boolean equals(Object o) {
        Vertex vertex = (Vertex) o;
        String o1 = vertex.getO();

        return Objects.equals(this.o, o1);
    }

    @Override
    public int hashCode() {

        return Objects.hashCode(o);
    }
}