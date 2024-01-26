import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String data;
    List<Edge> edges;

    public Vertex(String data){
        this.data = data;
        this.edges = new ArrayList<>();
    }
}
