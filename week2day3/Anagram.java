package week2day3;

public class Anagram {
	public static void main(String[] args) {
		
		int count=0;
		char c='z';
		String text1="stops";
		String text2="potss";
		char[] charArray1=text1.toCharArray();
		char[] charArray2=text2.toCharArray();
		
		if(charArray1.length==charArray2.length)
		{
		for(int i=0;i<charArray1.length;i++)
		{
			   if(charArray1[i]!=-1)
			   {
			for(int j=0;j<charArray2.length;j++)
			{
				
				
				if(charArray1[i]==charArray2[j])
				{
			
					charArray1[i]=charArray2[j];
					charArray2[j]=c;
					count++;
				}
			}
			   }
		}
	}
		
		if(charArray1.length==count)
		{
			System.out.println("It is an Anagram");
		}
		else
		{
			System.out.println("It is not an Anagram");
		}
		
		
		
		
		
		
		
		}

}
