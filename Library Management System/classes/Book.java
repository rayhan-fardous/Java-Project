package classes;
import java.lang.*;
import interfaces.*;

public abstract class Book implements BorrowReturnOperation 
{
	protected String isbn;
    protected String bookTitle;
    protected String authorName;
	protected double price;
	protected int availableQuantity;
	
	public Book(){}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
	    this.authorName =authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;	
	}
	public void  setAuthorName(String authorName)
	{
		this.authorName =authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}

	public String getIsbn()
	{
		return isbn; 
	}
	public String getBookTitle( )
	{
		return bookTitle; 
	}
	public String getAuthorName( )
	{ 
		return authorName;
	}
	public double getPrice( )
	{
		return price; 
	}
	public int getAvailableQuantity( )
	{ 
		return availableQuantity ;
	}
	
	public boolean borrowBook()
	{
		if(availableQuantity>0)
	{
		return true;	
	}
	else
	{
		return false;
	}
	}
	public void borrowed()
	{
		availableQuantity=availableQuantity-1;
	}
	public void returnBook()
	{
	    System.out.println("Book returned");
		availableQuantity=availableQuantity+1;
	
	}
	
	public boolean fine(int xyz)
	{
		if(xyz>7)
	{
		return true;	
	}
	else
	{
		return false;
	}
	}
	
	public abstract void showDetails();

}