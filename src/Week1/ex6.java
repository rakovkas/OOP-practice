package Week1;
//Create a program that asks the user for two numbers and prints the greater of those two.
// The program should also handle the case in which the two numbers are equal.

import java.util.Scanner;

public class ex6 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        if (num1 == num2){
            System.out.println("Numbers are equal.");
        } else if (num1>num2) {
            System.out.println("Number " + num1 + " is greater than number "+ num2);
        } else {
            System.out.println("Number " + num2 + " is greater than number "+ num1);
        }

    }
}
