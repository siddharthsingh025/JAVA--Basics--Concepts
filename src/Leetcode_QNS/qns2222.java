package Leetcode_QNS;

public class qns2222 {


    public static void main(String[] args) {
//        int[][] mat = {
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,60}
//        };

        int[][] mat = {
                {1}
        };

        boolean ans =searchMatrix(mat,3);
        System.out.printf("ans "+ans);
    }



     static public boolean searchMatrix(int[][] matrix, int target) {

        boolean ans = false;

        for(int i=0; i<matrix.length ;i++){

            if(target==matrix[i][matrix[0].length-1]){
                return true;
            }

            if(target<matrix[i][matrix[0].length-1]){

                ans = search(matrix[i],target,0,matrix[0].length-1);
                    return ans;
            }
        }
        return ans;
    }


   static public   boolean search(int[] a ,int x,int start , int end){

        if(start>end){
            return false;
        }

        int mid = start + (end - start)/2;

        if(a[mid]==x){
            return true;
        }

        if(x<a[mid]){
            return search(a,x,start,mid-1);
        }


        return search(a,x,mid+1,end);
    }

}
