import com.mathsystem.api.graph.GraphFactory;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        var file = new File("/home/dmitry/IdeaProjects/math-system/graph.txt");
        var directedGraph = GraphFactory.loadGraphFromFile(file);
        FlatGraph flatGraph = new FlatGraph();
        System.out.print(flatGraph.execute(directedGraph));
    }
}
