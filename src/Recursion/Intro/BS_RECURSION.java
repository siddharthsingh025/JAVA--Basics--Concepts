package Recursion.Intro;

public class BS_RECURSION {
    //BINARY SEARCH using Recursion

    public static void main(String[] args) {

        int[] array = {2,4,6,7,9,10,77,99,100};
        int ans = BSearch(array,77,0,array.length-1);
        System.out.println(ans);

    }


    static int BSearch(int[] arr , int target , int s, int e)
    {
        if(s>e) {
            return -1;
        }

        int m = s + (e-s)/2 ;

        if(arr[m]==target) {
            return m;
        }

        if(target<arr[m]) {
            return BSearch(arr ,target,s ,m-1);
        }

        return BSearch(arr ,target,m+1 ,e);
    }
}
