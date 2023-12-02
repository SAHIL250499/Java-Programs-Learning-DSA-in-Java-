package LeetcodeQ.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslandsLeetcode_200 {
    public static void main(String[] args) {
        numIslands(new char[][]{{'1','1','1'},{'0','1','0'},{'1','1','1'}});
    }

    private static void bfstraverse(int row,int col,boolean[][] visited,char[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        visited[row][col]=true;
        while (!q.isEmpty()){
            int noderow=q.peek().first;
            int nodecol=q.peek().second;
            q.poll();
            //check the  neighbours
            int one=1;
            for (int i = 0; i < 2; i++) {
                if(noderow+one>=0 &&noderow+one< grid.length &&!visited[noderow+one][nodecol] && grid[noderow+one][nodecol]=='1'){
                    visited[noderow+one][nodecol]=true;
                    q.add(new Pair(noderow+one, nodecol));
                }
                if(nodecol+one>=0 &&nodecol+one< grid[0].length &&!visited[noderow][nodecol+one] && grid[noderow][nodecol+one]=='1'){
                    visited[noderow][nodecol+one]=true;
                    q.add(new Pair(noderow, nodecol+one));
                }
                one=-1;
            }
        }

    }

    static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }

    private static void numIslands(char[][] grid) {
    int m=grid[0].length;
    int n=grid.length;
    boolean[][] visited=new boolean[n][m];
    int c=0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if(!visited[i][j] && grid[i][j]=='1'){
                bfstraverse(i,j,visited,grid);
                c++;
            }
        }
    }
        System.out.println(c);

    }


}
