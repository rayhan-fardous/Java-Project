package classes;
import java.lang.*;

public class TextBook  extends Book
{
	
	private int standard ;
	
	
	public TextBook (){
		super();
	}
    public  TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.standard= standard;
		
	}

	
	 public void setStandard(int standard)
	 {
		 this.standard = standard;
	 }
	 
	
	public int getStandard( )    
	{
		return standard  ; 
	}
	
	public void showDetails( ) 
	{    
	    System.out.println("Isbn: "+ isbn);
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Author Name: "+  authorName);
		System.out.println("Price: "+  price);
		System.out.println("Available Quantity: "+  availableQuantity);
		System.out.println("Standard: "+ standard );
	}
	
}