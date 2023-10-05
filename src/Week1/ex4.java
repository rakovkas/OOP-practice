package Week1;
//    Create a program that asks the user for two integers and then prints their sum.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: "+ (num1+num2));
    }
}

