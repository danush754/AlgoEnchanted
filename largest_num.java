import java.util.Scanner;

public class largest_num {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = inp.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = inp.nextInt();
        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else
        {
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
