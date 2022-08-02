package Leetcode_QNS;

public class qns20 {

    public static void main(String[] args) {
        {
            int[][] mat = {
                    {4,3,2,-1},
                    {3,2,1,-1},
                    {1,1,-1,-2},
                    {-1,-1,-2,-3}
            };
            System.out.println(countNegatives(mat));
        }
    }

  static   public int countNegatives(int[][] grid) {

        int ans =0;

        for(int i=0; i<grid.length;i++)
        {
            ans = ans+BS(grid[i]);
        }

        return ans;

    }

   static int BS(int[]row)
    {
        int s=0;
        int e=row.length-1;

        while(s<=e)

        {
            int m = s+ (e-s)/2;

            if(row[m]<0)
            {
                e=m-1;

            }
            else{
                s=m+1;
            }
        }

        // at this after while loop our end(e) will be at the position where after that all nos upto last index of row are less than 0
        // so we just calculate all elements after e position
        return row.length-(e+1);

    }
}
