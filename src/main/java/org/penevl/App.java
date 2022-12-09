package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            sum = sum + 1 + 1.0 / (i*i);

        }

        System.out.println(sum);

        sc.close();

    }
}
