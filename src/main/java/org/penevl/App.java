package org.penevl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        List<Integer> nums = new ArrayList<Integer>();

        for (int i=1;i<=input;i++){
            if(i % 2 == 0)
                nums.add(i);
        }

        if (!(nums == null)){
            int sum = 0;
            for (int i : nums)
                sum = sum + i;
            float result = sum / nums.size();
            System.out.println("Result: " + result);
        }else
            System.out.println("No whole numbers");

    }
}
