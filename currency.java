package com.company;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter indian currency");
        float curr=input.nextFloat();
        float dollar=curr/75;
        System.out.println("in dollar: " +dollar);
    }
}
