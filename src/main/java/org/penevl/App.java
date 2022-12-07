package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        System.out.println("Enter 2 numbers the second one higher than the first.");
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

        int n,m;
        int count = 0;
        int result = 0;

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 || i % 7 == 0){
                result += i;
                count++;
            }
        }

        float avarage = result / count;
        System.out.print("Avg. is: " + avarage);

        sc.close();
>>>>>>> b180139b542a566b96e93b0f0114dc94555d79fa

    }
}
