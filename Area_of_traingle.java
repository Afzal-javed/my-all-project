package com.company;

import java.util.Scanner;

public class Area_of_traingle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length and breadth of the triangle ");
        int l=input.nextInt();
        int b=input.nextInt();

        double area=0.5*l*b;
        System.out.println("the area of triangle is :" +area);

    }
}
