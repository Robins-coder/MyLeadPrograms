package week2;

public class VolatileKey {

	  private  static volatile int counter=0;
	
	public static void main(String[] args) {
		
		
	Thread t1= new Thread(()->{
         int local_counter=counter;  
          System.out.println("T1");        
        while(local_counter<10) 
        {
        	if(local_counter!=counter) 
        	{
        	       System.out.println("[T1] is change to counter  "+counter);	
        	       local_counter=counter;
        	}
        }
	});	

	
	Thread t2= new Thread(()->{
        int local_counter=counter;
    System.out.println("T2");        
        while(local_counter<10) 
        {
        	System.out.println("[T2] is Increment Counter");
        	counter=++local_counter;
        }
         
       try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
        

	});	

     t1.start();	
	 t2.start();	
	}

}
