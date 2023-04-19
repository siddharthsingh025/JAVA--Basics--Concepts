package Stack_and_Queue.qns;

import java.util.Arrays;
import java.util.Stack;

// delete middle element in the stack
public class qns1 {

   static void solve(Stack<Integer> inputStack , int count , int size)
    {
        //base case
        if(count==size/2)
        {
            inputStack.pop();
            return;
        }

        int num = inputStack.peek();
        inputStack.pop();

        //Recursive call
        solve(inputStack,count+1,size);
        inputStack.push(num);
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(56);
        stack.push(36);
        stack.push(7);
        stack.push(2);
        solve(stack,0,stack.size());

        System.out.println(Arrays.toString(stack.toArray()));

    }
}
