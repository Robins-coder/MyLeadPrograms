package week1;

public class CheckException {

	public static void main(String[] args) {

		
		try {
			  
			checkThrow();
            throw new ArithmeticException();			
		} 
		catch (ArithmeticException e) {
			  e.printStackTrace();
			System.out.println(" A !!!");
		}
		
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception throws !!! ");
			
		}
		finally {
			System.out.println("Finally !!");
		}
		
		
		
	}

	private static void checkThrow()  throws Exception{
		try {
			int n=5/0 ; 
		} catch (Exception e) {
			System.out.println(" Child Exception !!");
		}
		finally {
			System.out.println(" Finally2 !!");
		}
		
		
		
		
	}

}
