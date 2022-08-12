package week4day4task;

public class Students {
	
	public void getStudentInfo(int id,int age)
	{
		System.out.println(id+" "+age);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id+"  "+name);
	}
	public void getStudentInfo(String dept,String name)
	{
		System.out.println(dept+"  "+name);
	}
	
	public static void main(String[] args) {
		
		Students s= new Students();
		s.getStudentInfo(21,60);
		s.getStudentInfo(101,"Ram");
		s.getStudentInfo("Raja","Ram");
	}

}
