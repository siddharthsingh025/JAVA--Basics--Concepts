package Recursion.Intro;

import java.util.ArrayList;

public class Dice_recursionSubset {

    public static void main(String[] args) {

        dice("",4);
        System.out.println();
        System.out.println(diceList("",5));
          dice2("",9 , 8);
    }

    static void dice(String p , int target)
    {

        if(target==0)
        {
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <=target && i<=6; i++) {

            dice(p + i,target-i);
        }
    }


    static ArrayList<String> diceList(String p , int target)
    {

        if(target==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=target && i<=6; i++) {

          ans.addAll(diceList(p + i,target-i)) ;
        }

        return ans;
    }


    // if faces given to you that 6 face dice , 8 face etc


    static void dice2(String p , int target , int face)
    {

        if(target==0)
        {
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <=target && i<=face; i++) {

            dice2(p + i,target-i , face);
        }
    }

}
