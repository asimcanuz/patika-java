import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private final int CURRENT_YEAR = LocalDate.now().getYear();

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public void raiseSalary() {
        int yearsWorked = CURRENT_YEAR - hireYear;
        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}