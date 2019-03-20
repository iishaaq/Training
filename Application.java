
public class Application {

//	private static Student student;
	
	public static void main(String[] args) {

		Student student;
		Course course;
		int id;
		
		student = new Student();
		course = new Course("Java");
		id = 10;
		student.setCourse(course);
		student.setId(id);
		
		System.out.println("before" + student);
		changeStudent(student);
		System.out.println("After" + student);
	}

	private static void changeStudent(Student student2) {
		
		Student newStudent = new Student();
		Course course2 = new Course("Angular");
		int id = 20;
		newStudent.setId(id);
		newStudent.setCourse(course2);
		student2 = newStudent;
//		student = newStudent;
		
//		Course course2 = new Course("Angular");
//		student2.setCourse(course2);
		
	}

}
