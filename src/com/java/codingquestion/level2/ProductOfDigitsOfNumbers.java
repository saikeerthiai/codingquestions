package com.java.codingquestion.level2;

import java.util.Scanner;

public class ProductOfDigitsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        n = sc.nextInt();
        int product=1;
        while(n>0){
            int digit = n%10;
            product = product * digit;
            n = n/10;
        }
        System.out.println(" "+product);
    }
}
