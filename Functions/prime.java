package Functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("This program checks the number is a prime or not");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        primeCheck(num);


    }

    private static void primeCheck(int num) {
        if (num == 1) {
            System.out.println("Number 1 is not a prime number.");
        }
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if(num % i == 1){
                    System.out.println("The given number is a prime number.");
                }
                else{
                    System.out.println("The given number is not a prime number. ");
                }

            }
        }

    }
}


