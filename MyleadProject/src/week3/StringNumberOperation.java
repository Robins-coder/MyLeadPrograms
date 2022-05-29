package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class StringNumberOperation {

	public static void main(String[] args) {


		//Infix to postfix
		
		HashMap<String, Integer> operand= new HashMap<String, Integer>();
		operand.put("+", 1);
		operand.put("-", 1);
		operand.put("*", 2);
		operand.put("/", 2);
		operand.put("^", 3);
		operand.put("(", 0);
		operand.put(")", 0);
        
		
		String s="1+2+3+2";//7
		Stack<String> stack=new Stack<String>();
		String temp="";String result="";
		
		for(int i=0;i<s.length();i++) //aBC
		{                             //+
		   temp=""+s.charAt(i);	    //-
	//	   System.out.println(result);
		   
		   if(temp.equals("+") || temp.equals("-") || temp.equals("/") || temp.equals("*") || temp.equals("^")) 
		   {
	                int pres=operand.get(temp);// / - 2	
            
	                if(stack.size()==0) 
	                 {
	                	 stack.add(temp);//+
//	                	 System.out.println(" stack1 : "+stack);        
	                 }
	                else if(pres<=operand.get(stack.lastElement())) //2<=2
                    {
	            	   for(int j=stack.size()-1;j>=0;j--) //4-0
	                   {
	                         if(pres<=operand.get(stack.get(j))) //2<=2
	                         {
	                                result+=stack.pop();
	                                if(j==0)
	                                stack.add(temp);
	                                
	                         }
	                         else {
	                        	 stack.add(temp);//-
	                        	 break;
	                        	 }
	                   }
	                   
                   }
	               else 
	               {   
	            	   stack.add(temp); // / 
	               }
                  
		   }
		   else if(temp.equals("(")) 
		   {
			   stack.add(temp);
		   }
		   else if(temp.equals(")")) 
		   {         
		        	 
		        	 System.out.println(" stack( : "+stack);                 
		        	 if(temp.equals(")")) 
		        	 {
		        		 for(int j=stack.size()-1;j>=0;j--) 
		        		 {
		        			 if(stack.get(j).equals("(")) 
		        			 {  stack.pop();
		        				break; 
		        			 }
		        			 else {
		        				 result+=stack.get(j);
		        				System.out.println( stack.pop());

		        			      }
		        		 }
		        	 }
		   }
		   else 
		   {
			   result+=s.charAt(i);//3
	
		   }
  
	}
		
		 if(stack.size()!=0) 
         {
        	 for(int j=stack.size()-1;j>=0;j--) 
    		 {
    			 result+=stack.get(j);
    		 }
         }
         
		 System.out.println(result);
	
		 
// Arithmatical operation      	

Stack<Integer> stack1=new Stack<Integer>();
int sum=0;char temp1='\00';

for(int i=0;i<result.length();i++) 
{
   	
         temp1=result.charAt(i);	
    
         if(stack1.size()>=0) 
         {
        
        	 if(temp1=='*' || temp1=='/' || temp1=='+' || temp1=='^' || temp1=='-') 
             {      System.out.println("Check !!!! "+stack1);
             System.out.println("Sum : "+sum);
            	    int a=stack1.pop();
    	            int b=stack1.pop();
            	   switch (temp1) {
    			   case '-': {
    				     
    				     sum=a-b;
    				     stack1.push(sum);
    				break;
    			   }
    			   case '+': {
    				     sum=a+b;
    				     stack1.push(sum);
    				   break;
    				   }
    			   case '/': {
    				     sum=a/b;
    				     stack1.push(sum); 
    				     break;
    				   }
    			   case '^': {
    				     sum=a^b;
    				     stack1.push(sum);
    				     break;
    				   }
    			   case '*': {
    				     sum=a*b;
    				     stack1.push(sum);
    				     break;
    				   }
    			default:
    				throw new IllegalArgumentException("Unexpected value: " + temp1);
    			}   
             }
             else 
             {  int put=Character.getNumericValue(temp1);
             System.out.println(put);
            	 stack1.push(put);
             }

        	 
         }
         
                  
}

System.out.println(sum);
System.out.println();
System.out.println("Final output:");
System.out.println(stack1);		 
		 
	}
	}
