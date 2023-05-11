package Functions;

import java.util.Scanner;

public class productOfNum {
    public static void main(String[] args) {
        System.out.println("Lets calculate the product of two random numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();
        double product= multiply(num1 ,num2 );
        System.out.println("The product of these numbers are : "+ product);
    }
    private static double multiply(double num1, double num2){
        double total = num1 * num2;
        return total;
    }
}


