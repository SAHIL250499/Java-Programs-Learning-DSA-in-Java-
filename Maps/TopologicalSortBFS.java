package Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortBFS {
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<Integer>(Arrays.asList()));
        adj.add(new ArrayList<Integer>(Arrays.asList()));
        adj.add(new ArrayList<Integer>(Arrays.asList(3)));
        adj.add(new ArrayList<Integer>(Arrays.asList(1)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0,1)));
        adj.add(new ArrayList<Integer>(Arrays.asList(2,0)));

        System.out.println(Arrays.toString(topoSort(6, adj)));
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int[] topo=new int[V];
        int[] indegree=new int[V];
        for (int i = 0; i < V; i++) {
            for (Integer it: adj.get(i)) {
                indegree[it]++;
            }
        }
        //insert first element in Queue
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int k=0;

        while (!q.isEmpty()){
            int node=q.poll();
            topo[k++]=node;
            for(Integer it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
        }
        return topo;


    }
}
