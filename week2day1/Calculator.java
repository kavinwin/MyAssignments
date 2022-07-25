package week2day1;

public class Calculator
{
	public int subtract(int a,int b)
	{
		return a-b;
	}
	
	public int add(int e,int f)
	{
		return e+f;
	}
	
	public double multiply(double i,double j)
	{
		return i*j;
	}
	
	public float divide(float x,float y)
	{
		return x/y;
	}
	
	
	public static void main(String[] args) {
		
	
		Calculator C = new Calculator();
		int subtract=C.subtract(100,70);
		System.out.println(subtract);
		int add= C.add(100,90);
		System.out.println(add);
		double multiple =C.multiply(10,12);
		System.out.println(multiple);
		float divide =C.divide(100f,10f);
		System.out.println(divide+"f");
	}
}