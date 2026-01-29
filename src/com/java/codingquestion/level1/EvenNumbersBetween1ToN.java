package com.java.codingquestion.level1;

import java.util.Scanner;

public class EvenNumbersBetween1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n,i=1;
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("even "+i);
            }
        }

    }
}
