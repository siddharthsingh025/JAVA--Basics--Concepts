package Internship_codingRn_qns;

public class s1 {

    public static void main(String[] args) {

        System.out.println(isPalindrom("aabcbaa"));

    }

    static  boolean isPalindrom(String str )
    {
        return  help( str , 0, str.length()-1);
    }

    static  boolean help(String str , int s, int e)
    {

        if(s>e)
        {
            return true;
        }

        if(str.charAt(s)==str.charAt(e))
        {
            return help(str, ++s, --e);
        }

        return false;
    }


}
