package Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSImplement {
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<Integer>(Arrays.asList(2,3,1)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0,4)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0)));
        adj.add(new ArrayList<Integer>(Arrays.asList(2)));

        System.out.println(bfsOfGraph(5, adj));
    }
    private static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;

        while (!queue.isEmpty()){
            int node=queue.poll();
            bfs.add(node);

            for (int i : adj.get(node)) {
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }


        }

        return bfs;
    }
}
