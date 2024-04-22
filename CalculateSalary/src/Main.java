
public class Main {
	public static void main(String[] args) {
		  Employee employee = new Employee("John Doe", 1500, 45, 2010);
	      System.out.println("Tax: " + employee.tax());
	      System.out.println("Bonus: " + employee.bonus());
	      employee.raiseSalary();
	      System.out.println(employee);
	}
}
