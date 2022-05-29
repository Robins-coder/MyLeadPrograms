package week2;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToNumber1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=scanner.next();
		
		HashMap<Character, Integer> roman_values=new HashMap<Character, Integer>();
		
		roman_values.put('I', 1);
		roman_values.put('V', 5);
		roman_values.put('X', 10);
		roman_values.put('L', 50);
		roman_values.put('C', 100);
		roman_values.put('D', 500);
		roman_values.put('M', 1000);
	
	//left-right 
		int total=roman_values.get(s.charAt(s.length()-1));
		
		for(int i=s.length()-2;i>=0;i--) 
		{   // current value is greater than right value => sum current value or less than right value substract sum;
			
			if(roman_values.get(s.charAt(i))>=roman_values.get(s.charAt(i+1))) 
			{
			  total+=roman_values.get(s.charAt(i));	
			}
			else 
			{
		       total-=roman_values.get(s.charAt(i));		
			}
			
		}
		
	System.out.println(total);	
	
	
	}

}
