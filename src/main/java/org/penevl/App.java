package org.penevl;

import java.util.Scanner;

public class App
{

    private static float getLength(float radius){
        return 2*3.14f*radius;
    }
    private static float getSurface(float radius){
        return 3.14f*radius*radius;
    }

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        System.out.println("Length is: " + getLength(radius));
        System.out.println("Surface is: " + getSurface(radius));

        System.out.println("-----------Examples-----------");
        for (float i=0.5f;i<=4;i+=0.5){
            System.out.println("Example value is: " + i + "    Length is: " + getLength(i) + "   Surface is: " + getSurface(i));
        }

        sc.close();
    }
}
