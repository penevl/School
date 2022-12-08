package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {       

        System.out.println("Enter 2 numbers the second one higher than the first.");
        Scanner sc = new Scanner(System.in);

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
        if (avarage == 0) {
            System.out.println("No numbers matched the required conditions");
        }else{
            System.out.print("Avg. is: " + avarage);
        }
        sc.close();

    }
}
