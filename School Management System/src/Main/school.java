package Main;

import java.util.ArrayList;

public class school {
	// -- Attributes -- //
	protected String name; // Name
	protected int id; // Identification
	private ArrayList<teacher> teacherList; // Stores all instances of teacher
	private ArrayList<student> studentList; // Stores all instances of student
	
	public school(String name, int id) {
		this.name = name;
		this.id = id;
	}
	// -- Getter -- //
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.id;
	}
	
	// -- Methods -- //
	public void addTeacher(String name, int id) {
		this.teacherList.add(new teacher(name, id));
	}
	
	public void addStudent(String name, int id) {
		this.studentList.add(new student(name, id));
	}
	
	public void viewTeacherStats() {
		for (int i=0;i<this.teacherList.size();i++) {
			System.out.println(this.teacherList.get(i).getName() + " | $" + this.teacherList.get(i).getSalary());
		}
	}
	
	public void viewStudentStats() {
		for (int i=0;i<this.studentList.size();i++) {
			System.out.println(this.studentList.get(i).getName() + " | $" + this.studentList.get(i).getPaid() + " | $" + this.studentList.get(i).getTotal());
		}
	}
}
