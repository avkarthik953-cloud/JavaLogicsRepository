package Variables_LogicsPractice;

public class Employee {

	/*
	 * String name; int age; String department; double salary;
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Employee E1 = new Employee(); Employee E2 = new Employee();
	 * 
	 * E1.name = "Karthik"; E1.age = 30; E1.salary = 50000;
	 * 
	 * E2.name = "Venkat"; E2.age = 28; E2.salary = 45000;
	 * 
	 * System.out.println(E1.name); System.out.println(E1.age);
	 * System.out.println(E1.salary);
	 * 
	 * System.out.println(E2.name); System.out.println(E2.age);
	 * System.out.println(E2.salary);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
	
	
	/*
	 * static String companyName = "ABC Technologies";
	 * 
	 * String employeename; int EmployeeID; double salary;
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Employee E1 = new Employee(); Employee E2 = new Employee(); Employee E3 = new
	 * Employee();
	 * 
	 * E1.employeename = "Karthik"; E1.EmployeeID = 101; E1.salary = 25000;
	 * 
	 * E2.employeename = "Venkat"; E2.EmployeeID = 102; E2.salary = 24000;
	 * 
	 * E3.employeename = "Krishna"; E3.EmployeeID = 103; E3.salary = 100000;
	 * 
	 * System.out.println(E1.employeename); System.out.println(E1.EmployeeID);
	 * System.out.println(E1.salary); System.out.println(E1.companyName);
	 * 
	 * System.out.println(E2.employeename); System.out.println(E2.EmployeeID);
	 * System.out.println(E2.salary); System.out.println(E2.companyName);
	 * 
	 * System.out.println(E3.employeename); System.out.println(E3.EmployeeID);
	 * System.out.println(E3.salary); System.out.println(E3.companyName); }
	 */
	
	
	static String companyName = "ABC Technologies";

    String employeeName;
    int employeeId;
    double salary;
    
    public Employee(String empname, int empID, double sal) {
    	
    	employeeName = empname;
    	employeeId = empID;
    	salary = sal;
    }

    public void displayEmployee() {

        int bonus = 5000;

        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {

        Employee E1 = new Employee("Karthik", 101, 25000);
        Employee E2 = new Employee("Venkat", 102, 30000);
        E1.displayEmployee();

        System.out.println();

        E2.displayEmployee();
    }

}
