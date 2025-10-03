package Application;


import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("Missing %.2f POINTS", student.missingPoints());
        }
        else{
            System.out.println("PASS");
        }

        sc.close();
    }
}
