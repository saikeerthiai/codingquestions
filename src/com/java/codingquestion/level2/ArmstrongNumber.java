package com.java.codingquestion.level2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n, sum=0;
        n = sc.nextInt();
        int count=0;
        int original = n;
        int temp =n;


        while(temp>0){
            temp= temp /10;
            count = count+1;
        }
        while(n>0){
            int digit = n%10;
           //sum = sum + (digit ^count);
            sum =  (sum+ (int) Math.pow(digit, count));
            //sum += Math.pow(digit, count);
            n=n/10;

        }
        if(sum==original){
            System.out.println("Armstrong "+sum);
        }else {
            System.out.println("not Armstong ");
        }

    }
}
