package src;

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
     * Depth first search.
     */
    public void dfs() {

    }

    /**
     * Breadth first search.
     */
    public void bfs() {

    }
}