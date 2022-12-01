package org.penevl;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {       

        System.out.println("Enter a number higher than 5");
        Scanner sc = new Scanner(System.in);

        int input;
        int count = 0;
        int result = 1;

        do{

            input = sc.nextInt();
            if (input < 5)
                System.out.println("The number must be higher than 5");
        
        }while(input < 5);

        for (int i=1;i<input;i++){
            if(i % 5 == 0){
                count++;
                result = result * i;
            }
        }

        System.out.println("Result is: " + result);
        System.out.println("Number of numbers divisible by 5 is: " + count);
        // Не е възможно да няма числа които се делят на 5 защото се проверява дали числото въведено е по-малко от 5

        sc.close();

    }
}
