package week2.day4;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split=text.split(" ");
		//boolean found =false;
		for(int i=0;i<split.length;i++)
		{     
			if(split[i]!="0")
			{
			
			for(int j=i+1;j<split.length;j++)
			{
			   if(split[i].equals(split[j]))
			   {
			     split[j]="0";
	
			   }
			}
			}
		}
		for(int i=0;i<split.length;i++)
		{
			if(split[i]!="0")
			{
			{
			System.out.print(split[i]);
			}
			}
		}
	}

}
