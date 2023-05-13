package Functions;

import java.util.Scanner;

public class pythatriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a magic spell which checks whether given number is a Pythagorean triplet or not. ");
        System.out.println(" ");
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = input.nextInt();
        pythTripCheck(num1, num2, num3);
    }

    private static void pythTripCheck(int num1,int num2, int num3){
        num1 *= num1;
        num2 *= num2;
        num3 *= num3;
        int sum = num1 + num2 ;
        if(sum == num3){
            System.out.println("The given triplet is a pythagorean triplet :) ");
        }
        else{
            System.out.println("The given triplet is a pythagorean triplet :( ");
        }

    }
}
