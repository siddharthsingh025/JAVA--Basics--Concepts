package Leetcode_QNS;

import java.util.ArrayList;


//https://leetcode.com/problems/spiral-matrix-iii/
public class qns7 {

    public static void main(String[] args) {

        int[][] arr = spiralMatrixIII(5,6,1,4);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j]);

            }
            System.out.print ("  ");

        }
    }


  static   public int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] res = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < R * C; ++n) {        // this is for run for all position
            for (int i = 0; i < n / 2 + 1; ++i) {   // this defined how many steps you walk in one direction { basically its form a  pattern of 11,22,33,44,55..}
                if (0 <= x && x < R && 0 <= y && y < C)  // its is a check for validation, whether out current position is inside our matrix or not
                    res[j++] = new int[] {x, y};       // here we add all valid [positions to our array list
                x += dx;   // basically here we add 0 for same row or column and 1 for moving ahead in that particular row or column
                y += dy;  // like if we move  toward east direction , so we have to move in same row and add +1 to colum ,
                         // so here we add dx=0 for being in same row and add dy=1 for moving ahead
            }
            tmp = dx;   // here basically we are taking a right turn  by swapping values of dx and dy or changing our direction of moving
            dx = dy;
            dy = -tmp;   // -ve sign bcoz we want to move in -ve direction of x and y after every 2nd turn ,
        }
        return res;
    }
}







// + Second Method

//    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
//        int[][] dirt = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // east, south, west, north
//        List<int[]> res = new ArrayList<>();
//        int len = 0, d = 0; // move <len> steps in the <d> direction
//        res.add(new int[]{r0, c0});
//        while (res.size() < R * C) {
//            if (d == 0 || d == 2) len++; // when move east or west, the length of path need plus 1
//            for (int i = 0; i < len; i++) {
//                r0 += dirt[d][0];
//                c0 += dirt[d][1];
//                if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) // check valid
//                    res.add(new int[]{r0, c0});
//            }
//            d = (d + 1) % 4; // turn to next direction
//        }
//        return res.toArray(new int[R * C][2]);
//    }
