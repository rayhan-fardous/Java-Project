package interfaces;
import java.lang.*;
import classes.*;


public interface BorrowReturnOperation
{
	public boolean borrowBook();
	public void returnBook();
	public void borrowed();
	public boolean fine(int xyz);
}