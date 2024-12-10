package classes;
import java.lang.*;

public class Student  extends User
{

	private int studentId;
	
	
	public Student(){
		super();
	}
	public Student(String userName, String userDepartment, String userBirthdate,String userBloodgroup ,String userEmail,int studentId )
	{
		super(userName,userDepartment,userBirthdate,userBloodgroup,userEmail);
		this.studentId= studentId;
		
	}

	 public void setStudentId(int  studentId) 
	 {
		 this.studentId = studentId;
	 }

	
	public int getStudentId()  
	{
		return  studentId; 
	}
	
	public void showDetails( ) 
	{
	    System.out.println("Name: "+userName );
		System.out.println("Department: "+userDepartment);
		System.out.println("Birth Date: "+  userBirthdate);
		System.out.println("Blood Group: "+userBloodgroup  );
		System.out.println("Email: "+  userEmail);
		System.out.println("Student Id: "+ studentId );
	}
	
}