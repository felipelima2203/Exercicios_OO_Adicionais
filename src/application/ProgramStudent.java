package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter 3 grades");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        student.calculateGrade();

        System.out.println("Final Grade: " + String.format("%.2f", (student.calculateGrade())));
        if (student.calculateGrade()<60){
            System.out.println("Failed");
            System.out.println("Missing " + String.format("%.2f", (60 - student.calculateGrade()))
                     + " points");
        }else {
            System.out.println("Pass");
        }

    }
}
