package com.company;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();
        if (n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
