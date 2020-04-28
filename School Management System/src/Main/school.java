package Main;

import java.util.ArrayList;

public class school {
	// -- Attributes -- //
	protected String name; // Name
	protected int id; // Identification
	private ArrayList<teacher> teacherList;
	private ArrayList<student> studentList;
	
	public school(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// -- Methods -- //
	public void addTeacher(String name, int id) {
		teacherList.add(new teacher(name, id));
	}
	
	public void addStudent(String name, int id) {
		studentList.add(new student(name, id));
	}
}
