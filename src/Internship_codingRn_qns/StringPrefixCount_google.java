package Internship_codingRn_qns;

import java.util.Arrays;

public class StringPrefixCount_google {

    public static void main(String[] args) {

        String[] s = {"aab", "aac"};

        int[] ans = CountPrefix(2,3,s);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] CountPrefix(int n, int k, String[] s) {

        int[] ans = new int[n];

        for (int i=0;i<n;i++)
        {
            int t=0;

            StringBuilder str1 = new StringBuilder();
            str1.append(s[i]);
            for (int j=0; j<n;j++)
            {

                StringBuilder str2 = new StringBuilder();
                str2.append(s[j]);

                for (int q=k ; q>0 ; q--)
                {
                    char[] array1 = new char[q];
                    str1.getChars(0,q,array1,0);
                    String x = new String(array1);

                    char[] array2= new char[q];
                    str2.getChars(0,q,array2,0);
                    String y= new String(array2);

                    if(x.equals(y))
                    {
                        t++;
                    }
                }
            }

            ans[i] = t;
        }

        return ans;
    }
}
