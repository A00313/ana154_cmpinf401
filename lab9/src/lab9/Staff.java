package lab9;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay) {
		super();
		super.setName(name);
		super.setAddress(address);
		this.pay = pay;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		String tempString = "Name of school: " + school + "\n" +
				"Name of Staff" + super.getName() + "\n" +
				"Address of the staff member: " + super.getAddress() + "\n" +
				"Pay of the staff member: " + this.pay + "\n";
		return tempString;
	}
}
