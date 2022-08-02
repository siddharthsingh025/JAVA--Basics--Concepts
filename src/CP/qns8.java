package CP;

import java.util.Scanner;

// ++ SLOW

public class qns8 {
    public static void main (String[] args) throws java.lang.Exception
    {

        try{
            // your code goes here

            Scanner input= new Scanner(System.in);
            int t = input.nextInt();

            while(t>0)

            {
                int tmax = input.nextInt();
                int nmax = input.nextInt();
                int smax = input.nextInt();

                int s=smax;
                int l=1;
                int ans= 0;

                while(s>0)
                {
                    s=s-nmax;

                    if(s>0){
                        if(l<=tmax)
                        {
                            ans+=nmax*nmax;
                            l++;
                        }
                        else { break;}


                    }
                    else{
                        int k = s+nmax;

                        ans+=k*k;
                    }

                }

                System.out.println(ans);

                t--;
            }


        }catch(Exception e){
            return;
        }
    }
}
