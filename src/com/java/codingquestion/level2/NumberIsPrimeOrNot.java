package com.java.codingquestion.level2;

import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n;
        n = sc.nextInt();
        boolean isprime = true;
        if(n<=1){
            isprime = false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime==true){
            System.out.println("is prime"+isprime);
        }else{
            System.out.println("is not prime"+isprime);
        }
    }
}
