package Leetcode_QNS;

public class qns4 {

    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

    }

   static public boolean checkIfPangram(String sentence) {
        boolean[] check =  new boolean[26];

        for (char i = 97; i<=122 ; i++) {

            for (int j = 0; j <sentence.length(); j++) {

                if(i==sentence.charAt(j))
                {
                    check[i-97]=true;
                    break;
                }
            }

        }

       for (int i = 0; i < check.length; i++) {

           if(!check[i])
           {
               return false;
           }
       }
        return true;
    }

}
