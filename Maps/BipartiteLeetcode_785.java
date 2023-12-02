package Maps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteLeetcode_785 {
    public static void main(String[] args) {
        int[][] graph =new int[][] {{1,2,3},{0,2},{0,1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }

    private static boolean isBipartitecheck(int start,int[] visited,int[][] graph) {

        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=0;
        while (!q.isEmpty()){
            int node=q.poll();
            for(int i:graph[node]){
                if(visited[i]==-1){
                    visited[i]=1-visited[node];
                    q.add(i);
                } else if (visited[i]==visited[node]) {
                    return false;
                }
            }
        }
        return true;

    }
    private static boolean isBipartite(int[][] graph){
        int V=graph.length;
        int[] visited=new int[V];
        Arrays.fill(visited, -1);
        for (int i = 0; i < V; i++) {
            if(visited[i]==-1){
                if(!isBipartitecheck(i,visited, graph)){
                    return false;
                }
            }
        }
        return true;

    }


}
