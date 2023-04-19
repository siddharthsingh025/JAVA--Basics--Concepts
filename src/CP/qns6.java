package CP;

import java.util.Scanner;

public class qns6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        System.out.println(" ");

        int count=0;

        while (T!=0)
        {
            int  N= input.nextInt();
            int[] arr =  new int[N*2];
            System.out.println(" ");
            for (int i = 0; i <N*2; i++) {
               arr[i] = input.nextInt();
                System.out.print(" ");
            }

            int eves=NoOfEve(arr);
            int odds = 2*N-eves;

            if(eves==odds)
            {
                System.out.println(0);

            }
            else
            {

                int i=0;

                while (odds>eves)
                {
                    if(arr[i]%2!=0)
                    {
                        arr[i]=arr[i]*2;
                        eves++;
                        count++;
                    }

                    i++;
                }

                while (odds<eves)
                {


                    if(arr[i]%4==0)
                    {
                        continue;
                    }
                    else if(arr[i]%2==0 && arr[i]%4!=0 )
                    {
                        arr[i]=arr[i]/2;
                        odds++;
                        count++;
                    }

                    i++;
                }

                System.out.println(count);
                }

            T--;
            }



        }

    static int NoOfEve(int[] arr)
    {int count=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2==0){
                count++;
            }
        }

        return count;
    }
}


