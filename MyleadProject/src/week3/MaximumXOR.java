package week3;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumXOR {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(" Enter Array length :");
		int len=scanner.nextInt();
		System.out.println("Enter Array Elements -->");
		int[] a=new int[len];
		for(int i=0;i<len;i++) 
		{
		 System.out.print(">>");
		 a[i]=scanner.nextInt();
		 System.out.println();
		}
		
	  int max=0,xor=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++) 
			{
		            xor=a[i]^a[j];  
		           // System.out.println(xor);
				if(max<xor) 
				{  // System.out.println("max :"+max);
				   max=xor;	
				}
			}
		}
		
System.out.println("Xor output : "+max);		
	
	}

}
