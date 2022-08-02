package Strings;

public class Comparision {

    public static void main(String[] args) {


        //   "==" -> COMPARATOR
        //  ".equal() -> METHODS

        String a = "Siddhu";
        String b = "Siddhu";
        System.out.println(a==b); // its give true , bcoz a nd b are now in string pool in heap , and pointing to a same object " sidhu"

        String name1 = new String("Himanshu");
        String name2= new String("Himanshu");

        System.out.println(name1==name2); // its give false ,
            // bcoz a and b are explicit created out of String pool in heap by creating two new objects of same value "siddhu"

        System.out.println(name1.equals(name2)); // its give true ,
                                        // this will check only values stored in these two reference variables , it just cares  about values stored
    }
}
