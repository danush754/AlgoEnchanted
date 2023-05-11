package basic_prgm;

import java.util.Scanner;

public class curr_conv {
    public static void main(String[] args) {
        Scanner inp_amnt = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        float amt = inp_amnt.nextFloat();
        float usd = amt * 0.012f;
        System.out.println(amt+" rupees = "+ usd);
    }
}
