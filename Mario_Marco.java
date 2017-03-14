/*
 * Program: Wedding Guest Seating
 * 
 * Authors: Marco Punio, Mario G.
 * 
 * Written: February 18th, 2017
 * 
 * Course: Comp. Sci. 142
 *			Winter 2016
 *	 		
 *Compiler: Java
 *
 *Description: This program will allow the user to input an amount of guests
 *and tables, and will be able to output each guest person's name in the output window. 
 */
import java.io.*;
import java.util.*; // import the scanner to be used
import myClasses.Person;

		public class Mario_Marco {
			
			public static void main(String[] args) throws IOException {
				
				int numGuests, TableSize;
				
				Scanner inFile = new Scanner(new File("\Users\Valued Customer\Documents\GitHub\Wedding_App_Java\500names.txt"));
				
				int guestId = 0;
				
				Person[] guests = new Person[500]; 
				
			// while the file has another line, read it to the next line.
			while (inFile.hasNextLine()) {
				
					String fullName = inFile.nextLine();
					
					String[] names = fullName.split(" ");
					
					Person p = new Person();
					
					p.setFirstName(names[0]);
					
					p.setLastName(names[1]);
					
					guests[guestId] = p;
					
					guestId++ ;
				}
				

			for (int i = 0; i < guestId; i++) {
						
					System.out.print(guests[i] + "\n");
						
					}

			
			//The date of the wedding
			
			java.util.Date date = new java.util.Date();

		    System.out.println(date);

		    System.out.println("The big day is here!  "+ "\n" + date);
					
			
			System.out.println("Please enter number of guests attending the wedding: \n");
					
			Scanner scanner = new Scanner(System.in); //take input
					
			numGuests = scanner.nextInt(); // Gathers user data for size of wedding.
					 
			System.out.println("Please enter the desired number of people at each table: \n ");
					
					

						
			TableSize = scanner.nextInt(); // Gathers user data for size of each table

					Scanner scanner1 = new Scanner(System.in); //take input
						
						TableSize = scanner.nextInt(); // Gathers user data for size of each table

					
					
					
					scanner.close();
					
					inFile.close();
				
					
			int numTables = numGuests / TableSize;
			if (numGuests % TableSize != 0) {
				numTables++;
			}
			Table[] tables = new Table[numTables]; // made spot to save table
			
			int tableId = -1; // tableId is the array of tables created
			
			for ( int i = 0; i < numGuests; i++) { // i is equal to guest index
				if ( i % TableSize == 0) {
					tableId++; // if the table is full, increment tables by one
					tables[tableId] = new Table(TableSize, tableId);
				}
				tables[tableId].addGuest(guests[i]);
			}
			
			Writer out = new FileWriter("src/SeatingPlan.txt");
			for (int i = 0; i < tables.length; i++) {
				out.write(tables[i].toString());
			}
			
			out.flush();
			out.close();
		
	        }// end main
				   

	  }  // end class
	       
	        

		
