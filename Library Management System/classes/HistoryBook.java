package classes;
import java.lang.*;

public class HistoryBook  extends Book
{

	private int century;
	
	
	public HistoryBook(){
		super();
	}
	public HistoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int century)
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.century= century;
		
	}

	 public void setCentury(int century) 
	 {
		 this.century = century;
	 }

	
	public int getCentury()  
	{
		return century ; 
	}
	
	public void showDetails( ) 
	{
	    System.out.println("Isbn: "+ isbn);
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Author Name: "+  authorName);
		System.out.println("Price: "+  price);
		System.out.println("Available Quantity: "+  availableQuantity);
		System.out.println("Century: "+  century);
	}
	
}