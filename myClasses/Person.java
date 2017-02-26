package myClasses;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//constructor passes specific value
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//constructor initiates that there is nothing in
	public Person() {
		this.firstName = null;
		this.lastName = null;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
}
