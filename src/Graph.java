import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Graph {
    List<Vertex> vertices;

    public Graph(){
        this.vertices = new ArrayList<>();
    }

    Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    void addEdge(String from, String to, int weight){
        Vertex fromVertex = findVertex(from);
        Vertex toVertex = findVertex(to);
        if(fromVertex != null){
            Edge edgeToAdd = new Edge(toVertex, weight);
            fromVertex.edges.add(edgeToAdd);
        } else {
            System.out.println("Edge Not Found");
        }
    }

    Vertex findVertex(String vertexToFind){
        for(Vertex vertex : vertices){
            if(Objects.equals(vertex.data, vertexToFind)){
                return vertex;
            }
        }
        return null;
    }

    void print(){
        for(Vertex vertex: vertices){
            System.out.println(vertex.data);
            for (Edge edge: vertex.edges){
                System.out.println("-" + edge.destination.data);
            }
        }
    }


}
