
public class StudentTest {

	public static void main(String[] args) {

		StudentAR student[] = new StudentAR[5];
		
		student[0] = new StudentAR("�̸�1", 'A', "�ּ�1");
		student[1] = new StudentAR("�̸�2", 'B', "�ּ�2");
		student[2] = new StudentAR("�̸�3", 'C', "�ּ�3");
		student[3] = new StudentAR("�̸�4", 'D', "�ּ�4");
		student[4] = new StudentAR("�̸�5", 'F', "�ּ�5");
		
		for (int i = 0; i < student.length; i++) {
			student[i].showInfo();
		}

	}
}