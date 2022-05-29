package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class PojoTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		ArrayList<PojoClass> l=new ArrayList<>();
		System.out.println("Enter How many user added ...");
		int n=scanner.nextInt();
		while(n!=0) {
		System.out.println("ENter Name :");
		String name=scanner.next();
		System.out.println("Enter mail_ID :");
		String mail_id=scanner.next();
		System.out.println("Enter Age : ");
        int age=scanner.nextInt();
        PojoClass ob=new PojoClass();
        ob.setAge(age);
        ob.setEmail_id(mail_id);
        ob.setName(name);
        
        l.add(ob);
		n--;
		}
        
		PojoClass ob=new PojoClass();	
	    System.out.println(ob.toString());
       
        
        
//    	System.out.println(ob.getAge());        
//        System.out.println(l.size());
    	for(PojoClass i :l) 
        {   
    		System.out.println(i.details());
    		System.out.println(i.getName());
    		System.out.println(i.getEmail_id());
    		System.out.println(i.getAge());

//        	System.out.println(i);
//        	System.out.println();
        	//System.out.println(i.getEmail_id());
        }
//        
		
		
	}

}
