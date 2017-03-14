import myClasses.Person;
package myClasses;
import myClasses.Person;


public class Table {
	
	private int tableSize;
	
	private int numSeated;
	
	private int tableNum;
	
	private Person[] listOfGuests;
	
	public Table(int tableSize, int tableNum) {


		this.tableSize = tableSize;
		
		this.tableNum = tableNum;
		
		listOfGuests = new Person[tableSize];
		
		numSeated = 0;

	}
	public boolean addGuest(Person guest) {
		if (numSeated == tableSize) {
			return false;
		}
		listOfGuests[numSeated] = guest;
		numSeated++;
		return true;
	}
	public boolean isFull() {
		return numSeated == tableSize;
	}
	public String toString() {
		String result = "";
		
		result = "Table " + (tableNum + 1) + "\n";
		
		result += "------------------  \n";
		
		for (int index = 0; index < numSeated; index++) {
			result += listOfGuests[index].toString() + "\n";
		}
		
		return result + "\n";
	}
		
	}
	


		
	}
	public boolean addGuest(Person guest) {
		
		if (numSeated == tableSize) {
			
			return false;
		}
		listOfGuests[numSeated] = guest;
		
		numSeated++;
		
		return true;
	}
	public boolean isFull() {
		
		return numSeated == tableSize;
		
	}
	public String toString() {
		
		String result = "";
		
		result = "Table" + tableNum + "\n";
		
		result = "------------------";
		
		for (int index = 0; index < numSeated; index++) {
			
			result += listOfGuests[index].toString() + "\n";
		}
		
		return result;
	}
	
}




