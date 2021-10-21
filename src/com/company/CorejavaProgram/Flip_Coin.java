package com.company.CorejavaProgram;

public class Flip_Coin {
    public static void main(String[] args) {
        System.out.println("Welcone to Flip Coin program");


        int HeadCounter = 0;
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 2);
            if (random == 0) {
                System.out.println("Heads");
                HeadCounter++;
            } else if (random == 1) {
                System.out.println("Tail");

            }
        }
        System.out.println("number of Times Heads" + HeadCounter);
    }
}