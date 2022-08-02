package CP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class subset
{


    public static void main(String[] args) {

        int[] a = {1,2,3};

        printSubArrays(a,0,0);
    }
    static void printSubArrays(int[] arr, int start, int end)
    {
        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;
            // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
            // Print the subarray and increment the starting
            // point
        else {
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + ", ");
            printSubArrays(arr, start + 1, end);
        }
        return;
    }
}