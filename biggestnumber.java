package com.company;

import java.util.Scanner;

public class biggestnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number till find the greatest number");
        int num = 1;
        int r=0;
        while (num!=0){
            if (num>r)
            {
                r=num;
            }


            System.out.println("PRESS 0 TO EXIT");
            num=input.nextInt();
        }
        System.out.println("the max number is :"+r);
    }
}
