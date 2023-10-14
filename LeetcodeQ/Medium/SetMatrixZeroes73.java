package LeetcodeQ.Medium;


import java.util.Arrays;

public class SetMatrixZeroes73 {

    public static void main(String[] args) {
        int[][] matrix={
                {1,0,0,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,1}
        };

        setZeroes2(matrix);
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }



    }
    public static void setZeroes(int[][] matrix) {
        for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix[0].length;n++){
                if(matrix[m][n]==0) {
                    matrix[m][n]=-1;
                    for(int i=0;i<matrix[0].length;i++){
                        if(matrix[m][i]!=0)
                            matrix[m][i]=-1;
                    }
                    for (int i = 0; i < matrix.length; i++) {
                        if(matrix[m][i]!=0)
                            matrix[i][n] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }

        }
    }
  //better solution
    public static void setZeroes1(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] rows=new int[m];
        int[] cols=new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

    }
    //optimal solution
    public static void setZeroes2(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int col0=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    //mark ith row
                    matrix[i][0]=0;
                    //mark jth col
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0]==0){
            for (int j = 0; j < n; j++) {
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for (int i = 0; i < m; i++) {
                matrix[i][0]=0;
            }
        }

    }


}

