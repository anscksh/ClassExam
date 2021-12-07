
public class StudentsTest {

	public static void main(String[] args) {

		Students st1 = new Students(1001, "È«±æµ¿");
		st1.addSubject("±¹¾î", 90);
		st1.addSubject("¿µ¾î", 85);
		
		Students st2 = new Students(1002, "±è»ñ°«");
		st2.addSubject("±¹¾î", 80);
		st2.addSubject("¼öÇÐ", 70);
		st2.addSubject("¿µ¾î", 95);
		
		st1.showStudentInfo();
		st2.showStudentInfo();

	}
}