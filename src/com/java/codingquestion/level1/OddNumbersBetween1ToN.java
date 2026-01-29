package com.java.codingquestion.level1;

import java.util.Scanner;

public class OddNumbersBetween1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n;
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(" "+i);
            }
        }
    }
}
