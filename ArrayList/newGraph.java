import java.util.ArrayList;

public class newGraph {

    static class node
    {
        int src;
        int dest;

        node(int s,int d)
        {
            this.src = s;
            this.dest = d;
        }
    }
    
    public static void main(String[] args) {
        int v = 4;
        // ArrayList<Integer> graph[] = new ArrayList[4];
        ArrayList<node> graph[] = new ArrayList[v];

        for(int i=0;i<graph.length;i++)
        {
            // graph[i] = new ArrayList<>();
            graph[i] = new ArrayList<node>();
        }
        graph[0].add(new node(0, 2));
        graph[1].add(new node(0, 4));
    }
}
