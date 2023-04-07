package src;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // This prgm calculates the area of shapes
        System.out.println("The Shapes : /nCirle /nTriangle /nRectangle ");

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Please enter a shape from the given list : ");
            String Shape = input.nextLine() ;

            switch(Shape.toLowerCase())
            {
                case "circle":
                    System.out.print("Enter the radius of the circle: ");
                    double Radius = input.nextDouble();
                    double area = 3.14 * Radius * Radius;
                    System.out.println("The area of circle is "+ area);
                    break;
                case "triangle":
                    System.out.print("Enter the Base and Height of the Triangle: ");
                    double Base = input.nextDouble();
                    double Height = input.nextDouble();
                    area = 0.5 * Height * Base;
                    System.out.println("The area of triangle is "+ area);
                    break;
                case "rectangle":
                    System.out.print("Enter the Width and Length of the Rectangle :");
                    double Length = input.nextDouble();
                    double Width = input.nextDouble();
                    area = Length * Width ;
                    System.out.println("The area of Rectangle is "+ area);
                    break;

                default:
                    System.out.println("Please enter the shapes as same as in the given list. ");
                    continue;

            }// switch case ends here..
            System.out.println(" Do you want to calculate area for another shape ('yes/no') : ");
            input.nextLine();
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")){
                break;
            }//if statement ends here..

        }//while loop ends here..

        input.close();
    }
}