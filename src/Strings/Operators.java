package Strings;

import java.util.ArrayList;

public class Operators {
        public static void main(String[] args) {
            System.out.println('a' + 'b');
            System.out.println("a" + "b");
            System.out.println((char)('a' + 3));  // type casting done ( explicit casting )

            System.out.println("a" + 1);
            // this is same as after a few steps: "a" + "1"
            // integer will be converted to Integer that will call toString()

            System.out.println("Kunal" + new ArrayList<>());
            System.out.println("Kunal" + new Integer(56));

//            System.out.println(   new Integer(56) + new ArrayList<>())  // this will not work bcoz its  expression now ,
                            // bcoz + will work only on primitive data type and if any of data is string  like bellow ( bcoz + here concatenating to stirngs,
                                // OPERATOR OVERLOADING ( + work as addition and concatenating operator )
            String ans = new Integer(56) + "" + new ArrayList<>();
            System.out.println(ans);
            System.out.println("a" + 'b');
        }
    }

