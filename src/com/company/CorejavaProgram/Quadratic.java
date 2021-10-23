package com.company.CorejavaProgram;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double discriminant = Math.pow(b, 2.0) - 4 * a * c;
        if (discriminant > 0) {
            double root1= (-b +Math.sqrt(discriminant))/(2*a);
            double root2= (-b -Math.sqrt(discriminant))/(2*a);
            System.out.println("Roots are "+ root1+ "and" +root2);

        }else if(discriminant==0){
            double root= -b/(2*a);
            System.out.println("Roots are "+root+ "and" +root);
        }else{
            double realPart= -b/(2*a);
            double imgPart = Math.sqrt(-discriminant)/(2*a);
            System.out.println("Roots are" + realPart+ " + " + imgPart+ "i"+ " and "+realPart+ "-" + imgPart+ "i");
        }
    }
}
