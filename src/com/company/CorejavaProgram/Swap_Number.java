package com.company.CorejavaProgram;

public class Swap_Number {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);

    }
    public static void swap(int num1, int num2){
        System.out.println("value before swapping are: a" +num1+ "b"+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("value after swapping are: a"+num1+"b"+num2);
    }
}
