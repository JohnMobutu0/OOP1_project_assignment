import java.util.Scanner;
import java.time.LocalDate;

public class UniversityExamProcessor {
    final static int NUM_STUDENTS = 10;
    final static int NUM_SUBJECTS = 5;

    public static void main(String[] args) {
        String[] studentNames = new String[NUM_STUDENTS];
        String[] studentIDs = new String[NUM_STUDENTS];
        int[][] scores = new int[NUM_STUDENTS][NUM_SUBJECTS];

        readStudentDetails(studentNames, studentIDs, scores);
        displayReportCards(studentNames, studentIDs, scores);
    }

    public static void readStudentDetails(String[] names, String[] ids, int[][] scores) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("ID Number: ");
            ids[i] = scanner.nextLine();

            System.out.println("Enter scores for " + NUM_SUBJECTS + " subjects:");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
        }
    }

    public static void displayReportCards(String[] names, String[] ids, int[][] scores) {
        System.out.println("\nReport Cards:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("ID Number: " + ids[i]);

            int total = 0;
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.println("Subject " + (j + 1) + ": " + scores[i][j]);
                total += scores[i][j];
            }

            double average = total / (double) NUM_SUBJECTS;
            String grade = getGrade(average);
            String recommendation = getRecommendation(grade);

            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("Recommendation: " + recommendation);
            System.out.println("Date: " + LocalDate.now());
            System.out.println();
        }
    }

    public static String getGrade(double average) {
        if (average >= 70) return "A";
        if (average >= 60) return "B";
        if (average >= 50) return "C";
        if (average >= 40) return "D";
        return "F";
    }

    public static String getRecommendation(String grade) {
        switch (grade) {
            case "A":
                return "Excellent";
            case "B":
                return "Good";
            case "C":
                return "Average";
            case "D":
                return "Poor";
            default:
                return "Fail";
        }
    }
}