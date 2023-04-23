package Graph.qns;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {

        // Write your code here

        //min-heap
        PriorityQueue<Pair4> pq= new PriorityQueue<Pair4>((x,y)->x.distance - y.distance);

        int []dist = new int[V];
         for (int i=0; i<V;i++)dist[i]=(int)(1e9);

         dist[S]=0;
         pq.add(new Pair4(S,0));

         while (!pq.isEmpty()){

             int dis = pq.peek().distance;
             int node = pq.peek().node;

             pq.remove();

             for(int i=0; i<V;i++){

                 int edgeW = adj.get(node).get(i).get(1);
                 int adjNode = adj.get(node).get(i).get(0);

                 if(dis + edgeW < dist[adjNode]){
                     dist[adjNode]= dis + edgeW;
                     pq.add(new Pair4(adjNode,dist[adjNode]));
                 }
             }

         }
        return dist;
    }
}


class Pair4{
    int distance;
    int node;

    Pair4(int n , int dis){
        this.node=n;
        this.distance=dis;
    }
}
