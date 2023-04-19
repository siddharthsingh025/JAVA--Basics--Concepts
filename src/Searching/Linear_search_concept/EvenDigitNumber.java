package Searching.Linear_search_concept;

public class EvenDigitNumber {
    public static void main(String[] args) {

        // QNS:: In given array , return how many of them contain even number of digits;

        int[] arr = {12, 345, 2, 6, 7896};

        int num = evenDigit(arr);
        System.out.println(num);

    }

    //function tell us how many numbers of arrays contains even no. of digit
    static int evenDigit(int[] arr) {

        int count = 0;
        for (int n : arr) {
            if (evenNo(n)) {
                count++;
            }

        }

        return count;
    }


    // function contains whether the given no. contains even no digit or not
    private static boolean evenNo(int n) {

        if(n<0)
        {
            n=n*-1;
        }

        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        /*
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }

         */

        return  (count % 2 == 0);
    }


// ***************************************************************************************************************

    //   ++ ALTERNATIVE  for evenNo function++

    private static boolean evenNo2(int n) {

        int num = (int)( Math.log10(n) ) +1 ;
                                                        //its 95% faster than previous evenNo
        return num % 2 == 0;
    }


    // if you want to count how many digits in a number then you use below statement , its 95% faster than previous

     //return  (int) ( Math.log10(num) ) +1 ;


    // ***************************************************************************************************************
}





