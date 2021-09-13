package com.company;

import java.util.Scanner;

public class productandsubtract {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        int r=0;
        int product=1;
        int sum=0;

        while (num>0){
            r=num%10;
            product*=r;
            sum+=r;
            num=num/10;
        }

        System.out.println(product-sum);
    }
}
