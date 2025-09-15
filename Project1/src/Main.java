import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear input buffer

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Clear input buffer

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println(age+" years old.");
        System.out.println("GPA is "+ gpa);
        System.out.println("Favorite color is " + color);

        if(isStudent)
        {
            System.out.println(name + " is a student.");
        }
        else
        {
            System.out.println(name + " is not a student.");
        }

        scanner.close();
    }
}