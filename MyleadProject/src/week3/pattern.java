package week3;

public class pattern {

	public static void main(String[] args) {
		
		int n=10;
		int a=0;int d=n;
		for(int i=0;i<n;i++) 
		{    a=i+1;
			for(int j=0;j<=i;j++) 
			{   
			    System.out.print(a+" ");	
		        d--;
			    a+=d;
			}
			d=n;
			System.out.println();
			
		}
		
	}
	
}
