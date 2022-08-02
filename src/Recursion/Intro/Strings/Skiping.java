package Recursion.Intro.Strings;

public class Skiping {

    public static void main(String[] args) {
//        skip(" ", "baccdahas");
        System.out.println( skip2("baccdahas"));
        System.out.println( skipApple("bdaappleld"));
        System.out.println( skipAppNotApple("bdaappleldapps"));
    }



    // Approach 1
    static void skip(String p , String up)   // p-processed  , up - un processed (original one )
    {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='a')
        {
            skip(p,up.substring(1));
        }

        else
        {
            skip(p + ch,up.substring(1));
        }
    }



    // Approach 2

      static String skip2(String up)   // p-processed  , up - un processed (original one )
        {
            if(up.isEmpty()) {
                return "";
            }

            char ch = up.charAt(0);

            if(ch=='a') {
                return  skip2(up.substring(1));
            }
            else {
                 return ch + skip2(up.substring(1));
            }
        }


        // skip the apple

    static String skipApple(String up)   // p-processed  , up - un processed (original one )
    {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("apple")) {
            return  skipApple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    // skip app Not apple

    static String skipAppNotApple(String up)   // p-processed  , up - un processed (original one )
    {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")) {
            return  skipAppNotApple(up.substring(3));
        }
        else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }


}
