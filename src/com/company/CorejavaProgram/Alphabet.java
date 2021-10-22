package com.company.CorejavaProgram;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any Character:");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("character is vowel");
        }else{
            System.out.println("character is consonant");
        }






    }
}
