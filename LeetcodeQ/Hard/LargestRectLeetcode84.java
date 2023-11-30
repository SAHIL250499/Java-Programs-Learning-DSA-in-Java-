package LeetcodeQ.Hard;

import java.util.Stack;

public class LargestRectLeetcode84 {
    public static void main(String[] args) {
        int[] a={2,4};
        System.out.println(largestRectangleAreaOptimized1(a));
    }

    static int largestRectangleArea(int[] heights) {
        int i=0;
        int maxx=0;
        while (i< heights.length){
            int ans=0;
            int count=0;
            //check left
            for (int j = i-1; j >=0 ; j--) {
                if(heights[j]>=heights[i]){
                    count++;
                }
                else {
                    break;
                }
            }
            //check right
            for (int j = i; j < heights.length ; j++) {
                if (heights[j]>=heights[i]){
                    count++;
                }
                else break;
            }
            ans=heights[i]*count;
            if(maxx<=ans){
                maxx=ans;
            }
            i++;
        }
        return maxx;
    }
    //wrong one condition will fix in future
//    static int largestRectangleArea2(int[] heights) {
//        int i=0;
//        int maxx=0;
//        while (i< heights.length){
//            int ans=0;
//            int rightsmaller=0;
//            int leftsmaller=0;
//            //find left smaller
//            for (int j = i-1; j >=0 ; j--) {
//                if(heights[j]<heights[i]){
//                    leftsmaller=j+1;
//                    break;
//                }
//
//            }
//
//            //find right smaller
//            for (int j = i+1; j < heights.length ; j++) {
//                if(heights[j]<heights[i]){
//                    rightsmaller=j-1;
//                    break;
//                }
//            }
//            ans=(rightsmaller-leftsmaller+1)*heights[i];
//            if(maxx<ans){
//                maxx=ans;
//            }
//            i++;
//        }
//        return maxx;
//    }

    static int largestRectangleAreaOptimized(int[] heights){
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max=getMax(heights,stack,max,i);
            }
            stack.push(i);
        }

        int i= heights.length;
        while (!stack.isEmpty()){
            max=getMax(heights,stack,max,i);
        }
        return max;
    }
    private static int getMax(int[] arr,Stack<Integer> stack,int max,int i){
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;
        }else{
            area=arr[popped]*(i-1-stack.peek());
        }
        return Math.max(max,area);
    }

    //Striver
    static int largestRectangleAreaOptimized1(int[] heights){
        int n=heights.length;
        int[] leftind=new int[n];
        int[] rightind=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) leftind[i]=0;
            else leftind[i]=stack.peek()+1;
            stack.push(i);
        }

        //clear stack to be reused
        while (!stack.isEmpty()) stack.pop();

        for (int i = n-1; i >=0 ; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) rightind[i]=n-1;
            else rightind[i]=stack.peek()-1;
            stack.push(i);
        }

        int max=0;
        for (int i = 0; i < n; i++) {
            max=Math.max(max, heights[i]*(rightind[i]-leftind[i]+1));
        }

        return max;

    }
    static int largestRectangleAreaMEGAOptimized1(int[] heights){
        int n=heights.length;
        int maxA=0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <=n; i++) {
            while (!stack.isEmpty() &&(i==n || heights[stack.peek()]>=heights[i])){
                int heigt=heights[stack.peek()];
                stack.pop();
                int width;
                if(stack.isEmpty()) width=i;
                else width=i-stack.peek()-1;
                maxA=Math.max(maxA, width*heigt);
            }
            stack.push(i);
        }

        return maxA;

    }

}
