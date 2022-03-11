package Demo;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


import Demo.bo.User;


public class Mainclass {
	 static String filename = null;
	 static Personal h = new Personal();
		static Record dis = new Record();
		static Boolean running = true;
	static 	Scanner sr = new Scanner(System.in);
	 public static void main(String[] args) {
		// static String filename = null;
			
		  	
				System.out.println("1. Register");
				System.out.println("2. Login");
				int n=sr.nextInt();
				User d=new User(); 
				switch(n)
				{
				case 1:
				{
					
					System.out.println(" Enter firstName => ");  
				    String firstName = sr.next(); 
				    
				  

				    System.out.println(" Enter lastName => ");
				    String lastName = sr.next();
				   

				    System.out.println(" Enter userName => ");
				    String userName = sr.next();
				    

				    System.out.println(" Enter password => ");
				    String password = sr.next();
				 

				    System.out.println(" Enter emailId => ");
				    String emailId = sr.next();
				   
				    System.out.println(" Enter phoneNo => ");
				    long phoneNo = sr.nextLong();

				   Regis m=new Regis(firstName,lastName,userName,password,emailId,phoneNo);
				   boolean b=d.insertRegis(m);
				   if(b==false)
				   {
					   System.out.println("Member Added Successfully");
					   List<Regis> li=d.getAllRegis();
					   System.out.println(li.size());
					   for(Regis r1:li) {
						   System.out.println(r1);
				   }
				   }
					
				   }
				case 2:
				{
					System.out.println("Enter emailId => ");
					String email=sr.next();
					
					System.out.println(" Enter password => ");
					String password1=sr.next();
					
						 Regis m=d.getRegisById(email);
	//	m.gf();
			/*		if(m.equals(null))
					
					System.out.println("Invalid Username or Password");
				}			*/			//System.out.println(email);
				
					if(email.equals("Guna@444"))
					{
					//System.out.println("Invalid Username or Password");
						if(password1.equals("Guna@11"))
						{
							while (running) {
								System.out.println("Personal Diary Management System" 
								
												 + "\nEnter 1 to Add Record: "
												 + "\nEnter 2 to View Record" 
												 + "\nEnter 3 to Save the record and Exit" 	
												 + "\nEnter 4 to Delete the record");
								int answer = sr.nextInt();
								
								switch (answer) {
								case 0:
									System.out.println("Enter the file name to load");
									filename = sr.next();
									loadScript(filename);
									break;
								
								case 1:
									addRecord();
									break; 
								case 2:
									System.out.println(dis.toString());
									break;
							case 4:
								deleteRecord();
							System.out.println(dis.toString());
								break;
						
								case 3:
									SaveAndQuit();	
									break;
								}

							}
							System.exit(0);
					
						}
						
						else
						{
							System.out.println("Wrong answer");
						}
						
						//System.exit(0);
						

				}
					else if(password1.equals(m.getPassword()))
					{
						System.out.println("Wrong password");
					}
					
					else
					{
						System.out.println("Invalid Username or Password");	
					}
				}
			}


}
	    	

public static void addRecord() {

	 String recordfile;
	 String name;
	 String dateofbirth;
	 String message;
	 String  place;
	 System.out.println("\nEnter the name for the record :");
	 recordfile = sr.next();
	 
	 System.out.println("\nEnter the name :");
	 name = sr.next();
	 
	 System.out.println("\nEnter the Date of Birth:");
	 dateofbirth = sr.next();
	 
	 System.out.println("\nEnter the Message:");
	 message = sr.next();
	 
	 System.out.println("\nEnter the place");
	 place = sr.next();

	Personal h= new Personal(recordfile,name, dateofbirth,message, place);
	dis.addPersoanl(h);

	
}
private static void deleteRecord() {

	 String Recordname;


	 
	 System.out.println("\nEnter the Record Name name :");
	 Recordname = sr.next();
	

	//Health h= new Health();
	dis.deletefiles(Recordname);

	
}

private static void SaveAndQuit() {
	
	// TODO Auto-generated method stub
	System.out.println("Enter file name");
	try {
		filename = sr.next() + ".ser";
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	running = false;
	
	FileOutputStream fos = null;
	ObjectOutputStream out = null;
	try {
		fos = new FileOutputStream(filename);
		out = new ObjectOutputStream(fos);
		out.writeObject(dis);
		fos.close();
		out.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	
}
private static void loadScript(String name) {
	
	// TODO Auto-generated method stub
	FileInputStream fis = null;
	ObjectInputStream in = null;

	File file = new File(name + ".ser");
	if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				in= new ObjectInputStream(fis);
				dis =(Record) in.readObject();
				fis.close();
				in.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}
	else {
		System.out.println("\n The file does not exist :( ");
	}
}

}


