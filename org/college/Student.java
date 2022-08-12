package org.college;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("studentName :Ram");
	}
	
	public void studentDept()
	{
		System.out.println("studentDept : Mech");
	}
	
	public void studentId()
	{
		System.out.println("studentId: 101");
	}
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}


	

}
