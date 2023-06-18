package Leetcode_QNS;

import java.util.ArrayList;

public class qns_inversion {


    public static void main(String[] args) {
        int[] a = { 1 ,4 ,3 ,3, 5 ,5};
        System.out.println(lenOfLongSubarr(a,6,16));
    }
      static   public int reversePairs(int[] nums) {

            // here we use 2 things
            // : 1st two pointers mathod
            // : array may not be sorted for that we use mergeshort so that within calculation we can short it also

            return mergeSort(nums, 0 , nums.length-1 );

        }

     static    int countPath(int[] arr ,int  low ,int  mid , int high ){

            int r =mid + 1;
            int c=0;
            for(int i =low ; i<= mid ; i++){
                while(r <= high && arr[i] > 2*arr[r]) {r++ ;}
                c += (r - (mid +1));
            }

            return c;
        }


    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function

        int left =0 , right =0;
        long sum = A[0];
        int maxLen=0;
        int n = A.length;
        while(right<n){

            while(left <= right && sum > K){
                sum -= A[left];
                left++;
            }

            int len = right-left+1;
            if(sum==K){
               maxLen= Math.max(maxLen,len);
            }
            right++;
            if(right<n) sum += A[right];
        }

        return maxLen;
    }


      static   public  int mergeSort(int[] arr, int low, int high) {
            int cnt =0;
            if (low >= high) return cnt;
            int mid = (low + high) / 2 ;
            cnt +=  mergeSort(arr, low, mid);  // left half
            cnt +=  mergeSort(arr, mid + 1, high); // right half
            cnt +=  countPath(arr , low , mid ,high );
            merge(arr, low, mid, high);  // merging sorted halves
            return cnt;
        }

      static   private  void merge(int[] arr, int low, int mid, int high) {
            ArrayList<Integer> temp = new ArrayList<>(); // temporary array
            int left = low;      // starting index of left half of arr
            int right = mid + 1;   // starting index of right half of arr

            //storing elements in the temporary array in a sorted manner//

            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {
                    temp.add(arr[right]);
                    right++;
                }
            }

            // if elements on the left half are still left //

            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }

            //  if elements on the right half are still left //
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }

            // transfering all elements from temporary to arr //
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }

}
