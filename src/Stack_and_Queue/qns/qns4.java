package Stack_and_Queue.qns;

import java.util.Arrays;
import java.util.Stack;

//RedundantBrackets
public class qns4 {
    public static void main(String[] args) {

        String s= "((a+b)+(c))";
        System.out.println(  findReduntant(s));

    }

   static boolean  findReduntant(String s)
    {
       Stack<Character> stack = new Stack<>();
       for (int i =0;i<s.length();i++)
       {
           char ch =s.charAt(i);

           if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/')
           {
               stack.push(ch);
           }
           else
           {
               // when ch ')' or character

               if(ch==')')
               {
                   boolean isRedundant = true;

                   while (!stack.isEmpty() && stack.peek()!='(')
                   {
                       char top = stack.peek();
                       if( top=='+' || top=='-' || top=='*' || top=='/')
                       {
                           isRedundant = false;
                       }
                       stack.pop();
                   }

                   if(stack.isEmpty())
                       return true;

                   if(isRedundant)
                       return true;

                   stack.pop();

               }
           }
       }

   return false;
    }

}
