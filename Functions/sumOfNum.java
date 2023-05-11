package Functions;

import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets get the sum of  random numbers !! ");
        System.out.println("Enter the first number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number : ");
        double num2 = input.nextDouble();
        double addition= addition(num1 ,num2 );
        System.out.println("The sum of these numbers are : "+ addition);
    }
     private static double addition(double num1, double num2){
         double total = num1 + num2;
         return total;
     }
}
