package interfaces;
import java.lang.*;
import classes.*;

public interface BookOperation
{
	public boolean insertBook(Book b);
	public boolean removeBook(Book b);
	public Book searchBook(String isbn2);
	public void showAllBook();
}