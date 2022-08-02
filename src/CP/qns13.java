package CP;

import java.util.LinkedList;
import java.util.Scanner;

public class qns13 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int t= in.nextInt();

        while(t>0)
        {
            LinkedList<Integer> head1 = new LinkedList<>();
            LinkedList<Integer> head2 = new LinkedList<>();

            int n = in.nextInt();

            for(int i =0 ; i<n ; i++)
            {
                head1.addLast(in.nextInt());
            }

            int m = in.nextInt();

            for(int i =0 ; i<m ; i++)
            {
                head1.addLast(in.nextInt());
            }

            merge(head1,head2);

            t--;
        }


    }


    private static void merge( LinkedList<Integer> first,  LinkedList<Integer> second) {
         LinkedList<Integer> mix = new LinkedList<>();

        int i= 0 , j=0,k=0;

        while (i<first.size() && j<second.size())
        {
            if(first.get(i)<second.get(j))
            {
               mix.add(k,first.get(i));
                i++;
            }

            else
            {
               mix.add(k,second.get(j));
                j++;
            }
            k++;
        }


        // any of them is still remaining then copy it all to mix
        // so only 1 of them will run
        while (i<first.size())
        {
            mix.add(k,first.get(i));
            i++;
            k++;
        }

        while (j<second.size())
        {
            mix.add(k,second.get(j));
            j++;
            k++;
        }

        System.out.println(mix.toString());
    }

    }


