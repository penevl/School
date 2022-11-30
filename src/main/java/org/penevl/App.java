package org.penevl;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {       

        System.out.println("Enter a number higher than 5");
        Scanner sc = new Scanner(System.in);

        int input;
        int result = 1;

        do{

            input = sc.nextInt();
            if (input < 5)
                System.out.println("The number must be higher than 5");
        
        }while(input < 5);

        for (int i=1;i<input;i++){
            if(i % 5 == 0){
                result = result * i;
            }
        }

        System.out.println(result);

        sc.close();

    }
}
