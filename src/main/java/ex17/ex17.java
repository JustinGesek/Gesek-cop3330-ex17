package ex17;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
import java.lang.Math;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        long maleOrFemale = scanner.nextLong();
        double r = 0.73;
        if(maleOrFemale == 2)
        {
            r = 0.66;
        }

        System.out.print("How many ounces of alcohol did you have? ");
        double A = scanner.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        double W = scanner.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        double H = scanner.nextDouble();

        double BAC = ((A * 5.14 / W * r) - .015 * H);

        System.out.printf("Your BAC is %.6f.\n", BAC);
        if(BAC >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else {
            System.out.println("It is legal for you to drive.");
        }
    }
}
