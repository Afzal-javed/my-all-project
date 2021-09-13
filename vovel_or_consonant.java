package com.company;

import java.util.Scanner;

public class vovel_or_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char alpha = input.next().trim().charAt(0);



            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
                System.out.println("vowel alphabet");
            } else {
                System.out.println("consonent");
            }
        }

}
