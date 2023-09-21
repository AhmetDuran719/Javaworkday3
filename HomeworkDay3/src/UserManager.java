
public class UserManager {

	public void addUserStudent(User user) {
		
		System.out.println("Öğrenci sistemine kaydedildi :" + user.getName()+ " " + user.getLastName());
		
	}
	
	public void addUserInstructor(User user) {
		System.out.println("Öğretmen sistemine kaydedildi :" + user.getName()+ " "  + user.getLastName());
		
	}
	
	
}
