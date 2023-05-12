package Functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the factorial of a number.");
        System.out.println(" Enter a number : ");
        int number = input.nextInt();

        fact(number);

    }

    private static void fact(int number){
        if(number == 0 || number == 1){
            System.out.println("The factorial of the number is : 1");
        }

        int factorial =1;

        for(int i = 1;i <= number;i++){
            factorial *= i;

                   }
        System.out.println("The factorail of the given number is : "+factorial);

    }
}
