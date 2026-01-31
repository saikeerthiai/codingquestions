package com.java.codingquestion.level2;

import java.util.Scanner;

public class LargestDigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n;
        n = sc.nextInt();
        int max=0;
        while(n>0){
            int digit = n%10;
            if(digit>max){
                max=digit;
            }
            n=n/10;
        }
        System.out.println("Largest digit in a number: "+max);
    }
}
