package Recursion.Intro.Backtracking;

public class N_Knight {

    public static void main(String[] args) {

        int n=4;
        boolean[][] board = new boolean[n][n];
     Knight(board,0 ,0,n);
    }




    static void Knight(boolean[][] board, int row ,int col , int knights) // why not taking column bcoz every time we just inc row , clmn will remain 0-length to check
    {
        if(knights==0)
        {
            display(board);
            System.out.println();
            return;
        }


        if(row==board.length-1 && col==board.length)
        {
            return ;
        }

        if(col==board.length)
        {
           Knight(board,row+1,col=0,knights);
           return;
        }


        if(isSafe(board,row,col))
        { // place the queen if safe
            board[row][col]=true;
              Knight(board,row,col+1,knights-1);
            board[row][col]=false;
        }

            Knight(board,row,col+1,knights);
    }




    private static boolean isSafe(boolean[][] board , int row , int col) {
      if(isVAlid(board,row-2,col-1))
      {
          if(board[row-2][col-1])
          {
              return false;
          }
      }


        if(isVAlid(board,row-2,col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }

        if(isVAlid(board,row-1,col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }

        if(isVAlid(board,row-1,col+2 ))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }

        return true;
    }


    // for check whether we are in the board or out of it
   private  static  boolean isVAlid(boolean[][] board , int row , int col)
   {
       if(row>=0 && row< board.length && col>=0 && col<board.length )
       {
           return true;
       }

       return false;
   }



    private static void display(boolean board[][]) {  // why we printing original array bcoz after printing array when we go back for next

        for (boolean[] row: board) {                 // way , we revert the changes we made with original array
            // using back tracking
            for (boolean box:row) {

                if(box)
                {
                    System.out.print("K ");
                }else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}
