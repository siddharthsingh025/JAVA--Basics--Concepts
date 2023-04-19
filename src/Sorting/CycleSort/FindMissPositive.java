package Sorting.CycleSort;

import static Sorting.SWAP.swap;

public class FindMissPositive {
    public int firstMissingPositive(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;  // element which is at wrong index in sorted array is at place of our missing no, so we return index+1 = correct element
            }
        }

        // case 2
        return arr.length + 1; // when array  has all correct no.s with its corresponding index { elem.= index+1}
                                        // then first positive missing number is = array length + 1;

    }
}
