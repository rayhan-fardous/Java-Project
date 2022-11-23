package  classes;
import java.lang.*;
import interfaces.*;

public class Library implements TeacherOperations, StudentOperations
{
	private Teacher Teachers[] = new Teacher [50];
	private Student Students[] = new Student [100];
	
	public void insertTeacher(Teacher c)
	{
		int flag = 0;
		for(int i=0; i<Teachers.length; i++)
		{
			if(Teachers[i] == null)
			{
				Teachers[i] = c;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Teacher Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeTeacher(Teacher c)
	{
		int flag = 0;
		for(int i=0; i<Teachers.length; i++)
		{
			if(Teachers[i] == c)
			{
				Teachers[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Teacher Removed");}
		else{System.out.println("Can Not Remove");}
	}
	public void showAllTeachers()
	{
		for(Teacher c : Teachers)
		{
			if(c != null)
			{
				System.out.println("**********************************");
				System.out.println("Teacher Name: "+ c.getName());
				System.out.println("Teacher NID: "+ c.getNid());
				System.out.println("----------------------------------");
				c.showAllAccounts();
				System.out.println("----------------------------------");
			}
		}
	}
	public Teacher getTeacher(int nid)
	{
		Teacher c = null;
		
		for(int i=0; i<Teachers.length; i++)
		{
			if(Teachers[i] != null)
			{
				if(Teachers[i].getNid() == nid)
				{
					c = Teachers[i];
					break;
				}
			}
		}
		if(c != null)
		{
			System.out.println("Teacher Found");
		}
		else
		{
			System.out.println("Teacher Not Found");
		}
		return c;
	}
	
	
	public void insertStudent(Student e)
	{
		int flag = 0;
		for(int i=0; i<Students.length; i++)
		{
			if(Students[i] == null)
			{
				Students[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Student Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
};