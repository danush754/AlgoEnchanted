package Functions;

import java.util.Scanner;

public class primeInbtwn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This Program returns all the prime numbers in between the random numbers !! ");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        retrievePrime(num1,num2);

    }

    private static void retrievePrime(int num1, int num2){
        for (int i= num1;i <= num2;i++){
            boolean isPrime = true ;
            for (int j = 2;j < i;j++){
                if(i % j == 0){
                    isPrime = false;

                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }

    }
 }
