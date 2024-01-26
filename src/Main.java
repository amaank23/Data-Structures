
public class Main {
    public static void main(String[] args) {
//        BinaryTreeBFS tree = new BinaryTreeBFS();
//        tree.root = new TreeNodeBT(10);
//        tree.root.left = new TreeNodeBT(5);
//        tree.root.right = new TreeNodeBT(15);
//        tree.root.left.left = new TreeNodeBT(2);
//        tree.root.left.right = new TreeNodeBT(8);
//        tree.root.right.left = new TreeNodeBT(12);
//        tree.root.right.right = new TreeNodeBT(20);

        Graph graph = new Graph();
        Vertex karachi = graph.addVertex("Karachi");
        Vertex lahore = graph.addVertex("Lahore");
        Vertex islamabad = graph.addVertex("Islamabad");
        Vertex peshawar = graph.addVertex("Peshawar");

        graph.addEdge("Karachi", "Lahore", 5);
        graph.addEdge("Lahore", "Islamabad", 10);
        graph.addEdge("Karachi", "Peshawar", 6);
        graph.addEdge("Peshawar", "Islamabad", 4);

        graph.print();

    }

}