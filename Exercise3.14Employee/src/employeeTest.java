/**
 * Created by Christian on 9/30/2016.
 */
import java.util.Scanner;


public class employeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("first", "last", 0.0);
        Employee employee2 = new Employee("first", "last", 0.0);

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        double monthlySalary;

        System.out.println("Enter details of employee1:\n");

        System.out.print("Enter First Name: ");
        firstName = input.next();
        employee1.setFirstName(firstName);
        employee1.getFirstName();
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        employee1.setLastName(lastName);
        employee1.getLastName();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();
        if (monthlySalary > 0) //if monthly salary is not positive do not set its value
            employee1.setmonthlySalary(monthlySalary);
        employee1.getmonthlySalary();

        System.out.println();

        System.out.println("Enter details of employee2:\n");

        System.out.print("Enter First Name: ");
        firstName = input.next();
        employee2.setFirstName(firstName);
        employee2.getFirstName();
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        employee2.setLastName(lastName);
        employee2.getLastName();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();
        if (monthlySalary > 0) //if monthly salary is not positive do not set its value
            employee2.setmonthlySalary(monthlySalary);
        employee2.getmonthlySalary();

        System.out.println();

        employee1.yearlySalary();
        employee2.yearlySalary();

        employee1.displayYearlySalary();

        System.out.println();

        employee2.displayYearlySalary();

        System.out.println();

        employee1.yearlySalaryIncrease();
        employee2.yearlySalaryIncrease();

        System.out.printf("Congratulations to %s %s and %s %s. You just earned"
                        + " for yourselves a 10%c increase in your yearly salaries. "
                        + "\nYour new yearly salaries are:\n\n", employee1.getFirstName(),
                employee1.getLastName(), employee2.getFirstName(),
                employee2.getLastName(), '%');

        employee1.displayYearlySalaryIncrease();

        System.out.println();

        employee2.displayYearlySalaryIncrease();

    }

}
