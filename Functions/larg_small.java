package Functions;

import java.util.Scanner;

public class larg_small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let us find largest and smallest numbers among the input values");
        System.out.print("Enter the num1 num2 and num3:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int maximum_val = maximum(num1,num2,num3);
        int minimum_val = minimum(num1,num2,num3);
        System.out.println("The largest value is "+ maximum_val);
        System.out.println("The smallest value is "+minimum_val);

   }
   public static int maximum(int num1 ,int num2, int num3){
        int largest = num1;
        if(num2 > num1 && num2 > num3){
            largest = num2;
        }
        else if(num3 > num1 && num3 > num2){
            largest = num3;
        }
        else{
            largest = num1;
        }
        return largest;
    }
    public static int minimum(int num1, int num2, int num3){
        int smallest = num1;
        if(num2 < num1 && num2 < num3){
            smallest = num2;
        }
        else if(num3 < num1 && num3 < num2){
            smallest = num3;
        }
        else{
            smallest = num1;
        }
        return smallest;

    }


}
