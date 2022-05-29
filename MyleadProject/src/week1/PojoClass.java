package week1;

public class PojoClass {


	private String  name;
	private String Email_id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
    public String details() 
    {
         String s="name : "+name+" Email_id : "+Email_id +" age : "+age;
         return s;
    }

}
