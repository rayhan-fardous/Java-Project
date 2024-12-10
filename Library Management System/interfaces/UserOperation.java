package interfaces;
import java.lang.*;
import classes.*;

public interface UserOperation
{
	boolean insertUser(User u);
	boolean removeUser(User u);
	User searchUser(String email);
	void showAllUser();
}