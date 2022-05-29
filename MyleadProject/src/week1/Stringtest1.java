package week1;

public class Stringtest1 {

	public static void main(String[] args) {
		
//		char[] ch= {'R','O','B','I','N'};
//		
//		String s=new String(ch);
//		
//		System.out.println(s);
//
//		
//		String s1=new String("HI");
//		String s2=new String("HI");
//		System.out.println(s1==s2);
//		String s=new String("HI HELLO");		
//
//		System.out.println(s);
//		System.out.println(s.toLowerCase());
//		System.out.println(s);
//		//		String s1=new String("HI");		
//
//	-	//        System.out.println(s1==s);
//
//		StringBuilder s1=new StringBuilder(s);
//		System.out.println(s1);
//		System.out.println(s1.reverse());
//		System.out.println(s1);
//		
//		StringBuffer s2=new StringBuffer();
//		System.out.println(s2.capacity());
//         s2.append("WELCOMEqwertyuioeuytrWELCOMEqwertyuioeuytr");		
//		System.out.println(s2.capacity());
//		
//        
//		System.out.println(s2.capacity());
//		System.out.println(s1);
//		System.out.println(s1);

		StringBuilder sb=new StringBuilder();

		System.out.println(sb.capacity());//default 16    
		sb.append("Hello");    
		System.out.println(sb.capacity());//now 16    
		sb.append("Java is my favourite language");    
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
		sb.ensureCapacity(10);//now no change    
		System.out.println(sb.capacity());//now 34    
		sb.ensureCapacity(100);//now (34*2)+2    
		System.out.println(sb.capacity());//now 70  
//
		
//		StringBuilder sb=new StringBuilder();
//		sb.append("abc");
//		sb.append(12);
//		sb.append('c');
//		sb.append(0.5f);
//		System.out.println("result : "+sb);
//
//		
//		String s4=sb.toString();
//		
//	   sb.insert(1, "hi");
//	   System.out.println(sb);
//
//	   sb.replace(1, 5, "robin");
//	   System.out.println(sb);
//	   
//	   sb.delete(1, 3);
//	   System.out.println(sb);
//	   
	
	}

}
