package com.codedifferently.labs.lab13.part_a.examples;

import java.util.Scanner;

public class Ex03_SalesWinners {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many memberships did you sell?");
        int sales = in.nextInt();

        switch(sales){

            case 6:  System.out.println("You win $1000");
            case 5:  System.out.println("You win a Samsung Galaxy III-S");
            case 4:  System.out.println("You win Laptop");
            case 3:  System.out.println("You win iPod");
            case 2:  System.out.println("You win Stapler");
            case 1:  System.out.println("You win Staple Remover");
                break;
            default:  System.out.println("No Gift");

        }
    }
}
