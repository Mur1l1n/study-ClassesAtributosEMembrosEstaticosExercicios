package Application;

import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        emp.GrossSalary =  sc.nextDouble();
        System.out.println("Tax: ");
        emp.Tax = sc.nextDouble();
        System.out.println();
        System.out.println(emp.toString());
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: "+ emp.name + ", $" + String.format("%.2f", emp.netSalary()));


        sc.close();
    }
}
