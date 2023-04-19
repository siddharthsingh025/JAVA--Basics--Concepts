package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a'+i); // explicitly type casting , integer to char
            series = series + ch;

        }

        System.out.println(series);
    }
}


// so here , out time complexity is O(N^2) which is very bad bcoz here we are creating new object every time ,
// which make our program for taking more time and more space which wastage of space

// so we need any other String datatype that can be modified on existing String , so here "STRING Builder" is comes in the picture

