package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        
        int input = sc.nextInt();
        char character = '*';

        for (int i=0;i<input;i++){

            for (int x=0; x<input;x++) {
                System.out.print(character);
            }

            System.out.println(" ");

        }

        sc.close();
    }
}
