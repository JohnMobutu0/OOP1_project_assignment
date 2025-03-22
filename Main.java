public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(); // Create a Student object
        String name = "mobutu"; // Define student name
        int id = 23; // Define student ID
        double[] scores = {1.2, 2.4, 3.7}; // Define scores

        student1.setStudentInfo(name, id, scores); // Set student details
        student1.getScore(scores);
        student1.calculateAverage();
        student1.printStudentInfo();
    }
}
