package Recursion.Intro.arrayQNS;

public class Sorted {

    // Array is sorted or not using Recursion

    public static void main(String[] args) {

        int[] array = { 1,2,3,5,4,6,7};

        System.out.println(sorted(array,0));

    }

    static boolean sorted(int[] arr , int index)
    {
        //base condition
        if(index==arr.length-1)
        {
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr,index + 1);

    }
}
