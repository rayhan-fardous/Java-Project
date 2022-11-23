import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Library b = new Library();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("////// Welcome to our Library ///////");
		
		boolean repeat = true;

		while(repeat)
		{
			System.out.println("Main menu:\n");
			System.out.println("1. Press 1 for Student Management");
			System.out.println("2. Press 2 for Teacher Management");
			System.out.println("3. Press 3 for Book Management");
			System.out.println("4. Press 4 for Book Borrow/Lost Management");
			System.out.println("5. Press 5 for Exit\n");

			System.out.print("Enter your Option: ");
			int choice = sc.nextInt();


			switch(choice)
			{
				case 1:
				
					System.out.println("**** Student Management ****");
					
					System.out.println("Choose your option for Student Management\n");
					System.out.println("1. Press 1 for Insert New Student");
					System.out.println("2. Press 2 for Get an Student");
					System.out.println("3. Press 3 for Remove Existing Student");
					System.out.println("4. Press 4 for Show All Student");
					System.out.println("5. Press 5 for return to the main menu");
					
					System.out.print("Enter your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("**************");
							System.out.println("Insert New Student");
							
							System.out.print("Enter Student ID: ");
							String stdId1 = sc.next();
							System.out.print("Enter Student Name: ");
							String nams1 = sc.next();
							System.out.print("Enter student's contact number: ");
							double contact = sc.nextDouble();
							
							Student s1 = new Student();
							s1.setStdId(stdId1);
							s1.setName(nams1);
							s1.setContact(contact);
							
							b.insertStudent(s1);
							
							System.out.println("////////////////////////");
							break;
							
						case 2:
						
							System.out.println("**********************");
							System.out.println("Get An Student");
							
							System.out.print("Enter Student ID: ");
							String stdId2 = sc.next();
							
							Student s2 = b.getStudent(stdId2);
							
							if(s2 !=null)
							{
								System.out.println();
								System.out.println("Student ID: "+s2.getStdId());
								System.out.println("Student Name: "+s2.getName());
								System.out.println("Student Contact: "+s2.getContact());
								System.out.println();
							}
							
							System.out.println("************************");
							break;
							
						case 3:
						
							System.out.println("************************");
							System.out.println("Remove an Existing Student");
							
							System.out.print("Enter Student ID: ");
							String stdId3 = sc.next();
							
							Student s3 = b.getStudent(stdId3);
							
							if(s3 != null)
							{
								b.removeStudent(s3);
							}
							System.out.println("*********************");
							break;
							
						case 4:
						
							System.out.println("***********************");
							System.out.println("Show All Students");
							b.showAllStudents();
							System.out.println("**********************");
							break;
							
						case 5:
						
							System.out.println("************************");
							System.out.println("Back to main menu");
							System.out.println("************************");
							break;
							
						default:
						
							System.out.println("************************");
							System.out.println("Invalid Option");
							System.out.println("************************");
							break;
					}
					
					System.out.println("///////////////////////////////");
					break;
					
				case 2:
				
					System.out.println("///////////////////////////////");
					System.out.println("You have choosen Teacher Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Teacher");
					System.out.println("	2. Get a Teacher");
					System.out.println("	3. Removing an Existing Teacher");
					System.out.println("	4. Show All Teachers");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("************************");
							System.out.println("Insert New Teacher");
							
							System.out.print("Enter Teacher NID: ");
							
							System.out.println("************************");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Get A Teacher");
							
							System.out.println("************************");
							break;
							
						case 3:
						
							System.out.println("************************");
							System.out.println("Remove an Existing Teacher");
							
							
							System.out.println("************************");
							break;
							
						case 4:
						
							System.out.println("************************");
							System.out.println("Show All Teachers");
							b.showAllTeachers();
							System.out.println("************************");
							break;
							
						case 5:
						
							System.out.println("************************");
							System.out.println("Going Back......");
							System.out.println("************************");
							break;
							
						default:
						
							System.out.println("************************");
							System.out.println("Invalid Option");
							System.out.println("************************");
							break;
					}
					
					System.out.println("///////////////////////////////");
					break;
					
				case 3:
				
					System.out.println("///////////////////////////////");
					System.out.println("/////////// Book Management /////////////");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1.");
					System.out.println("	2. ");
					System.out.println("	3. ");
					System.out.println("	4. ");
					System.out.println("	5. main menu\n");
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
				case 4:
				
					System.out.println("///////////////////////////////");
					System.out.println("You have choosen Book Borrow/Lost Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println(" 1. Borrow Book");
					System.out.println(" 2. Lost Book");
					System.out.println(" 3. Back to main menu\n");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("*************************");
							System.out.println("Borrow Book");
							System.out.print("Enter Student NID: ");
						
							System.out.println("*************************");
							break;
							
						case 2:
						
							System.out.println("*************************");
							System.out.println("Lost Book");
							System.out.print("Enter Student NID: ");
							
							
						case 3:
						
							System.out.println("*************************");
							System.out.println("Going Back");
							System.out.println("*************************");
							break;
							
						default:
						
							System.out.println("*************************");
							System.out.println("Invalid Option");
							System.out.println("*************************");
							break;
						
					}
					
					System.out.println("///////////////////////////////");
					break;
					
				case 5:
				
					System.out.println("///////////////////////////////");
					System.out.println("Exit");
					repeat = false;
					System.out.println("///////////////////////////////");
					break;
					
				default:
				
					System.out.println("///////////////////////////////");
					System.out.println("Invalid Choice");
					System.out.println("///////////////////////////////");
					break;
			}
			
			
		}
		
		
	}
}
