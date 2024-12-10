package interfaces;
import java.lang.*;
import classes.*;

public interface UserBorrowReturnOperation
{
	public boolean searchAnyBorrowedBook();
	public boolean insertBorrowedBook(Book b);
	public boolean removeBorrowedBook(Book b);
}