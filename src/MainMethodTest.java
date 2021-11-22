
public class MainMethodTest {

	public static void main(String[] args) {

		//Student Class Test
		Student st1 = new Student();
		st1.setStudentName("Student 1");
		
		System.out.println(st1.getStudentName());
		
		Student st2 = new Student();
		st2.setStudentName("Student 2");
		
		System.out.println(st2.getStudentName());
		
		System.out.println(st1);	//인스턴스 고유값
		System.out.println(st2);

	}
}