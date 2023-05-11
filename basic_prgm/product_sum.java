package basic_prgm;

import java.util.Scanner;

public class product_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number : ");
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        int third_num = sc.nextInt();
        int product = first_num * second_num * third_num;
        int sum = first_num + second_num + third_num ;
        int result = product - sum;
        System.out.println(result);


    }
}
