import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculate the area of a rectangle

        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        scanner.nextLine(); // Clear input buffer

        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        scanner.nextLine(); // Clear input buffer

        area = width * height;
        System.out.println("Area of the rectangle is: " + area + " cm");

        scanner.close();
    }
}
