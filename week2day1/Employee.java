package week2day1;

public class Employee {
	
	public void printEmployeeName(String empName,int empId)
	{
		System.out.print(empName + "\t");
		System.out.println(empId);
	}
	
	public void getEmployeeAddres(String empAddress)
	{
		System.out.println(empAddress);
	}
	
	public void printEmployeeSalary(double empSalary)
	{
		System.out.println(empSalary);
	}
	
	public void printEmployeeMobileeNumber(long mobNum)
	{
		System.out.println(mobNum);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.printEmployeeName("kavin",101);
		e.getEmployeeAddres("chennai");
		e.printEmployeeSalary(12000.34);
		e.printEmployeeMobileeNumber(6383157488l);
		e.printEmployeeName("appu",102);
		e.getEmployeeAddres("salem");
		e.printEmployeeSalary(28390.61);
		e.printEmployeeMobileeNumber(6383150000l);
				
	}




}
