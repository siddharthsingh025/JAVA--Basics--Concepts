package AnyPatternsQns;

import java.util.ArrayList;

public class f {


    public static void main(String[] args) {
        int[] arr= {135 ,101 ,170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127 ,172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};

        ArrayList<Integer> list =  subarraySum(arr,42 ,468);
        System.out.println(list);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int start =0;
        int end =0;
        int sum=0;
        while(sum!=s)
        {
            if(sum>s)
            {

                sum -= arr[start];
                start++;
            }
            else if(sum<s)
            {   sum += arr[end];
                end++;
            }

        }

        while(start<end)
        {
            ans.add(arr[start]);
            start++;
        }
        return ans;
    }
}


