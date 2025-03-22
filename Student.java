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
    public void setStudentInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getScore(double[] scores) {
        this.scores = scores;
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }

    // Setter for the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the student's ID
    public int getId() {
        return id;
    }

    // Setter for the student's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for the student's scores
    public double[] getScores() {
        return scores;
    }

    // Setter for the student's scores
    public void setScores(double[] scores) {
        this.scores = scores;
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
        System.out.println("-----------------------------");
    }
}