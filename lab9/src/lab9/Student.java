package lab9;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super();
		super.setName(name);
		super.setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program){
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee){
		this.fee = fee;
	}
	public String toString() {
		String tempString = "Name of Student: " + super.getName() + "\n" +
				"Student's program: " + program + "\n" +
				"Address of the Student: " + super.getAddress() + "\n" +
				"Student's graduation year: " + year + "\n" +
				"Student fee: " + fee;
		return tempString;
	}




}
