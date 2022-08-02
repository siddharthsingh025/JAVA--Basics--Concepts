package Stack_and_Queue;

public class stack_ex {

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        stack.push(34);
        stack.push(56);
        stack.push(36);
        stack.push(7);
        stack.push(2);
//        stack.push(1);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
