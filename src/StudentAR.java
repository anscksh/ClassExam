
public class StudentAR {

	private static int serial = 1000;
	private int studentID;
	private String name;
	private char grade;
	private String address;
	
	public StudentAR() {
		serial++;
		studentID = serial;
	}
	public StudentAR (String name) {
		serial++;
		studentID = serial;
		this.name = name;
	}
	
	public StudentAR (String name, char grade, String address) {
		serial++;
		studentID = serial;
		this.name = name;
		this.grade = grade;
		this.address = address;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGrade (char grade) {
		this.grade = grade;
	}
	public char getGrade () {
		return grade;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	public String getAddress () {
		return address;
	}
	
	public void showInfo() {
		System.out.println(studentID + " / " + name + " / " + grade + " / " + address);
	}

}