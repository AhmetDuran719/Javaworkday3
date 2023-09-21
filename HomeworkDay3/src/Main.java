
public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		classAssignmentManager assignmentManager = new classAssignmentManager();
		
		User student1 = new Student(5, "Ahmet", "Duran", "beşitaş@gmail.com", "17");
		Student student2 = new Student(7, "İsmail", "Öncül", "Galatasaray@gmail.com", "25");
		
		
		
		User[] students = {student1,student2};
			for (User student : students) {
				userManager.addUserStudent(student);
			}
			
		User ınstructor1 = new Instructor(2, "engin", "demiroğ","fenerbahçe@gmail.com", "28");
		User ınstructor2 = new Instructor(8, "emre", "aktaş","trabzonspor@gmail.com", "65");
		
		User[] ınstructor = {ınstructor1,ınstructor2};
			for (User user : ınstructor) {
				userManager.addUserInstructor(user);
			}
		
			
			Student[] classAssignmentInTurkish = {(Student) student1,student2}; 
				for (Student user : classAssignmentInTurkish) {
					assignmentManager.addUserClass(user);
				}
	}
}
