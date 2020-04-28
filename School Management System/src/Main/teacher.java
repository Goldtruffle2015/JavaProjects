package Main;

public class teacher extends school{
	// -- Attributes -- //
	private int salary; // Teacher salary
	
	public teacher(String name, int id) {
		super(name, id);
	}
	
	// -- Setter -- //
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// -- Getter -- //
	public int getSalary() {
		return this.salary;
	}
	
	// -- Methods -- //
}
