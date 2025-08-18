public class Main {

    public static void main(String[] args){
        int age = 35;
        int year = 2024;
        boolean isStudent = true;
        double CGPA = 9.2;
        String name = "Student1";

        if(isStudent)
        {
            System.out.println("My name is " + name);
            System.out.println("I am " + age + " years old");
            System.out.println("Your CGPA is " + CGPA);
            System.out.println("The year is " + year);
        }
        else
        {
            System.out.println("No data available");
        }

    }
}
