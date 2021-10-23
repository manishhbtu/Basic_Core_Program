package com.company.CorejavaProgram;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        int M=2,N=3;
     int a [][]= new int [2][3];
     Scanner r = new Scanner (System.in);
        System.out.println("Enter M rows and N cols:");
         for (int i=0;i<2;i++){
             for (int j=0;j<3; j++){
                 a[i][j]= r.nextInt();
             }
         }
        System.out.print("Matrix: \n");
         for (int i=0;i<2;i++){
             for (int j=0;j<3;j++){
                 System.out.print(a[i][j]+ " ");
             }
             System.out.println(" ");
         }

        }
    }

