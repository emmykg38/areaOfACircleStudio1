package com.company;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        String radius = input.nextLine();
        if (radius.equals("")) {
            System.out.println("Invalid entry");
        } else {
            double convertedRadius = Double.parseDouble(radius);
            if (convertedRadius < 0) {
                System.out.println("Invalid entry");
            } else {
                double area = Circle.getArea(convertedRadius);
                System.out.println("The area of a circle with radius " + radius + " is " + area);
            }
        }

    }

}
