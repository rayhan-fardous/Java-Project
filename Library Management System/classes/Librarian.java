package classes;
import java.lang.*;

public class Librarian
{
	private int librarianId;
	private String librarianName;
	private double librarianSalary;
	private int librarianAge;
	public Librarian(){
		
	}
	public Librarian(int librarianId, String librarianName,double librarianSalary ,int librarianAge)
	{
		
		this.librarianId=librarianId;
		this.librarianName=librarianName;
		this.librarianSalary=librarianSalary;
		this.librarianAge=librarianAge;
		
	}
	
	public void setLibrarianId(int librarianId){this.librarianId = librarianId;}
	public void setLibrarianName(String librarianName){this.librarianName = librarianName;}
	public void setLibrarianSalary(double librarianSalary){this.librarianSalary = librarianSalary;}
	public void setLibrarianAge(int librarianAge){this.librarianAge = librarianAge;}
	
	public int getLibrarianId(){return librarianId;} 
	public String getLibrarianName(){return librarianName;}
	public double getLibrarianSalary(){return librarianSalary;} 
	public int getLibrarianAge(){return librarianAge;} 
	
	public void showDetails()
	{
		System.out.println("Librarian Id: " + librarianId);
		System.out.println("Librarian Name: " +librarianName );
		System.out.println("Librarian Salary: " + librarianSalary);
		System.out.println("Librarian Age: " + librarianAge);
		
	}
}