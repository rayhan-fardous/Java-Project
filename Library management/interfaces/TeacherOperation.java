package interfaces;
import classes.*;
public interface TeacherOperations
{
	void insertTeacher(Teacher c);
	void removeTeacher(Teacher c);
	Teacher getTeacher(int nid);
	void showAllTeachers();
}