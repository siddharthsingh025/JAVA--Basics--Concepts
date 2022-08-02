package Recursion.Intro.arrayQNS;

public class LinearSearch {

    public static void main(String[] args) {

        int[] ar = { 12,3 ,34,7,1,2,67,89};
        System.out.println(findIndex(ar,1,0));
    }



    static boolean find(int[] arr , int target , int index)
    {
        if(index==arr.length)
        {
            return false;
        }

        return arr[index]==target || find(arr,target,index + 1);
    }


    // for return index


    static int findIndex(int[] arr , int target , int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }

       return   findIndex(arr , target ,index + 1);
    }
}
