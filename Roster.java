package sgerard;

import java.util.ArrayList;

public class Roster {
	
	private static ArrayList<Student> newStudent = new ArrayList<>();
	
	public static void sgerard.Roster(String[] args) {
		//Add Students
		newStudent.add(new Student("1", "John", "Smith", "John1989@gmail.com", 20, new int[] {88, 79, 59}));
		newStudent.add(new Student("2", "Susan", "Erickson", "Erickson_1990@gmailcom", 19, new int[] {91, 72, 85}));
		newStudent.add(new Student("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, new int[] {85, 84, 87}));
		newStudent.add(new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22, new int [] {91, 98, 92}));
		newStudent.add(new Student("5", "Sunda", "Gerard", "sgerar1@wgu.edu", 42, new int [] {86, 97, 79}));
	
		printAllStudents();
		printAverageGrade();
		
	}

	public static void add(String StudentID, String FirstName, String LastName, String Email, int Age, int Grade1, int Grade2, int Grade3) {
		int[] Grades = {Grade1, Grade2, Grade3};
		Student nStudent = new Student(StudentID, FirstName, LastName, Email, Age, Grades); //We can create a new student
		newStudent.add(nStudent);
		
	}
	
	public static void printAllStudents() {
		//Loop through ArrayList of newStudent
		for( int i=0; i < newStudent.size(); i++) {
			//Get each student and call to print
			newStudent.get(i).print();
		}
		
	}
	
	public static void printAverageGrade() {
		
	}
	
	public static void findStudent(String LastName) {
		
	}
}


