package classes;
import java.lang.*;

public class StoryBook  extends Book
{

	private String category;
	
	
	public StoryBook(){
		super();
	}
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.category= category;
		
	}

	 public void setCategory(String category) 
	 {
		 this.category = category;
	 }

	
	public String getCategory( )  
	{
		return category ; 
	}
	
	public void showDetails( ) 
	{
	    System.out.println("Isbn: "+ isbn);
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Author Name: "+  authorName);
		System.out.println("Price: "+  price);
		System.out.println("Available Quantity: "+  availableQuantity);
		System.out.println("Category: "+  category);
	}
	
}