package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSalary {
    public static void main(String[] args) {
        double percentage;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Employee:");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        employee.tax = sc.nextDouble();
        System.out.println("Employee: " + employee.name);
        System.out.println("$" + employee.netSalary());




        System.out.println("Which percentage to increase salary? ");
        percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        sc.close();
    }
}
