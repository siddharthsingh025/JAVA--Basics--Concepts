package Recursion.Intro.Backtracking;

public class N_Queens {

    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0 ));

    }


    static int queens(boolean[][] board, int row) // why not taking column bcoz every time we just inc row , clmn will remain 0-length to check
    {
        if(row== board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;
        //now here we are checking for every box/ col of every row of our board whether we could place Queen or not

        for (int col =0; col<board.length ; col++)
        {
           if(isSafe(board,row,col))
           { // place the queen if safe
              board[row][col]=true;
              count =count + queens(board,row+1);
               board[row][col]=false;
           }
        }

        return count;
    }




    private static boolean isSafe(boolean[][] board , int row , int col) {
        //for vertical checking
        for (int i=0; i<row ; i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }

        //for diagonal left checking
        int maxLeft = Math.min(row,col);
        for (int i = 0; i <=maxLeft; i++) {

            if(board[row-i][col-i])
            {
                return false;
            }
        }

        //for diagonal right checking
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 0; i <=maxRight; i++) {

            if(board[row-i][col+i])
            {
                return false;
            }
        }

        return true; // means position is safe
    }



    private static void display(boolean board[][]) {  // why we printing original array bcoz after printing array when we go back for next

        for (boolean[] row: board) {                 // way , we revert the changes we made with original array
                                                      // using back tracking
            for (boolean box:row) {

              if(box)
              {
                  System.out.print("Q ");
              }else
              {
                  System.out.print("X ");
              }
            }
            System.out.println();
        }
    }

}
