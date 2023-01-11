package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum = 0;
        int count = 0;
        int input;

        do{

            input = sc.nextInt();

            if (input % 3 == 0 || input % 7 == 0){
                sum += input;
                count++;
            }

        }while(input != 7);

        System.out.println("Avarage is: " + (sum / count));

        sc.close();
    }
}
