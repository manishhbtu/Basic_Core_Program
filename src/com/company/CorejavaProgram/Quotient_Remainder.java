package com.company.CorejavaProgram;
import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter dividend:");
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor:");
        int divisor= sc.nextInt();
        int quotient = dividend/divisor;
        int  remainder= dividend % divisor;
        System.out.println("Quotient="+quotient + "\nRemainder="+remainder);

    }
}
