package src;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Our graph date structure.
 */
class Graph {
    private int vertexCount;
    private IntegerLinkedList[] adjacencyList;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adjacencyList = new IntegerLinkedList[this.vertexCount];

        for (int i = 0; i < this.vertexCount; ++i) {
            this.adjacencyList[i] = new IntegerLinkedList();
        }
    }

    /**
     * Adds an edge given a starting vertex and an ending vertex.
     */
    public void addEdge(int startVertex, int endVertex) {
        this.adjacencyList[startVertex].add(endVertex);
    }

    /**
     * Recursive dfs function.
     */
    private void dfsRec(int vertex, boolean[] visitedVertices) {
        visitedVertices[vertex] = true;
        System.out.println(vertex);

        ListIterator<Integer> list = this.adjacencyList[vertex].listIterator();

        while (list.hasNext()) {
            int nextVertex = list.next();
            if (!visitedVertices[nextVertex]) {
                dfsRec(nextVertex, visitedVertices);
            }
        }
    }

    /**
     * Depth first search given a starting vertex.
     */
    public void dfs(int vertex) {
        boolean[] visitedVertices = new boolean[this.vertexCount];
        dfsRec(vertex, visitedVertices);
    }

    /**
     * Breadth first search given a starting vertex.
     */
    public void bfs(int vertex) {
        boolean[] visitedVertices = new boolean[this.vertexCount];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visitedVertices[vertex] = true;
        queue.add(vertex);

        while (queue.size() != 0) {
            vertex = queue.poll();
            System.out.println(vertex);

            ListIterator<Integer> i = this.adjacencyList[vertex].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if (!visitedVertices[n]) {
                    visitedVertices[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}