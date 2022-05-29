package week3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumbervalid {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter the MobileNo : ");
		
         String mobileno=scanner.next();
		
		
		Pattern pattern=Pattern.compile("[987]{1}[0-9]{9}");
		Matcher matcher=pattern.matcher(mobileno);
		
		boolean check=matcher.matches();
		
		if(check) 
		{
			System.out.println("Mobile_No valid");
		}
		else 
		{
			System.out.println(" Mobile_No invalid");
		}
		
		
		
	}

}
