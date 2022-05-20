/* Author: Tanveer Singh Sran
   StudentID: 991663387
   Last Updated: 2022-05-19
*/

public class Course {
	/* Fields for name and course number, students enrolled
		and max student limit */
	private String name;
	private String number;
	private int numberOfStudents;
	private final int maxStudents = 30;
	
	// Constructor with two arguments for name and course number
	public Course(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	// Student object initialized with max length matching max students
	Student[] students = new Student[maxStudents];
		
	// Method to add student to course
	public void addStudent(Student obj) {
		try {
			students[numberOfStudents] = obj;
		}		
		catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Max Student Limit Reached"); // throw exception if max limit reached
		}
		numberOfStudents++; // Using numberOfStudents as a counter as well.
	} 
	
	// Method to remove student from course
	public void dropStudent(Student obj) {
		for (int i = 0; i < students.length ; i++) {
			if (students[i] == obj) { // give null value to the object in the array when student is found
				students[i] = null; 
				numberOfStudents--;	
			} // end of if			
		} // end of loop
	} // end of method
	
	// printing all the students in the course
	public void printStudents() {
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(students[i].toString()); // calling toString method of Student class
		}
	}
	
}