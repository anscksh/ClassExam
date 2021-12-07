import java.util.*;
public class Students {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Students() {}
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	//������ ������ �߰��ϴ� �޼��� (�л����� ���� ó��)
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		subjectList.add(subject);
	}
	//��� �޼���
	public void showStudentInfo() {
		System.out.println("========================================");
		System.out.println("�й� : " + studentID + ", �̸� : " + studentName);
		int total = 0;
		for (Subject s : subjectList) {			//����� ���� ����ŭ �ݺ�
			total += s.getSubjectScore();
			System.out.println(s.getSubjectName() + " : " + s.getSubjectScore());
		}
		System.out.println("���� : " + total);
	}

}