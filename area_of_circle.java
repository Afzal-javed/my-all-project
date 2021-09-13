package com.company;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius of circle");

       int radius=input.nextInt();
       double area= 22/7 *radius*radius;
        System.out.println("The area of circle is :" +area);

    }
}
