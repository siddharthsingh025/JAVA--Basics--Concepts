package AnyPatternsQns;

public class Patterns {

    /*

 Steps to be takes ::

 + No. of lines = No. of rows = No. of times outer loop will run
 +Identify for every row number ,
   -> How many column are there
   -> Try to find formula relating row and column
 +What do you need to print

     */

    public static void main(String[] args) {

        pattern1(5);

        System.out.println();
        pattern2(5);

        System.out.println();
        pattern3(5);

        System.out.println();
        pattern4(5);

        System.out.println();
        pattern5(5);

        System.out.println();
        pattern6(5);

        System.out.println();
        pattern7(5);


        System.out.println();
        pattern8(4);

        System.out.println();
        pattern9(4);


    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            // here for every row , run the column till row no.

            for (int j = 1; j <= i; j++) {

                System.out.print(" *");
            }
            // we need to print newline after every row complete
            System.out.println();
        }
    }


    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            // here for every row , run the column till row no.

            for (int j = 1; j <= n; j++) {

                System.out.print(" *");
            }
            // we need to print newline after every row complete
            System.out.println();
        }
    }


    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            // here for every row , run the column till row no.

            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(" *");
            }
            // we need to print newline after every row complete
            System.out.println();
        }
    }


    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            // here for every row , run the column till row no.

            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j);
            }
            // we need to print newline after every row complete
            System.out.println();
        }
    }


    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int totalColmn = row > n ? 2 * n - row : row;
            for (int clm = 0; clm < totalColmn; clm++) {

                System.out.print(" *");
            }
            // we need to print newline after every row complete
            System.out.println();
        }
    }


    static void pattern6(int n) {    // here we just add space before printing * of above pattern5 method ,
        // both pattern 5 and 6 have same no of *
        for (int row = 0; row < 2 * n; row++) {

            int totalColmn = row > n ? 2 * n - row : row;
            int totalSpace = n - totalColmn;

            for (int i = 0; i < totalSpace; i++) {
                System.out.print(" ");
            }

            for (int clm = 0; clm < totalColmn; clm++) {

                System.out.print(" *");
            }
            // we need to print newline after every row complete
            System.out.println();
        }
    }


    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {

            for (int i = 0; i < n - row; i++) {
                System.out.print("  ");
            }

            for (int clm = row; clm >= 1; clm--) {

                System.out.print(clm + " ");
            }

            for (int clm = 2; clm <= row; clm++) {

                System.out.print(clm + " ");
            }

            System.out.println();
        }
    }


    static void pattern8(int n) {    // here we just add space before printing * of above pattern5 method ,
        // both pattern 5 and 6 have same no of *
        for (int row = 1; row <2 * n; row++) {

            int totalColmn = row > n ? 2 * n - row : row;
            int totalSpace = n - totalColmn;

            for (int i = 1; i <=totalSpace; i++) {
                System.out.print("  ");
            }

                for (int clm = totalColmn; clm >= 1; clm--) {

                    System.out.print(clm + " ");
                }

                for (int clm = 2; clm <= totalColmn; clm++) {

                    System.out.print(clm + " ");
                }

            // we need to print newline after every row complete
            System.out.println();
        }
    }

    static void pattern9(int n) {
        int N=n;
        n=n*2;
        for (int row = 0; row <=n; row++) {

            for (int clm =0; clm <=n; clm++) {

                int everyValueOfIndex = N- Math.min(Math.min(row,clm),Math.min(n-row,n-clm));
                System.out.print(everyValueOfIndex+" ");

            }
            System.out.println();
        }


    }

}
