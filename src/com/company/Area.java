package com.company;

import java.util.Scanner;

public class Area {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        double radius = input.nextDouble();
//        System.out.println(radius);

        System.out.println("The area of a circle with radius " + radius + " is " + circle(radius));



    }

    public static double circle(double userRadius) {
        return Math.PI * userRadius * userRadius;
    }

}
