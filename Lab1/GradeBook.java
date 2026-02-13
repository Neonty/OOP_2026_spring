package Lab1;

import java.util.*;
import Practice2.Student;

public class GradeBook{
    private Course course;
    private Map<Student, Integer> grades;

    public GradeBook(Course course){
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(Student student, int grade){
        grades.put(student, grade);
    }

    public void displayMessage(){
        System.out.printf("Welcome to the grade book for %s!", course.getName());
    }

    public void displayGradeReport(){
        if (grades.isEmpty()){
            return;
        }

        double avg = determineClassAverage();
        Student best = null, worst = null;
        int max = -1, min = 101;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()){
            int g = entry.getValue();

            if (g > max){ 
                max = g;
                best = entry.getKey();
            }

            if (g < min){
                min = g;
                worst = entry.getKey();
            }
        }

        System.out.printf("Class average is %.2f. Lowest grade is %d (%s, id: %d).\n", avg, min, worst.getName(), worst.getId());
        System.out.printf("Highest grade is %d (%s, id: %d).\n\n", max, best.getName(), best.getId());
        outputBarChart();
    }

    private double determineClassAverage(){
        double sum = 0;
        for (int g : grades.values()){
            sum += g;
        }

        return sum / grades.size();
    }

    private void outputBarChart(){
        int[] freq = new int[11];
        for (int g : grades.values()){
            freq[g/10]++;
        }

        for (int i = 0; i < freq.length; i++){
            if (i==10){
                System.out.print("100: ");
            }
            else{
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < freq[i]; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}