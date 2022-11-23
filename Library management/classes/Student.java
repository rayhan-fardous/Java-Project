package  classes;
import java.lang.*;

public class Student
{
	private String stdId;
	private String name;
	private double contact;
	
	public void setStdId(String empId){this.stdId = stdId;}
	public void setName(String name){this.name = name;}
	public void setContact(double contact){this.contact = contact;}
	
	public String getStdId(){return stdId;} 
	public String getName(){return name;}
	public double getContact(){return contact;} 
}