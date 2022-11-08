package Stack_and_Queue.qns;
//sort the stack

import java.util.Arrays;
import java.util.Stack;

public class qns3 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        stack.push(2);
        stack.push(56);
        stack.push(22);
        stack.push(7);
        stack.push(1);

        System.out.println(Arrays.toString(stack.toArray()));

        sortStack(stack);

        System.out.println(Arrays.toString(stack.toArray()));
    }


  static   void sortStack(Stack<Integer> stack)
    {
        //base
        if(stack.empty())
        {
            return;
        }

        int num = stack.peek();
        stack.pop();

        //recursive call
        sortStack(stack);

        sortingInsert(stack,num);
    }

    static void sortingInsert(Stack<Integer> stack, int num) {
        //base
        if(stack.empty() || (!stack.empty() && stack.peek()<num))
        {
            stack.push(num);
            return;
        }

        int n = stack.peek();
        stack.pop();

        //recursive call
        sortingInsert(stack,num);

        stack.push(n);
    }
}
