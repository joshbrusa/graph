package src;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("depth first search starting at vertex 2:");
        graph.dfs(2);

        System.out.println("breadth first search starting at vertex 2:");
        graph.bfs(2);
    }
}
