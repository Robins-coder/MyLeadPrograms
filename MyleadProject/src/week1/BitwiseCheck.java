package week1;

public class BitwiseCheck {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		
		if(a++>5 | a++>6) 
		{
			System.out.println("AAA!!!");
		}
			System.out.println(" A " + a);
		
		
		if(++b>15 & ++b >444) 
		{
			System.out.println("BBBBBBB!!!");
		}
			System.out.println(" B "+ b);
		

		
	}

}
