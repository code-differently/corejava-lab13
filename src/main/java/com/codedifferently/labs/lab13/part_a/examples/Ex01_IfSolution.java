package com.codedifferently.labs.lab13.part_a.examples;

import java.util.Scanner;

public class Ex01_IfSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        if (grade == 9) {
            System.out.println("You are a freshman");
        }
        else if (grade == 10){
            System.out.println("You are a sophomore");
        }
        else if (grade == 11){
            System.out.println("You are a junior");
        }
        else if (grade == 12){
            System.out.println("You are a senior");
        }
        else {
            System.out.println("Invalid Grade");
        }
    }
}
