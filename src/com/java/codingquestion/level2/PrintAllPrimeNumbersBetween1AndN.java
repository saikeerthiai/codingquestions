package com.java.codingquestion.level2;

import java.util.Scanner;

public class PrintAllPrimeNumbersBetween1AndN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n;
        n = sc.nextInt();
        for(int num=2;num<=n;num++){
            boolean isprime = true;
            if(num<=1){
                isprime = false;
            }
            else{
                for(int i=2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        isprime=false;
                        break;
                    }
                }
            }
            if(isprime){
                System.out.println("is prime"+num);
            }else{
                System.out.println("is not prime"+num);
            }
        }

    }
}
