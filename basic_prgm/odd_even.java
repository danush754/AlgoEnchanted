package basic_prgm;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int value;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        value = num.nextInt();
        if(value%2 == 0)
        {
            System.out.println(value +" is even number!");
        }
        else
        {
            System.out.println(value +" is odd number!");
        }



    }


}
