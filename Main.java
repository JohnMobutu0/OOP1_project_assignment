import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(); // Create the first student object
        Student student2 = new Student(); // Create the second Student object
        Student student3 = new Student(); // Create the third Student object
        Student student4 = new Student(); // Create the fourth Student object
        Student student5 = new Student(); // Create the fifth Student object
        Student student6 = new Student(); // Create the first student object
        Student student7 = new Student(); // Create the second Student object
        Student student8 = new Student(); // Create the third Student object
        Student student9 = new Student(); // Create the fourth Student object
        Student student10 = new Student(); // Create the fifth Student object



        //String name = "mobutu"; // Define student name
        //int id = 23; // Define student ID
        //double[] scores = {1.2, 2.4, 3.7}; // Define scores

        student1.setStudentInfo(); // Set student details
        student1.getScore();
        student1.calculateAverage();
        student1.printStudentInfo();

        student2.setStudentInfo(); // Set student details
        student2.getScore();
        student2.calculateAverage();
        student2.printStudentInfo();

        student3.setStudentInfo(); // Set student details
        student3.getScore();
        student3.calculateAverage();
        student3.printStudentInfo();

        student4.setStudentInfo(); // Set student details
        student4.getScore();
        student4.calculateAverage();
        student4.printStudentInfo();

        student5.setStudentInfo(); // Set student details
        student5.getScore();
        student5.calculateAverage();
        student5.printStudentInfo();

        student6.setStudentInfo(); // Set student details
        student6.getScore();
        student6.calculateAverage();
        student6.printStudentInfo();

        student7.setStudentInfo(); // Set student details
        student7.getScore();
        student7.calculateAverage();
        student7.printStudentInfo();

        student8.setStudentInfo(); // Set student details
        student8.getScore();
        student8.calculateAverage();
        student8.printStudentInfo();

        student9.setStudentInfo(); // Set student details
        student9.getScore();
        student9.calculateAverage();
        student9.printStudentInfo();

        student10.setStudentInfo(); // Set student details
        student10.getScore();
        student10.calculateAverage();
        student10.printStudentInfo();
        LocalDate currentDate = LocalDate.now();
        System.out.println("              The report is being viewed on: " + currentDate);

    }
}
