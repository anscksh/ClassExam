
public class Student {

	//�������
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//������
	//�����ε��� ������
	//�޼���
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
		return;
	}
	//�����ε��� �޼���
	//������(main) (Ŭ������ ������ �ƴ�(static�� �ٴ� ���))
	public static void main(String[] args) { //������(enter point) : �ü������ ���α׷� ȣ�� 
		//Ŭ������ ������ = new ������ ()
		Student st1 = new Student(); //��ü ����
		st1.setStudentName("ȫ�浿");
		
		System.out.println(st1.studentName);		//������� ���� ��� (��� x)
		System.out.println(st1.getStudentName());	//�޼��带 Ȱ���ؼ� ���
	}

}