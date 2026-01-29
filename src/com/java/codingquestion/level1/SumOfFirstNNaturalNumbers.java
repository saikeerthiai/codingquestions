package com.java.codingquestion.level1;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n,sum=0;
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            sum=sum+i;
            if(i<n){
                System.out.print(i + "+");
            } else{
                System.out.print(i);
            }

        }
        System.out.print(" = " + sum);
      //int sum = n *((n+1)/2);
        //System.out.println(" "+sum);


    }
}
