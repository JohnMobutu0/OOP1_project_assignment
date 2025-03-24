import java.util.Scanner;

public class Student {
    // Private attributes
    private String name;
    private int id;
    private double[] scores;

    // Default constructor
    public Student() {
        // Empty constructor for object initialization
    }

    // Method to set the student's information
    public void setStudentInfo() {
        Scanner scanner = new Scanner(System.in); // Create a scanner to read input

        System.out.print("Enter student's name: ");
        this.name = scanner.nextLine(); // Read the name from user input

        System.out.print("Enter student's ID: ");
        this.id = scanner.nextInt(); // Read the ID from user input

        // Close the scanner after use (good practice)
        // scanner.close(); // Do not close the scanner here, as we will use it in other methods too.
    }

    // Method to get the student's scores
    public void getScore() {
        Scanner scanner1 = new Scanner(System.in); // Create a new scanner for scores input

        System.out.print("Enter the number of scores: ");
        int numScores = scanner1.nextInt(); // Read the number of scores the user wants to enter

        // Initialize the scores array with the specified size
        this.scores = new double[numScores];

        // Loop to get each score
        for (int i = 0; i < numScores; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            this.scores[i] = scanner1.nextDouble(); // Read each score from the user
        }

        // Close the scanner after use (good practice)
        // scanner1.close(); // Again, do not close it here because of repeated usage in the main method.
    }

    // Method to calculate the average score
    public double calculateAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // Method to print the student's information in a formatted way
    public void printStudentInfo() {
        System.out.println("---- Student Information ----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.print("Scores: ");
        for (double score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Average Score: " + calculateAverage());
        System.out.println("Recommendation: " + getRecommendation());  // Print the recommendation
        System.out.println("-----------------------------");
    }

    // Method to get the recommendation based on the average score
    public String getRecommendation() {
        double average = calculateAverage();

        if (average >= 90) {
            return "Excellent";  // Average score 90 or higher
        } else if (average >= 70) {
            return "Good";  // Average score between 70 and 89
        } else if (average >= 50) {
            return "Fair";  // Average score between 50 and 69
        } else {
            return "Poor";  // Average score below 50
        }
    }

}