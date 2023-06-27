package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){

        System.out.println("Updated data:" + name + "\n$" +
                String.format("%.2f",(((grossSalary*percentage)/100) + netSalary())));
    }

}
