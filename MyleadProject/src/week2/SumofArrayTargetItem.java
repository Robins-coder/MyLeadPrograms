package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SumofArrayTargetItem {

	public static void main(String[] args) {
	
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("Enter the Arrays Length : ");
				int length=scanner.nextInt();
				System.out.println("Enter the Arrays Elements :  ");
				ArrayList<Integer> nums=new ArrayList<Integer>();
				for(int i=0;i<length;i++) 
				{
				     nums.add(scanner.nextInt());//543645	
				}
				System.out.println("Enter Target Number : ");
				int TargetNumber=scanner.nextInt();//
				
				HashMap<Integer,Integer> result=new HashMap<Integer, Integer>();
				//ArrayList<Integer> check=new ArrayList<Integer>();
			    
				for(int i=0;i<nums.size();i++)
				{
					for(int j=i+1;j<nums.size();j++) 
					{
				             if(((nums.get(i)+nums.get(j))==TargetNumber))//544567
				            	 
				             {      if( !(result.containsKey(nums.get(j))) && !(result.containsValue(nums.get(i))) )   
				            	    result.put(nums.get(i),nums.get(j));      
 
				                                             	 // 4+5 =9 => 4=5
				             //                                      5+4=9 => 5=4
				             } 		
					}	
				}
				
		       System.out.println(result);		

			}


	}


