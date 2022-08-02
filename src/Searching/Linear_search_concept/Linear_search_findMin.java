package Searching.Linear_search_concept;

public class Linear_search_findMin {
    public static void main(String[] args) {
        int[] arr = { 1 ,2,564, -34, 4,-3,3 ,5,39};
        int min = findMin(arr);

        System.out.println("minimum :  "+ min);
    }


    private static int findMin(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(min>arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
}
