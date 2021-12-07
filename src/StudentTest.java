
public class StudentTest {

	public static void main(String[] args) {

		StudentAR student[] = new StudentAR[5];
		
		student[0] = new StudentAR("捞抚1", 'A', "林家1");
		student[1] = new StudentAR("捞抚2", 'B', "林家2");
		student[2] = new StudentAR("捞抚3", 'C', "林家3");
		student[3] = new StudentAR("捞抚4", 'D', "林家4");
		student[4] = new StudentAR("捞抚5", 'F', "林家5");
		
		for (int i = 0; i < student.length; i++) {
			student[i].showInfo();
		}

	}
}