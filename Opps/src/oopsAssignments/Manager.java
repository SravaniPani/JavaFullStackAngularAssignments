package oopsAssignments;

public class Manager extends Employee{
	public static final double incentive=0.5;
	public Manager(int employeeId,String employeeName, double salary) {
		super(employeeId,employeeName,salary);
	}
	public double getSalary() {
		return salary+salary*incentive;
	}



}
