
public class Student extends User{

	private String studentNumber;
	
	public Student(int id,String name, String lastName, String email, String studentNumber) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setSchoolNumber(studentNumber);
	}

	public String getSchoolNumber() {
		return studentNumber;
	}

	public void setSchoolNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
