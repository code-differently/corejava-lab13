package com.codedifferently.labs.lab13.part_a.examples;

import java.util.Scanner;

public class Ex02_CaseSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        switch(grade) {
            case 9:
                System.out.println("You are a freshman");
                break;
            case 10:
                System.out.println("You are a sophomore");
                break;
            case 11:
                System.out.println("You are a junior");
                break;
            case 12:
                System.out.println("You are a senior");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
