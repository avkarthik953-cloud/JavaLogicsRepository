package Variables_LogicsPractice;

public class Student {
	
	static String schoolname = "Sujith Vidhyalaya";
	String studentname;
	int rollnumber;
	double fee;
	
	public void displayStudent() {
		
		int attendanceDays = 25;
		
		System.out.println("Student AttendanceDays : "+attendanceDays);
	}
	
	public void displaystatement() {
		
		System.out.println("Student Name : "+studentname);
		System.out.println("Student roll number : "+rollnumber);
		System.out.println("Student fee : "+fee);
	}

	public static void main(String[] args) {
		
		Student S1 = new Student();
		Student S2 = new Student();	
		
	
		S1.studentname = "Karthik";
		S1.rollnumber = 101;
		S1.fee = 25000;
		
		S1.displaystatement();
		S1.displayStudent();
		System.out.println("School name is : "+Student.schoolname);
		
		System.out.println("----------------------------------");
		
		
		S2.studentname = "Venkat";
		S2.rollnumber = 102;
		S2.fee = 30000;
		
		S2.displaystatement();
		S2.displayStudent();
		System.out.println("School name is : "+Student.schoolname);
		
		
		
	}

}
