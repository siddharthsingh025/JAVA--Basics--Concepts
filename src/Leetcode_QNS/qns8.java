package Leetcode_QNS;

import java.util.ArrayList;

//https://leetcode.com/problems/set-matrix-zeroes/
public class qns8 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }

    }

  static   public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int colm = matrix[0].length;

      ArrayList<int[]> list = new ArrayList<>();

      for (int i = 0; i <row ; i++) {

          for (int j = 0; j < colm; j++) {

              if(matrix[i][j]==0)
              {
                  list.add(new int[]{i,j});  // adding array in a list
              }
          }

      }


      int i=0;
      while (i<list.size())
      {
      int[] ar= list.get(i);

          for (int k = 0; k <colm ; k++) {

              matrix[ar[0]][k]=0;
          }

          for (int k = 0; k <row ; k++) {

              matrix[k][ar[1]]=0;
          }

          i++;
      }



    }
}
