package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("choose operation" );
        char op=input.next().trim().charAt(0);
        System.out.println("Enter two number" );
        int a=input.nextInt();
        int b=input.nextInt();
        int r=0;
        if(op=='+')
        {
            r=a+b;

        }
        else if(op=='-'){
            r=a-b;
        }
        else if(op=='*'){
            r=a*b;
        }
        else if(op=='/'){
            r=a/b;
        }
        else{
            System.out.println("wrong input");
        }
        System.out.println("answer is :" +r);


    }
}
