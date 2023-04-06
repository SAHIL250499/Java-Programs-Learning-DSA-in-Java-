package Arrays.twoDarray;

import java.util.Arrays;

public class BinarySearch2Dsorted {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search2(arr,2)));
    }
    //My solution in O(n)
    static int[] search(int[][] arr,int target){
        int row=0;
        int col=0;
        while (row< arr.length){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col]<target){
                row+=1;
            }
            else{
                break;
            }
        }
        while(col<arr.length){
            if(arr[row-1][col]==target){
                return new int[]{row-1,col};
            }
            col++;
        }
        return new int[]{-1,-1};
    }
    //Optimal solution
    //search in the row provided with the column provided as well
    static int[] binarySearch(int[][] matrix,int row,int cstart,int cEnd,int target){
        while(cstart<=cEnd){
            int mid= cstart+(cEnd-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(target>matrix[row][mid]){
                cstart=mid+1;
            }
            else{
                cEnd=mid-1;
            }

        }
        return new int[]{-1,-1};
    }


    static int[] Mainsearch(int[][] matrix,int target){
        int rows= matrix.length;
        int cols=matrix[0].length;

        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);

        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=(cols)/2;
        //run loop till 2 rows are left
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if(target>matrix[mid][cMid]){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the column of 2 rows

        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in 1st half
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);

        }
        //search in 2nd half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //search in 3rd half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }

    }
    //easy optimal solution to search from last column
    static int[] search2(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;

        // apply BS on the last column, this way we can reduce the no of rows in which
        // we want to apply BS to just 1.
        int lb = 0, ub = n - 1, mid;
        while (lb < ub) {
            mid = lb + (ub - lb) / 2;

            if (arr[mid][m - 1] < target) {
                lb = mid + 1;
            } else if (arr[mid][m - 1] > target) {
                ub = mid;
            } else {
                return new int[] { mid, m - 1 };
            }
        }

        // here lb == rb

        int ind = NbinarySearch(arr[lb], target);
        if (ind != -1)
            return new int[] { lb, ind };
        return new int[] { -1, -1 };
    }
    static int NbinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
}
