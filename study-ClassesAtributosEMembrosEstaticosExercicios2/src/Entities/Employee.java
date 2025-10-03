package Entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public void increaseSalary(double percentage){
        GrossSalary += GrossSalary *  percentage / 100;
    }

    public double netSalary(){
        return GrossSalary - Tax;
    }

    public String toString(){
        return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
    }
}
