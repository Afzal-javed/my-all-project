package com.company;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the three number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("largest number is :" + a);
            if (b > c) {
                System.out.println("medium number is :" + b);
                System.out.println("smallest number is :" + c);
            } else if (c > b) {
                System.out.println("medium number is :" + c);
                System.out.println("smallest number is :" + b);
            } else {
                System.out.println(b + " and" + c + " are equal");

            }
            }
        else if (b > c && b > a) {
                System.out.println("largest number is :" + b);
                if (a > c) {
                    System.out.println("medium number is :" + a);
                    System.out.println("smallest number is :" + c);
                } else if (c > a) {
                    System.out.println("medium number is :" + c);
                    System.out.println("smallest number is :" + a);
                } else {

                    System.out.println(c + " and" + a + " are equal");
                }
            } else if (c > a && c > b) {
                System.out.println("largest number is :" + c);
                if (a > b) {
                    System.out.println("medium number is :" + a);
                    System.out.println("smallest number is :" + b);
                } else if (b > a) {
                    System.out.println("medium number is :" + b);
                    System.out.println("smallest number is :" + a);
                } else {
                    System.out.println(b + " and" + a + " are equal");
                }
            } else {
                System.out.println("all are equal");
            }
        }
    }

