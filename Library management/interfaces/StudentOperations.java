package interfaces;
import classes.*;
public interface StudentOperations
{
	void insertStudent(Student e);
	void removeStudent(Student e);
	Student getStudent(String stdId);
	void showAllStudents();
}