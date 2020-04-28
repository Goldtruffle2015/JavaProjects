package Main;

import java.util.ArrayList;

public class school {
	// -- Attributes -- //
	protected static String name; // Name
	protected static int id; // Identification
	private static ArrayList<teacher> teacherList;
	private static ArrayList<student> studentList;
	
	public school(String name, int id) {
		this.name = name;
		this.id = id;
	}
}
