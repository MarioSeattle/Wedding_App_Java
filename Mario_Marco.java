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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // import the scanner to be used

import myClasses.Person;


		public class Mario_Marco {
			
			public static void main(String[] args) throws FileNotFoundException {
				
				int numGuests, TableSize;
				
				Scanner inFile = new Scanner(new File("/Users/Mgomez/documents/workspace/Mario_Marco/src/500names.txt"));
				
				int guestId = 0;
				
				Person[] guests = new Person[500]; 
				
				// while the file has another line, read it to the next line.
				while(inFile.hasNextLine()) {
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
					
			
					System.out.println("Please enter number of guests attending the wedding: \n");
					Scanner scanner = new Scanner(System.in); //take input
					numGuests = scanner.nextInt(); // Gathers user data for size of wedding.
					 
						System.out.println("Please enter the desired number of people at each table: \n ");
						Scanner scanner1 = new Scanner(System.in); //take input
						TableSize = scanner.nextInt(); // Gathers user data for size of each table
						
				
					System.out.print(guestId + "\n");
					
					scanner.close();
					scanner1.close();
					inFile.close();
					}// end main
				
			
				}
			
		
