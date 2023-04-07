package src;


import java.util.Scanner;

public class operator_calc {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter the value1:");
        int inp1 =inputs.nextInt();
        System.out.println("Enter the value2:");
        int inp2 =inputs.nextInt();
        System.out.println("Enter the operator(+,-,/,*):");
        char inp3 = inputs.next().charAt(0);
        if(inp3 == '+' )
       {
            int add = inp1 + inp2;
            System.out.println("The addition of "+inp1+" + "+inp2+" is :"+add);
        }
        else if(inp3 == '-'){

        }
        else if(inp3 == '*'){
            int multi = inp1 * inp2;
            System.out.println("The addition of "+inp1+" * "+inp2+" is :"+multi);
        }
        else if(inp3 == '/'){
            int div = inp1 / inp2;
            System.out.println("The addition of "+inp1+" / "+inp2+" is :"+div);
        }

    }


}
