package com.java.codingquestion.level1;

import java.util.Scanner;

public class CountTheNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        int count=0;
        n = sc.nextInt();
        while(n>0){
            n = n/10;
            count=count+1;
        }
        System.out.println("count of the number = "+count);

    }
}
