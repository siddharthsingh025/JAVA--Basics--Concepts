package Internship_codingRn_qns;

public class s {

    public static void main(String[] args) {

        System.out.println(check("111111"));
    }


    static  boolean check(String s)
    {
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)=='0')
            {
                return false;
            }
        }

        return true;
    }


    {

    }


}
