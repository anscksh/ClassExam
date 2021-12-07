
public class Student {

	//�������
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//������
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
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
	}
	
	public static int getSerialNum () {
		return serialNum;
	}
	//�����ε��� �޼���
	//������(main) (Ŭ������ ������ �ƴ�(static�� �ٴ� ���))
	public static void main(String[] args) { //������(enter point) : �ü������ ���α׷� ȣ�� 
		//Ŭ������ ������ = new ������ ()
		Student st1 = new Student(); //��ü ����
		st1.setStudentName("ȫ�浿");
		Student st2 = new Student();
		st2.setStudentName("�ƹ���");
		
		System.out.println(st1.studentName);		//������� ���� ��� (��� x)
		System.out.println(st1.getStudentName());	//�޼��带 Ȱ���ؼ� ���
		System.out.println(Student.getSerialNum());
		System.out.println(st1.studentID);
		System.out.println(Student.getSerialNum());
		System.out.println(st2.studentID);
	}

}