package week2day3;

import java.util.Arrays;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int c=-1;
		
		Arrays.sort(arr);
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			
			  count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=arr[j];
					count++;
					
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
