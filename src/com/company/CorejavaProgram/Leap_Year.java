package com.company.CorejavaProgram;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the number:");
        int year = sc.nextInt();
        if (year % 400==0){
            System.out.println(year+ "is a leap year");
        }else if (year%4==0 && year%100!=0) {
            System.out.println(year+" is  leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }

    }
}
