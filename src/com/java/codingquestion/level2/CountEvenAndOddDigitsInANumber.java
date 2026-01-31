package com.java.codingquestion.level2;

import java.util.Scanner;

public class CountEvenAndOddDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n;
        int evencount=0;
        int oddcount=0;
        n = sc.nextInt();
        while (n>0){
            int digit = n%10;
            if(digit%2==0){
                evencount = evencount+1;
            }
            else {
                oddcount = oddcount+1;
            }
            n=n/10;
        }
        System.out.println("even "+evencount);
        System.out.println("odd "+oddcount);
    }
}
