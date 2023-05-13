package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This programs checks whether the given number is palindrome or not !!");
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        palindCheck(number);
    }

    private static void palindCheck(int number){
        int reverse = 0;
        int n = number;
        while (n>0){
            int digit = n % 10 ;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (number == reverse){
            System.out.println("The given "+number +" is a Palindrome :)) ");
        }
        else{
            System.out.println("The given "+ number +" is not a Palindrome !!");
        }
       }
    }

