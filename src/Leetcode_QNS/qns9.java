package Leetcode_QNS;


public class qns9 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        int[] ans = productExceptSelf(array);
        for (int n : ans
        ) {
            System.out.print(n + " ");
        }

    }

    //Solution with time complexity O(n)

    static public int[] productExceptSelf(int[] X) {

        int n = X.length;

        int[] prefixProduct = new int[n];
        int[] suffixProduct =  new int[n];
        int[] product  =  new int[n];

        prefixProduct[0] = 1;
        for (int i = 1; i < n; i = i + 1)
            prefixProduct[i] = X[i - 1] * prefixProduct[i - 1];

        suffixProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i = i - 1)
            suffixProduct[i] = X[i + 1] * suffixProduct[i + 1];

        for (int i = 0; i < n; i = i + 1)
            product[i] = prefixProduct[i] * suffixProduct[i];

        return product;
    }
}

// my try

//        int[] arr= new int[nums.length];
//        int n=nums[0];
//       int m=nums[0];
//       for (int i =0; i <nums.length; i++) {
//          n=n*nums[i];
//       }  // n times
//
//
//       if(n==0)
//       {
//           for (int i =0; i <nums.length; i++) {
//               if(nums[i]!=0)
//               {
//                   m=m*nums[i];
//               }
//
//           }
//       }
//
//
//       for (int i = 0; i <nums.length; i++) {
//
//           if(nums[i]==0)
//           {
//               arr[i]=m;
//           }
//           else
//           {
//               arr[i]=n/nums[i];
//           }
//
//
//       }//n times
//
//
//       // hence O( n+n) = O(n);
//
//        return arr;
//    }
//x
//


//}
