package Variables_LogicsPractice;

public class EmployeeCounter {
	
	// static variables
	static String companyname = "ScientificGames";
	static int totalemployees;
	
	//Instance variables	
	String employeename;
	int employeeId;
	double salary;
	
	// Constructor
	public EmployeeCounter(String empname, int empId, double sal) {
		
		employeename = empname;
		employeeId = empId;
		salary = sal;
		
		totalemployees++;
	}
	
	// Instance method to display employee details
	public void displaydetails() {
		
		System.out.println("Company Name : "+companyname);
		System.out.println("Employee Name : "+employeename);
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Salary : "+salary);	
		
	}	
    
	// Main method
	public static void main(String[] args) {
		
		EmployeeCounter EC1 = new EmployeeCounter("Karthik", 101, 25000);
		EmployeeCounter EC2 = new EmployeeCounter("Venkat", 102, 30000);
		EmployeeCounter EC3 = new EmployeeCounter("Virat", 103, 35000);
		
		EC1.displaydetails();
		
		System.out.println("---------------------------------------");
		
		EC2.displaydetails();
		
		System.out.println("---------------------------------------");
		
		EC3.displaydetails();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Company Name is : "+companyname);
		System.out.println("Total employee count : "+totalemployees);		

	}

}
