package basic_prgm;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // This prgm calculates the area of shapes
        System.out.println("The Shapes : /nCirle /nTriangle /nRectangle ");

        Scanner input = new Scanner(System.in);
        /* In this prgm I used a enhanced Switch statement instead of  nrml switch statement
        from this I came to know we have to declare a variable in every case of enchanced switch statement if we don't declare at first

                if you don't understand see the diff btwn perimeter and area prgm. Both files are in same src folder :)
        */

        while(true){
            double area;// see here I declared the area variable .

            System.out.print("Please enter a shape from the given list : ");
            String Shape = input.nextLine() ;

            switch (Shape.toLowerCase()) {
                case "circle" -> {
                    System.out.print("Enter the radius of the circle: ");
                    double Radius = input.nextDouble();
                    area = 3.14 * Radius * Radius; // if I don't declare at first i should declare at every case in enhanced switch.
                    System.out.println("The area of circle is " + area);
                }
                case "triangle" -> {
                    System.out.print("Enter the Base and Height of the Triangle: ");
                    double Base = input.nextDouble();
                    double Height = input.nextDouble();
                    area = 0.5 * Height * Base;
                    System.out.println("The area of triangle is " + area);
                }
                case "rectangle" -> {
                    System.out.print("Enter the Width and Length of the Rectangle :");
                    double Length = input.nextDouble();
                    double Width = input.nextDouble();
                    area = Length * Width;
                    System.out.println("The area of Rectangle is " + area);
                }
                default -> {
                    System.out.println("Please enter the shapes as same as in the given list. ");
                    continue;
                }
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