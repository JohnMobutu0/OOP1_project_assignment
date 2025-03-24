import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(); // Create the first student object
        Student student2 = new Student(); // Create the second Student object
        Student student3 = new Student(); // Create the third Student object
        Student student4 = new Student(); // Create the fourth Student object
        Student student5 = new Student(); // Create the fifth Student object
        Student student6 = new Student(); // Create the sixth student object
        Student student7 = new Student(); // Create the seventh Student object
        Student student8 = new Student(); // Create the eighth Student object
        Student student9 = new Student(); // Create the nineth Student object
        Student student10 = new Student(); // Create the tenth Student object



        //String name = "mobutu"; // Define student name
        //int id = 23; // Define student ID
        //double[] scores = {1.2, 2.4, 3.7}; // Define scores
//n° 1
        student1.setStudentInfo();
        student1.getScore();
        student1.calculateAverage();
// n° 2
        student2.setStudentInfo();
        student2.getScore();
        student2.calculateAverage();
// n° 3
        student3.setStudentInfo();
        student3.getScore();
        student3.calculateAverage();
// n° 4
        student4.setStudentInfo();
        student4.getScore();
        student4.calculateAverage();
// n° 5
        student5.setStudentInfo();
        student5.getScore();
        student5.calculateAverage();
// n° 6
        student6.setStudentInfo();
        student6.getScore();
        student6.calculateAverage();
//n° 7
        student7.setStudentInfo();
        student7.getScore();
        student7.calculateAverage();
//n° 8
        student8.setStudentInfo();
        student8.getScore();
        student8.calculateAverage();
//n °9
        student9.setStudentInfo();
        student9.getScore();
        student9.calculateAverage();
// n° 10
        student10.setStudentInfo();
        student10.getScore();
        student10.calculateAverage();
// print all
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        student4.printStudentInfo();
        student5.printStudentInfo();
        student6.printStudentInfo();
        student7.printStudentInfo();
        student8.printStudentInfo();
        student9.printStudentInfo();
        student10.printStudentInfo();
        LocalDate currentDate = LocalDate.now();
        System.out.println("              The report is being viewed on: " + currentDate);

    }
}
