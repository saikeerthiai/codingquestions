package com.java.codingquestion.level2;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int n,rev=0;
        n = sc.nextInt();
        int original = n;
        while(n>0){
            int digit = n%10;
            rev = rev *10 + digit;
            n=n/10;
        }
        if(rev==original){
            System.out.println("Palindrom "+rev);
        }else{
            System.out.println("Not Palindrom "+rev);
        }
    }
}
