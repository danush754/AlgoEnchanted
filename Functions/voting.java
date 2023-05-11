package Functions;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Whether you're  eligible to vote in India");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        checkEligibility(age);
    }

    private static void checkEligibility(int age){
        if(age >= 18){
            System.out.println("Great!! You're eligible for voting ");
        }
        else{
            System.out.println("No:( you're not eligible for voting !!");
            if(age < 18){
                int timeRemain = 18 - age ;
                System.out.println("just "+timeRemain + " more years are there for you're eligibility of voting");
            }
        }

    }
}
