package Internship_codingRn_qns;

public class sol {

    public static void main(String[] args) {

    }

    static String isVowel(String p , String up)
    {
        if(up.isEmpty())
        {
            return p;
        }

        char ch = up.charAt(0);
        if(ch =='a' ||ch =='e'  ||ch =='i' ||ch =='o' ||ch =='u')
        {
          return   isVowel(p,up.substring(1));
        }

        return  isVowel(p + ch,up.substring(1));
    }

}
