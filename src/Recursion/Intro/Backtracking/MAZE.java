package Recursion.Intro.Backtracking;

import java.util.ArrayList;

public class MAZE {

    public static void main(String[] args) {
        System.out.println(count(3,3) );
        path("" ,3,3);
        System.out.println( );
        System.out.println(  pathRev("" ,3,3));
        System.out.println(  pathRevDia("" ,3,3));

    }

    static int count(int r , int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }

        int left = count(r-1,c);
                int right = count(r,c-1);

                return left+right;
    }



    static void path( String p,int r , int c)
    {
        if(r==1 && c==1)
        {
            System.out.print(p+ " ");
          return;
        }

      if(r>1)
      {
          path(p +'D',r-1,c);
      }

      if(c > 1)
      {
          path(p +'R',r,c-1);
      }

    }



    //paths list
    static ArrayList<String> pathRev(String p, int r , int c)
    {
        ArrayList<String> ans = new ArrayList<>();

        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(r>1)
        {
           ans.addAll(pathRev(p +'D',r-1,c));
        }

        if(c > 1)
        {
           ans.addAll(pathRev(p +'R',r,c-1));
        }
       return  ans;
    }


    // path list with V,H,diagonal(D)
    static ArrayList<String> pathRevDia(String p, int r , int c)
    {
        ArrayList<String> ans = new ArrayList<>();

        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(r>1 && c>1)
        {
            ans.addAll(pathRevDia(p +'D',r-1,c-1));
        }


        if(r>1)
        {
            ans.addAll(pathRevDia(p +'V',r-1,c));
        }

        if(c > 1)
        {
            ans.addAll(pathRevDia(p +'H',r,c-1));
        }
        return  ans;
    }


}
