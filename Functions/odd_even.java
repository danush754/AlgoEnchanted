package Functions;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program checks the given number is odd or even ");
        System.out.println("Enter the number :");
        int num1 = input.nextInt();
        odd(num1);
        even(num1);

    }

    private static void even(int num1) {
        if(num1 % 2 == 0){
            System.out.println("The given "+ num1 +" is even number. ");
        }
    }

    private static void odd(int num1) {
        if(num1 % 2 == 1){
            System.out.println("The given "+ num1 +" is odd number. ");
        }
    }
}
