package week3;

import java.util.Scanner;

public class Words_Diff {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter Frist String :");
		String s1=scanner.next().toLowerCase();
		System.out.println(" Enter Second String :");
		String s2=scanner.next().toLowerCase();
		
		String result="";
		for(int i=0;i<s1.length();i++)//Something 
		{
			
			if(!(s2.contains(""+s1.charAt(i)))) //else
			{
		              result+=s1.charAt(i);	   	
			}
			
		}
		
		System.out.println(" Output : "+result);
	}

}
