package com.company;

import java.util.Scanner;

public class sum_of_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n to sum");
        int n=input.nextInt();
        int sum=0;
        int c=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
            c++;
        }
        double average=sum/c;
        System.out.println("the average of n number :" +average);
    }
}
