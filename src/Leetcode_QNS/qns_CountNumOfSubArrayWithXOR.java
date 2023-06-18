package Leetcode_QNS;

import java.util.HashMap;
import java.util.Map;

public class qns_CountNumOfSubArrayWithXOR {

    public int solve(int[] A, int B) {

        Map<Long,Integer> mpp = new HashMap<Long,Integer>();
        long sum = 0;
        int maxLen=0;
        int N = A.length;
        mpp.put(sum,1);


        for(int i=0; i<N; i++){

            sum = sum^A[i];
            long rem = sum^B;
            if(mpp.containsKey(rem)){
                maxLen = maxLen + mpp.get(rem);
            }
            if(mpp.containsKey(sum))  mpp.put(sum,mpp.get(sum)+1);
            else{mpp.put(sum,1);}

        }
        return maxLen;
    }
}

