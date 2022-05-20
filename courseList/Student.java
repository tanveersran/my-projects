/* Author: Tanveer Singh Sran
   StudentID: 991663387
   Last Updated: 2022-05-19
*/

public class Student {
	// Private fields for name and id number of student
	private String name;
	private String number;
	
	// Constructor with two parameters
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	// Getters
	public String getNumber() {return number;}
	public String getName() {return name;}
	
	// toString method returning name and id
	public String toString() {
		return "Student: " + getName() + ", ID: " + getNumber(); 
	}
}
