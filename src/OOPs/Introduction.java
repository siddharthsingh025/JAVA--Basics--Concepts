package OOPs;

public class Introduction {

    public static void main(String[] args) {

        Student siddharth; // here we not make instance of class / or Object of class ,
                            // we just  create a reference to the object of class Student

        Student mohit = new Student(); // Now here we create an object of  class using new Keyword and  mohit as reference of it.

        // " new " keyword :: Dynamically allocate memory and return a reference  to it.

        // and this reference is stored in this mohit  variable;

        // all class objects in java must  be allocated dynamically
    }




}

/*
               Student mohit    =     new Student();
              ^ Compile time          ^ RunTime

 */

class Student
{
    int roll;
    int name;
    int marks;
}
