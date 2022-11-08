package Stack_and_Queue.qns;
// Reverse the stack elements

import java.util.Arrays;
import java.util.Stack;

public class qns2 {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(56);
        stack.push(36);
        stack.push(7);
        stack.push(2);
        System.out.println(Arrays.toString(stack.toArray()));

        reverseTheStacl(stack);

        System.out.println(Arrays.toString(stack.toArray()));
    }



    static void reverseTheStacl(Stack<Integer> stack )
    {
        //base condition
        if(stack.isEmpty())
        {
            return;
        }

        int num = stack.peek();
        stack.pop();

        //recursive call
        reverseTheStacl(stack);
         insertAtBottom(num,stack);
    }

    static void insertAtBottom(int num , Stack<Integer> stack) {

        //base condition
        if(stack.empty())
        {
            stack.push(num);
            return;
        }

        int n = stack.peek();
        stack.pop();
        insertAtBottom(num,stack);
        stack.push(n);
    }
}
