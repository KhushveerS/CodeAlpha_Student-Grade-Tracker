import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input loop to determine number of grades
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Array to store grades
        int[] grades = new int[numStudents];

        // Input loop to enter grades
        System.out.println("Enter students' grades: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        double average = sum / numStudents;

        // Find highest and lowest grades
        int highest = grades[0];
        int lowest = grades[0];
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        // Output results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
