package com.company;

import java.util.Scanner;

public class positive_negative_sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt(); ;
        int negativenmbr=0;
        int evenadd=0;
        int oddadd=0;
        while (  num!=0){
            if(num<0){
                negativenmbr+=num;
            }
            else if(num>0&&num%2==0){
                evenadd+=num;
            }
            else if(num>0&&num%2!=0){
                oddadd+=num;
            }
            System.out.println("Press 0 to exit");
            num=input.nextInt();
        }

        System.out.println("Sum of negative number :" +negativenmbr);
        System.out.println("sum of positiive even number :" +evenadd);
        System.out.println("Sum of positive odd number :" +oddadd);


    }
}
