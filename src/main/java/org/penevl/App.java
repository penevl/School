package org.penevl;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of tree: ");
        char character = '*';
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++)
        {
            for(int j = n-i;j > 0;j--)
            {
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++)
            {
                System.out.print(character + " ");
            }
            System.out.println();
        }

        for (int i=0;i<2;i++){
            for (int x=0;x< n - 1;x++){
                System.out.print(" ");
            }
            System.out.println(character);
        }

    }
}
