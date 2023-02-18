import java.util.Scanner;

public class simple_Interest {
    public static void main(String[] args) {
        int principal;
        float timeperiod;
        int rate;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = value.nextInt();
        System.out.print("Enter the time period : ");
        timeperiod = value.nextFloat();
        System.out.print("Enter the rate of interest: ");
        rate = value.nextInt();
         int SimpInt = (int)  (principal *rate*timeperiod);
        System.out.println("The simple interest is :"+ SimpInt);
    }
}