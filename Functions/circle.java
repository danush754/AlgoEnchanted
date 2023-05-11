package Functions;


import java.util.Arrays;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.println("This program calculates the area and circumference of the circle !!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double[] output = perimeter(radius);
        System.out.println("The area and circumference of the circle are :" + Arrays.toString(output));
    }

    private static double[] perimeter(double radius) {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        double[] myarray = new double[2];
        myarray[0] = area;
        myarray[1] = circumference;
        return myarray;
    }
}
