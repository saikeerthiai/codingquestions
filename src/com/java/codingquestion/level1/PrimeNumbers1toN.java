package com.java.codingquestion.level1;

import java.util.Scanner;

public class PrimeNumbers1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        n = sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println(" "+i);
        }
    sc.close();
    }
}
