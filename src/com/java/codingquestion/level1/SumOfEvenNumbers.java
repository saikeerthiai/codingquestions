package com.java.codingquestion.level1;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        int sum=0;
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i + "+");
                sum=sum+i;
            }
        }
        System.out.print( " = "+sum);
        sc.close();
    }
}
