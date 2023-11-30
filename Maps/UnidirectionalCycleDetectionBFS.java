package Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class UnidirectionalCycleDetectionBFS {
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

     private static boolean bfsOfGraphCycle(int src, ArrayList<ArrayList<Integer>> adj,boolean[] visited) {
        Queue<Node> q=new LinkedList<>();
        visited[src]=true;
        q.add(new Node(src,-1));
        while (!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.poll();
            for (Integer it:adj.get(node-1)){
                if(!visited[it]){
                    q.add(new Node(it,node));
                    visited[it]=true;
                } else if (parent!=it) return true;
            }
        }
        return false;
    }
    private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[] = new boolean[V+1];
        for(int i=1;i<=V;i++)
            if(vis[i]==false)
                if(bfsOfGraphCycle(i,adj,vis))
                    return true;

        return false;
    }

    static class Node{
        int first;
        int second;
        public Node(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
}
