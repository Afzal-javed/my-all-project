package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class faboccai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        int a=0;
        int b=1;
        int r=0;
        for (int i=0;i<num;i++)
        {
            r=a+b;
            a=b;
            b=r;
            System.out.println(a +" ");
        }
    }
}
