package Leetcode_QNS;

import java.util.ArrayList;

//https://leetcode.com/problems/spiral-matrix-ii/
public class qns6 {


    public static void main(String[] args) {

        int[][] ans = generateMatrix(3);

        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j <ans[0].length; j++) {

                System.out.print(" "+ans[i][j]);
            }
            System.out.println(" ");
        }
    }
  static   public int[][] generateMatrix(int n) {

      int[][] arr = new int[n][n];

        int top=0 , down = n-1;
        int left=0 , right = n-1;

        int dir =0;
        int num=0;

        while (top<=down && left<=right)
        {

            if(dir==0)
            {
                for (int i = left; i <=right; i++) {
                    num++;
                   arr[top][i]=num;
                }
                top++;
            }


            else if(dir==1)
            {
                for (int i = top; i <=down; i++) {

                    num++;
                  arr[i][right]=num;
                }
                right--;
            }
            else if(dir==2)
            {
                for (int i = right; i >=left; i--) {

                    num++;
                    arr[down][i]=num;
                }
                down--;
            }
            else if(dir==3)
            {
                for (int i = down; i >=top; i--) {

                    num++;
                 arr[i][left]=num;
                }
                left++;
            }

            dir =(dir+1)%4;

        }

        return arr;

    }

}
