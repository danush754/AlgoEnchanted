package Functions;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        System.out.println("This program calculates the sum of first n natural numbers....");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        sumOfNum(num);

    }

    private static void sumOfNum(int num){
            int sum = 0;
            for(int i= 0;i<= num;i++){
                sum += i;
            }
        System.out.println(sum);
    }
}
