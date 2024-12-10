import java.lang.*;
import java.util.Scanner;
import fileio.*;
import java.io.*;
import classes.*;



public class Start
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		System.out.println("Enter Library Name");
		String name001 = bfr.readLine();
		l.setLibraryName(name001);
		System.out.println("-------------------------------------------");
		System.out.println("Welcome to "+l.getLibraryName());
		System.out.println("-------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("-------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("\t1. Book Management");
			System.out.println("\t2. Librarian Management");
			System.out.println("\t3. User Management");
			System.out.println("\t4. Book Operation");
			System.out.println("\t5. Exit");
		
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Book Management ");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert A Book");
					System.out.println("\t2. Remove A Book");
					System.out.println("\t3. Search A Book");
					System.out.println("\t4. Show All Book");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your option: ");
					int option1 = sc.nextInt();
					switch(option1)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a Book");
							System.out.println("-------------------------------------------");
							
							Book b1 = null;
							
							System.out.println("There are Three Types of Books: ");
							System.out.println("\t 1. Text Book");
							System.out.println("\t 2. Story Book");
							System.out.println("\t 3. History Book");
							System.out.println("\t 4. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Insert a Text Book");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Book isbn: ");
								String isbn1 = sc.next();
								System.out.print("Enter Book Title: ");
								String title1 = bfr.readLine();
								System.out.print("Enter Author Name : ");
								String name1 = bfr.readLine();
								System.out.print("Enter Price: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Standard: ");
								int s1 = sc.nextInt();
								
								TextBook tb = new TextBook(isbn1, title1, name1,price1,aq1,s1);
								
								b1 = tb;
							}
							else if(type == 2)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Insert a Story Book");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Book isbn: ");
								String isbn2 = sc.next();
								System.out.print("Enter Book Title: ");
								String title2 = bfr.readLine();
								System.out.print("Enter Author Name : ");
								String name2 = bfr.readLine();
								System.out.print("Enter Price: ");
								double price2 = sc.nextDouble();
								System.out.print("Enter Available Quantity: ");
								int aq2 = sc.nextInt();
								System.out.print("Enter category: ");
								String c1 = sc.next();
								
								StoryBook sb = new StoryBook(isbn2, title2, name2,price2,aq2,c1);
								
								b1 = sb;
							}
							else if(type == 3)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Insert a History Book");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Book isbn: ");
								String isbn3 = sc.next();
								System.out.print("Enter Book Title: ");
								String title3 = bfr.readLine();
								System.out.print("Enter Author Name : ");
								String name3 = bfr.readLine();
								System.out.print("Enter Price: ");
								double price3 = sc.nextDouble();
								System.out.print("Enter Available Quantity: ");
								int aq3 = sc.nextInt();
								System.out.print("Enter century: ");
								int c2 = sc.nextInt();
								
								
								
								HistoryBook hb = new HistoryBook(isbn3, title3, name3,price3,aq3,c2);
								
								b1 = hb;
							}
							
							else if(type == 4)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back................");
								System.out.println("-------------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid Option...............");
								System.out.println("-------------------------------------------");
							}
							
							if(l.insertBook(b1))  { 
							
							     System.out.println("Book  Inserted...");                 
							}
							else {System.out.println("Book Can Not be Inserted...");}
							
							break;
							
						case 2:
						
							
							
							System.out.print("Enter Book Isbn: ");
							String isbn0 = sc.next();
							
							Book b2 = l.searchBook(isbn0);
							
							if(b2 != null)
							{
							    l.removeBook(b2);
								
								System.out.println("Book removed: ");
									
								
							}
							else
							{
								System.out.println("Book Not Found: ");
							}
							break;
							
							
							
							
						case 3:
						
							System.out.print("Enter Book Isbn: ");
							String isbn01 = sc.next();
							
							Book b3 = l.searchBook(isbn01);
							
							if(b3 != null)
							{
								b3.showDetails();
							}
							else
							{
								System.out.println("Book Not Found: ");
							}
						
							
						
							break;
							
						case 4:
						
							l.showAllBook();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Librarian Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Librarian");
					System.out.println("\t2. Remove Existing Librarian");
					System.out.println("\t3. Search a Librarian");
					System.out.println("\t4. Show All Librarian");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Librarian");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Librarian ID: ");
							int li1 = sc.nextInt();
							System.out.print("Enter Librarian Name: ");
							String ln1 = bfr.readLine();
							System.out.print("Enter Librarian Salary: ");
							double ls1 = sc.nextDouble();
							System.out.print("Enter Librarian Age: ");
							int la1 = sc.nextInt();
							
							
							Librarian l1 = new Librarian(li1, ln1, ls1, la1);
							
							if(l.insertLibrarian(l1)){
								
								System.out.println("Librarian  Inserted...");
								
								} 
							else {System.out.println("Librarian Can Not be Inserted...");}
							
							break;
							
						case 2:
						
							System.out.print("Enter Librarian Id: ");
							int libi = sc.nextInt();
							
							Librarian l2 = l.searchLibrarian(libi);
							
							if(l2 != null)
							{
								   l.removeLibrarian(l2);
							       System.out.println("Librarian removed: ");
						
								
							}
							else
							{
								System.out.println("Librarian Not Found: ");
							}
							
							
							break;
							
						case 3:
						
						    System.out.print("Enter Librarian Id: ");
							int libi1 = sc.nextInt();
							
							Librarian l3 = l.searchLibrarian(libi1);
							
							if(l3 != null)
							{
								l3.showDetails();
							}
							else
							{
								System.out.println("Librarian Not Found: ");
							}
						
							break;
							
						case 4:
						
							l.showAllLibrarian();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
					
					

					
					
					
				case 3:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose User Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New User");
					System.out.println("\t2. Remove Existing User");
					System.out.println("\t3. Search User");
					System.out.println("\t4. Show All User");
					System.out.println("\t5. Go Back");
					
					
					System.out.print("Your option: ");
					int option3 = sc.nextInt();
					
					
					
					switch(option3)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New User");
							System.out.println("-------------------------------------------");
							
							User u1 = null;
							
							System.out.println("There are Two Types of User: ");
							System.out.println("\t 1. Teacher");
							System.out.println("\t 2. Student");
							System.out.println("\t 3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type1 = sc.nextInt();
							
							if(type1 == 1)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Insert Teacher");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Teacher Name: ");
								String tn = bfr.readLine();
								System.out.print("Enter Teacher Department: ");
								String td= sc.next();
								System.out.print("Enter Teacher Birth Date : ");
								String tbd = sc.next();
								System.out.print("Teacher Blood Group: ");
								String tbg = sc.next();
								System.out.print("Enter Teacher Email: ");
								String te = sc.next();
								System.out.print("Teacher Id: ");
								int tid = sc.nextInt();
							
								Teacher tea = new Teacher(tn, td, tbd,tbg,te,tid);
								
								u1 = tea;
							}
							else if(type1 == 2)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Insert Student");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Student Name: ");
								String sn = bfr.readLine();
								System.out.print("Enter Student Department: ");
								String sd= sc.next();
								System.out.print("Enter Student Birth Date : ");
								String sbd = sc.next();
								System.out.print("Student Blood Group: ");
								String sbg = sc.next();
								System.out.print("Enter Student Email: ");
								String se = sc.next();
								System.out.print("Student Id: ");
								int sid = sc.nextInt();
							
								Student stu = new Student(sn, sd, sbd,sbg,se,sid);
								
								u1 = stu;
							}
							else if(type1 == 3)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back................");
								System.out.println("-------------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid Option...............");
								System.out.println("-------------------------------------------");
							}
							
							if(l.insertUser(u1)) {
								
								System.out.println("User Inserted...");
								} 
							else { System.out.println("User Can Not be Inserted..."); }
							
							break;
							
						case 2:
						    System.out.print("Enter User Email: ");
							String email1 = sc.next();
							
							User u2 = l.searchUser(email1);
							
							if(u2 != null)
							{
								l.removeUser(u2);
								
								System.out.println("User removed: ");
						
							}
							else
							{
								System.out.println("User Not Found: ");
							}
							break;
							
							
							
							
							
						case 3:
						
							System.out.print("Enter User Email: ");
							String email2 = sc.next();
							
							User u3 = l.searchUser(email2);
							
							if(u3 != null)
							{
								u3.showDetails();
							}
							else
							{
								System.out.println("User Not Found: ");
							}
						
							break;
							
						case 4:
						
							l.showAllUser();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
					
		
				
					
				case 4:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have Book Operation");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Borrow Book");
					System.out.println("\t2. Return Book");
					System.out.println("\t3. Go Back");
					
					System.out.print("Your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Borrow Book");
							System.out.println("-------------------------------------------");
							
							
							System.out.print("Enter Book Isbn which you want to borrow: ");
							String isbn09 = sc.next();
							Book bo78=l.searchBook(isbn09);
							if(bo78!=null)
							{
							    if(bo78.borrowBook())
								{
								   System.out.println("You can borrow this book");
								   System.out.print("Enter your email: ");
								   String listemail = sc.next();
								   User any =l.searchUser(listemail);
								   if(any!=null)
								   {
									  if(any.searchAnyBorrowedBook())
									  {
										 any.insertBorrowedBook(bo78);
										 System.out.println("Book borrowed");
										 bo78.borrowed();
										 
										 
									  }
								   
								   }
								   else  
								    {
									    	   
										System.out.println("You can not borrow this book because you're not registered");   
								   
								    }
								   
								}
								else
								{
									System.out.println("You can not borrow this book because this book is not available");
								}
							}
							else
							{
								System.out.println("Book Not Found");
								
							}	
									
							
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Return Book");
							System.out.println("-------------------------------------------");
			
							System.out.print("Enter Book Isbn which you want to return: ");
							String isbn089 = sc.next();
							Book re781=l.searchBook(isbn089);
					
							if(re781!=null)
							{
								
								   System.out.print("Enter your email: ");
								   String listemail1 = sc.next();
								   User any1 =l.searchUser(listemail1);
								   if(any1!=null)
								   {
									  if(any1.removeBorrowedBook(re781))
									  {
										 re781.returnBook();
										 System.out.println("How long have you been borrowing this book?");
										 int day = sc.nextInt();
										 if(re781.fine(day))
										 {
											System.out.println("You are fined "+((day-7)*10)+" Taka"); 
										 }
						
										 
									  }
								   
								   }
								   else  
								    {
									    	   
										System.out.println("You can not return this book because you're not registered");   
								   
								    }
								   
								
								
								
						
							}
							
							else
							{
								System.out.println("you can not return because this book doesn't belong to this library");
							}
								
							break;
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
													
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
					
					
					
					
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
				
					break;

				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
		}
	}
}