package Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class UnidirectionalCycleDetectionDFS {
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<Integer>(Arrays.asList(2,5)));
        adj.add(new ArrayList<Integer>(Arrays.asList(1,5,3)));
        adj.add(new ArrayList<Integer>(Arrays.asList(2,4,5)));
        adj.add(new ArrayList<Integer>(Arrays.asList(3,5)));
        adj.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));

        System.out.println(isCycle(5,adj));
    }

    private static boolean dfsOfGraphCycle(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for (Integer it: adj.get(node)) {
            if(!vis[it]){
                if(dfsOfGraphCycle(it, node, vis, adj)){
                    return true;
                }
            } else if (it!=parent) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[] = new boolean[V+1];
        for(int i=1;i<=V;i++)
            if(vis[i]==false)
                if(dfsOfGraphCycle(i,-1,vis,adj))
                    return true;

        return false;
    }
}
