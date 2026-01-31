package com.java.codingquestion.level2;

import java.util.Scanner;

public class SmallestDigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n;
        n = sc.nextInt();
        int min = n%10; //6
        while(n>0){
            int digit = n%10;//6
            if(digit<min){
                min=digit;
            }
            n=n/10;
        }
        System.out.println("Smallestt digit in a number: "+min);
    }
}
