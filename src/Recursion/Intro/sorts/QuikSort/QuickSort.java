package Recursion.Intro.sorts.QuikSort;

import java.util.Arrays;

import static Sorting.SWAP.swap;

public class QuickSort {

    public static void main(String[] args) {

    int[] arr = {34,54,7,23,5,7,99,25};
    quickSort(arr,0,arr.length-1);

//        Arrays.sort(arr); // internal sorting Algorithm

        System.out.println(Arrays.toString(arr));

    }



    // yes you can use new copy of our array but what happened , you create new object every time you call new recursion call
    // that's use some extra space
    // but, we not use this instead of this , we use pointers and pass them to function call

            static    void quickSort(int[] num  ,int low , int high)
            {

                if(low >=high)
                {
                    return;
                }

                int s = low;
                int e= high;
                int m = s + (e-s)/2;
                int pivot = num[m];

                while (s<=e)
                {

                    // also, a reason why if its already sorted it will not swap

                    while (num[s]<pivot)
                    {
                        s++;
                    }

                    while (num[e]>pivot)
                    {
                        e--;
                    }
//              now here both the s and e are at the position where numbers violation the condition so swap them
                    if(s<=e)  // now above two loops make cause this check happen to be false , bcoz outer loop check condition until whole execution take placed
                              // so we check only swap if it's true
                    {
                        swap(num,s,e);
                        s++;
                        e--;
                    }
                }

                // now my pivot is at correct index ,so we need to sort two half

                quickSort(num,low,e);  // for left half
                quickSort(num,s,high); // for right half
            }
}
