package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        System.out.println("Enter a number higher than 5");
        Scanner sc = new Scanner(System.in);
        int m,n;
        int count = 0;
        int sum = 0;

<<<<<<< HEAD
        do{

            n = sc.nextInt();
            if (n < 100 && n > 999)
                System.out.println("You need to enter a 3 digit number");

        }while(n < 100 && n > 999);


        do{

            m = sc.nextInt();
            if (m < 100 && m > 999)
                System.out.println("You need to enter a 3 digit number");

        }while(m < 100 && m > 999);

        for (int i=n;i<m;i++){
            if (i/10%10 == 3) {
                count++;
                sum = sum + i;
            }
        }

        System.out.println("Count is: " + count);
        System.out.println("Sum is: " + sum);
=======
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
>>>>>>> b180139b542a566b96e93b0f0114dc94555d79fa

    }
}
