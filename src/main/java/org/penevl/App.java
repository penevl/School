package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers");
        int input = sc.nextInt();

        while (input != 0){

            System.out.print(input % 10);
            input = input / 10;

        }

    }
}
