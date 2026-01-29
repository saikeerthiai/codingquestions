package com.java.codingquestion.level1;

import java.util.Scanner;

public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        int rev=0;
        n = sc.nextInt();
        while (n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n= n/10;

        }
        System.out.println("digits  ");
        while (rev!=0){
            System.out.println(rev%10);
            rev=rev/10;
        }
    }
}
