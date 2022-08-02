package week2.day4;

public class ReverseEvenWords {
	public static void main(String[] args) {
		
		String str="I am a software tester";
		String[] str1=str.split(" ");
		String str2="";
		
		for(int i=0;i<str1.length;i++)
		{
			if(i%2!=0)
			{
				char[] charArray =str1[i].toCharArray();
				String rev="";
				for(int j=charArray.length-1;j>=0;j--)
				{
					rev=rev+charArray[j];
				}
				
				str2=str2+" "+rev;
			}
			else
			{
				str2=str2+" "+str1[i];
			}
		}
		
		System.out.println(str2);

	
	}
}
        
		
		
		


