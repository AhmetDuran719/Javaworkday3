
public class Instructor extends User{

	private String ınstructorNumber;
	
	public Instructor(int id,String name, String lastName, String email, String ınstructorNumber) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setTeacherNumber(ınstructorNumber);
	}

	public String getTeacherNumber() {
		return ınstructorNumber;
	}

	public void setTeacherNumber(String ınstructorNumber) {
		this.ınstructorNumber = ınstructorNumber;
	}
}
