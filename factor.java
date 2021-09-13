package com.company;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
