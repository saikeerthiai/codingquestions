package com.java.codingquestion.level2;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of the number: ");
        int n;
        n = sc.nextInt();
        int rev=0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 +digit;
            n = n/10;
        }
        System.out.println(" "+rev);

    }
}
