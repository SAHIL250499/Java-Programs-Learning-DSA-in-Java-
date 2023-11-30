package Maps;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSImplement {
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<Integer>(Arrays.asList(2,3,1)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0,4)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0)));
        adj.add(new ArrayList<Integer>(Arrays.asList(2)));
        System.out.println(dfsOfGraph(5, adj));
    }

    private static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited=new boolean[V+1];
        ArrayList<Integer> list=new ArrayList<>();
        dfs(0,visited,adj,list);
        return list;

    }

    private static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
        visited[node]=true;
        list.add(node);
        for (Integer it:adj.get(node)) {
            if(!visited[it]){
                dfs(it, visited, adj, list);
            }
        }
    }
}
