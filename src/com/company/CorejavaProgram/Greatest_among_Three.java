package com.company.CorejavaProgram;
import java.util.Scanner;

public class Greatest_among_Three {

        void Largest(int num1,int num2,int num3) {
            if(num1>num2 && num1>num3) {
                System.out.println("Largest is Number 1- "+num1);
            }
            else if(num2 > num1 && num2 > num3) {
                System.out.println("Largest is Number 2- "+num2);
            }
            else {
                System.out.println("Largest is Number 3- "+num3);
            }

        }

        public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            Greatest_among_Three rv=new  Greatest_among_Three();
            System.out.println("Enter First Number:");
            int num1=inp.nextInt();
            System.out.println("Enter Second Number:");
            int num2=inp.nextInt();
            System.out.println("Enter third Number:");
            int num3=inp.nextInt();
            rv.Largest(num1,num2,num3);
        }

    }




