package week4day4task;

public class AxisBank  {
	public void deposit()
	{
		System.out.println("deposit: 20,000");
	}
	public static void main(String[] args) {
		
		AxisBank b = new AxisBank();
		b.savings();
		b.fixed();
		b.deposit();
		
	}

}
