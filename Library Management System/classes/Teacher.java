package classes;
import java.lang.*;

public class Teacher  extends User
{

	private int teacherId;
	
	
	public Teacher(){
		super();
	}
	public Teacher(String userName, String userDepartment, String userBirthdate,String userBloodgroup ,String userEmail,int teacherId )
	{
		super(userName,userDepartment,userBirthdate,userBloodgroup,userEmail);
		this.teacherId= teacherId;
		
	}

	 public void setTeacherId(int  teacherId) 
	 {
		 this.teacherId = teacherId;
	 }

	
	public int getTeacherId()  
	{
		return  teacherId; 
	}
	
	public void showDetails( ) 
	{
	    System.out.println("Name: "+userName );
		System.out.println("Department: "+userDepartment);
		System.out.println("Birth Date: "+  userBirthdate);
		System.out.println("Blood Group: "+userBloodgroup  );
		System.out.println("Email: "+  userEmail);
		System.out.println("Teacher Id: "+ teacherId );
	}
	
}