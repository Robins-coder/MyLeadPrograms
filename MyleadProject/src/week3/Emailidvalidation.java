  package week3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailidvalidation {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter the Email_id : ");
		String Email=scanner.next();
		
	   Pattern pattern=Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(Email);
		
		boolean check=matcher.matches();
		
		if(check) 
		{
			System.out.println("Email valid");
		}
		else 
		{
			System.out.println(" Email invalid");
		}
		   
		
	}

}
