import java.util.*;

public class EmployeeSample {

    // Method overloading
    public static double calculateBonus(double salary)
    {
        return salary * 0.05;
    }

    public static double calculateBonus(double salary, double performanceRating)
    {
        return salary * 0.05 * performanceRating;
    }
    public static void main (String [] args)
    {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String employee_name = scanner.nextLine();
        fullTimeEmployee.setEmployeeName(employee_name);
        System.out.println("Enter the salary of the employee");
        int employee_salary = scanner.nextInt();
        fullTimeEmployee.setEmployeeSalary(employee_salary);
        System.out.println("The employee details is as follows:");
        System.out.println("Employee name: " + fullTimeEmployee.getEmployeeName());
        System.out.println("Employee salary: " + fullTimeEmployee.getEmployeeSalary());
        System.out.println("Employee bonus (without special performance rating: " + calculateBonus(employee_salary));
        System.out.println("Employee bonus (without special performance rating: " + calculateBonus(employee_salary, 5.5));


        //fullTimeEmployee.getEmployeeName();

        //PartTimeEmployee partTimeEmployee = new PartTimeEmployee();



    }
}
