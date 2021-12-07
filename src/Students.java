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
	//과목명과 점수를 추가하는 메서드 (학생마다 각각 처리)
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		subjectList.add(subject);
	}
	//출력 메서드
	public void showStudentInfo() {
		System.out.println("========================================");
		System.out.println("학번 : " + studentID + ", 이름 : " + studentName);
		int total = 0;
		for (Subject s : subjectList) {			//저장된 원소 수만큼 반복
			total += s.getSubjectScore();
			System.out.println(s.getSubjectName() + " : " + s.getSubjectScore());
		}
		System.out.println("총점 : " + total);
	}

}