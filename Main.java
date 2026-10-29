public class Main {
    public static void main(String[] args) {

        //Create a class called - Graph

        Graph g = new Graph(5);
        g.add_edges(0, 1);
        g.add_edges(0, 1);
        g.add_edges(0, 1);
        g.add_edges(0, 1);
        g.add_edges(0, 1);

        g.display_matrix();
    }
}