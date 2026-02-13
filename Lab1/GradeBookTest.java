package Lab1;
import java.util.Scanner;
import Practice2.Student;

public class GradeBookTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Course csci12106 = new Course("csci12106", "Object-oriented Programming and Design", 5, "PP2");
        GradeBook gb = new GradeBook(csci12106);

        gb.displayMessage();

        System.out.print("Please, input students number: ");
        int n = scan.nextInt();
        Student[] students = new Student[n];

        for (int i=0;i<n;i++){
            System.out.print("Enter student name: ");
            String name = scan.next();

            System.out.print("Enter student id: ");
            int id = scan.nextInt();

            students[i] = new Student(name, id);
        }

        System.out.println("\nPlease, input grades for students:");
        
        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            gb.addGrade(s, scan.nextInt());
        }

        System.out.println();
        gb.displayGradeReport();
        scan.close();
    }
}