package basic_prgm;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        // This prgm calculates the perimeter of perimeter
        System.out.println("The Shapes : /nCirle /nEquilateral Triangle /nRectangle /nSquare ");

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Please enter a shape from the given list : ");
            String Shape = input.nextLine() ;

            // switch case starts here..
            switch (Shape.toLowerCase()) {
                case "circle":
                    System.out.print("Enter the radius of the circle: ");
                    double Radius = input.nextDouble();
                    double perimeter = 2 * 3.14 * Radius;
                    System.out.println("The perimeter of circle is " + perimeter);
                    break;
                case "triangle":
                    System.out.print("Enter the side value of the Equilateral Triangle: ");
                    double Side = input.nextDouble();
                    perimeter = 3 * Side ;
                    System.out.println("The perimeter of Equilateral triangle is " + perimeter);
                    break;
                case "rectangle":
                    System.out.print("Enter the Width and Length of the Rectangle :");
                    double Length = input.nextDouble();
                    double Width = input.nextDouble();
                    perimeter = 2*(Length + Width);
                    System.out.println("The perimeter of Rectangle is :" + perimeter);
                    break;
                case "square":
                    System.out.print("Enter the length of the side: ");
                    double side = input.nextDouble();
                    perimeter = 4 * side;
                    System.out.println("The perimeter of Square is :" + perimeter);
                    break;

                default:
                    System.out.println("Please enter the shapes as same as in the given list. ");
                    continue;
            }
            System.out.println(" Do you want to calculate perimeter for another shape ('yes/no') : ");
            input.nextLine();
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")){
                break;
            }//if statement ends here..

        }//while loop ends here..

        input.close();
    }
}



