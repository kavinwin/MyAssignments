package week2day3;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
	
	int a=153;
	int l,sum=0,m;
	m=a;
	while(a!=0)
	{
		l=a%10;
		sum=sum+(l*l*l);
		a=a/10;
	}
	System.out.println(sum);
	
	if(m==sum)
	{
		System.out.print(sum +" It is an armstrong");
	}
	else
	{
		System.out.print(sum+" It is not an armstrong");
	}
	
	
	
	}

}
