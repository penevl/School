package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        Scanner sc = new Scanner(System.in);
        int m,n;
        int count = 0;
        int sum = 0;

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

    }
}
