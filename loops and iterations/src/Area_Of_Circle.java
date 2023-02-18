import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        float radius = inp.nextFloat();
        double area = 3.14159265359 * radius *radius;
        System.out.println("The area of circle is -- "+ area);
    }
}
