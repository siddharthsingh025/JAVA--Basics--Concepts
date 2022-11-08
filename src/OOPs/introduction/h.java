package OOPs.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class h {

    public static void main(String[] args) {

        List<String> expressions = new ArrayList<>();
        expressions.add("<>>>");
        expressions.add("<>>>>");

        List<Integer> maxReplacements = new ArrayList<>();
        maxReplacements.add(2);
        maxReplacements.add(2);

        List<Integer> ans = balancedOrNot(expressions,maxReplacements);

        System.out.println(ans.toString());

    }

    public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {

        List<Integer> ans = new ArrayList<>();
        int i=0;

        expressions.sort(null);
        for(String s : expressions)
        {
            int n = isBalanced(s);
            int c = maxReplacements.get(i);
            if(n==c)
            {
                ans.add(1);
            }
            else
            {
                ans.add(0);
            }
            i++;
        }

        return ans;
    }


    static int isBalanced(String s)
    {
        Stack <Character> stack = new Stack<>();
        int count=0;

        while(!s.isEmpty())
        {
            char ch = s.charAt(0);

            if(ch=='<')
            {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())
                {
                    count++;
                }
                else{
                    stack.pop();
                }
            }

            s.substring(1);
        }

        return count;
    }

}
