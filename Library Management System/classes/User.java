package classes;
import java.lang.*;
import interfaces.*;
public abstract class User implements UserBorrowReturnOperation
{
	protected String userName;
    protected String userDepartment;
	protected String userBirthdate;
	protected String userBloodgroup;
	protected String userEmail;
	public Book borrowedbooks[]=new Book[1000];
	
	
	public User(){}
	public User(String userName, String userDepartment, String userBirthdate,String userBloodgroup ,String userEmail )
	{
		this.userName = userName;
		this.userDepartment = userDepartment;
	    this.userBirthdate =userBirthdate;
		this.userBloodgroup = userBloodgroup;
		this.userEmail = userEmail;
	}	
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setUserDepartment(String userDepartment)
	{
		this.userDepartment = userDepartment;	
	}
	public void  setUserBirthdate(String userBirthdate)
	{
		this.userBirthdate =userBirthdate;
	}
	public void setUserBloodgroup(String userBloodgroup)
	{
		this.userBloodgroup =userBloodgroup;
	}
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}

	public String getUserName()
	{
		return userName; 
	}
	public String getUserDepartment()
	{
		return userDepartment; 
	}
	public String getUserBirthdate()
	{ 
		return userBirthdate;
	}
	public String getUserBloodgroup()
	{
		return userBloodgroup; 
	}
	public String getUserEmail()
	{ 
		return userEmail ;
	}

	public abstract void showDetails();
	
	
	
	public boolean searchAnyBorrowedBook()
	{
		boolean flag = true;
		for(int i=0; i<borrowedbooks.length; i++)
		{
			if(borrowedbooks[i] != null)
			{
				System.out.println("You can not borrow any book because you already borrowed a book" );
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public boolean insertBorrowedBook(Book b)
	{
		boolean flag = false;
		for(int i=0; i<borrowedbooks.length; i++)
		{
			if(borrowedbooks[i] == null)
			{
				borrowedbooks[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeBorrowedBook(Book b)
	{
		boolean flag = false;
		for(int i=0; i<borrowedbooks.length; i++)
		{
			if(borrowedbooks[i] == b)
			{
				borrowedbooks[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	
}