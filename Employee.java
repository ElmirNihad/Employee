import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private int workHours,hireYear;

    Employee(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your salary: ");
        salary = input.nextDouble();
        System.out.print("Enter your work hours(extra): ");
        workHours = input.nextInt();
        System.out.print("Enter your hire year: ");
        hireYear = input.nextInt();

        System.out.print("Name : " + name + "\n"
                + "Salary : " + salary + "\n"
                + "Extra workhours : " + workHours + "\n"
                + "Hire year : " + hireYear + "\n"
                + "Tax : " + tax() + "\n"
                + "Bonus : " + bonus() + "\n"
                + "Raise of salary : " + increase() + "\n"
                + "Salary with tax and bonus : " + (salary - tax() + bonus()) + "\n"
                + "Total salary with the raise of salary : " + (salary + increase()) + "\n"
        );
    }

    public double tax(){
        if(salary >1000){
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus(){
        return workHours * 30;
    }

    public double increase(){
        int year = 2025- hireYear;
        if(year<10){
            return salary * 0.05;
        } else if (year>=10 && year < 20) {
            return salary * 0.1;
        }else {
            return salary * 0.15;
        }
    }
}