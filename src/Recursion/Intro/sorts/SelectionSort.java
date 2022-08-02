package Recursion.Intro.sorts;
import java.util.Arrays;
import static Sorting.SWAP.swap;



public class SelectionSort {

    public static void main(String[] args) {

        int[] ar = {4,3,2,1};
        sort(ar,ar.length,0,0);
        System.out.println(Arrays.toString(ar));
    }



    static void sort(int[] arr,int r, int c ,int max)
    {
        if(r==0)
        {
            return;
        }

        if(c<r)
        {
            if(arr[max]<arr[c])
            {
                sort(arr,r,c+1,c);
            }
            else {
                sort(arr,r,c+1,max);
            }
        }
        else
        {
            swap(arr,max,r-1);
            sort(arr,r-1,0,0);
        }


    }
}
