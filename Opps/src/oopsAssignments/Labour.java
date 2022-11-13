package oopsAssignments;

public class Labour extends Employee{
	public static final double overTime=0.5;
	public Labour(int employeeId,String employeeName, double salary) {
		super(employeeId,employeeName,salary);
	}
	public double getSalary() {
		return salary+salary*overTime;
	}

}
