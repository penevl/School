package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int n;
        char character = '*';
        n = sc.nextInt();


        for (int i = 0; i < 3; i++) {

            for (int x = 1;x <= n;x++)
                System.out.print(character);
            System.out.println(" ");
        }

        sc.close();

    }
}
