import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int m1, m2, m3;
        int total;
        double average;

        // Taking input
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        m3 = sc.nextInt();

        // Calculation
        total = m1 + m2 + m3;
        average = total / 3.0;

        // Output
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if(average >= 50){
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}