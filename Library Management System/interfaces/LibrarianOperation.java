package interfaces;
import java.lang.*;
import classes.*;


public interface LibrarianOperation
{
	public boolean insertLibrarian(Librarian l);
	public boolean removeLibrarian(Librarian l);
	public Librarian searchLibrarian(int Id);
	public void showAllLibrarian();
}