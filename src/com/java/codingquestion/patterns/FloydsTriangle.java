package com.java.codingquestion.patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n;
        n=sc.nextInt();

        int k=1;

        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");

            }

            for(int col=1;col<=row;col++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println(" ");
        }
        sc.close();

    }

}
