package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers");
        int count = 0;
        int input;

        do {

            input = sc.nextInt();
            if(input % 2 == 0 && input != 0)
                count++;

        }while(input != 0);

        System.out.println(count);

    }
}
