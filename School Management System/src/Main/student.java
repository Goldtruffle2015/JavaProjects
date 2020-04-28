package Main;

public class student extends school {
	// -- Attributes -- //
	private int paid; // Fees paid
	private int total; // Total fees
	
	public student(String name, int id) {
		super(name, id);
	}
	
	// -- Setter -- //
	public void setPaid(int paid) {
		this.paid = paid;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	// -- Getter -- //
	public int getPaid() {
		return this.paid;
	}
	
	public int getTotal() {
		return this.total;
	}
	
	// -- Methods -- //
}
