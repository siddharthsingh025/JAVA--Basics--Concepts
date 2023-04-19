package Internship_codingRn_qns;

public class Solutionp1_microsoftSWE {

//    Solved microsoft SWE qns

    public static void main(String[] args) {

        String s1= "abccbd";
        int[] arr1 = {0,1,2,3,4,5};

        String s2 = "aabbcc";
        int[] arr2 = {1,2,1,2,1,2};

        String s3 = "aaaa";
        int[] arr3 = {3,4,5,6};


        String s4 = "ababa";
        int[] arr4 = {10,5,10,5,10};


        System.out.println(solution(s1,arr1));
        System.out.println(solution(s2,arr2));
        System.out.println(solution(s3,arr3));
        System.out.println(solution(s4,arr4));
    }



    static public int solution(String S, int[] C) {
        // write your code in Java SE 8
        return cost(S,C,0,0);

    }


    static int cost(String up , int[] c , int i , int ans)
    {
        if(up.length()==1)
        {
            return ans;
        }

        char current = up.charAt(0);
        char next = up.charAt(1);

        if(current==next)
        {
            ans = ans + c[i];
            ++i;
           return cost(up.substring(1),c,i,ans);
        }

            ++i;
           return cost(up.substring(1),c,i,ans);

    }
}
