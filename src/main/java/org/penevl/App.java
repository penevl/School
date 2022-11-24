package org.penevl;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {       

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input == 1 || input == 2){
            System.out.println("Ticket price is: " + 160 * (70 / 100));
        }else if (input == 3 || input == 4){
            System.out.println("Ticket price is: " + 160 * (75 / 100));
        }else{
            System.out.println("Ticket price is: " + 160);
        }

        sc.close();

    }
}
