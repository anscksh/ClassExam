
public class Student {

	//멤버변수
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//생성자
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	//오버로딩된 생성자
	//메서드
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
	//오버로딩된 메서드
	//진입점(main) (클래스의 영역이 아님(static이 붙는 경우))
	public static void main(String[] args) { //진입점(enter point) : 운영체제에서 프로그램 호출 
		//클래스명 변수명 = new 생성자 ()
		Student st1 = new Student(); //객체 생성
		st1.setStudentName("홍길동");
		Student st2 = new Student();
		st2.setStudentName("아무개");
		
		System.out.println(st1.studentName);		//멤버변수 직접 출력 (사용 x)
		System.out.println(st1.getStudentName());	//메서드를 활용해서 출력
		System.out.println(Student.getSerialNum());
		System.out.println(st1.studentID);
		System.out.println(Student.getSerialNum());
		System.out.println(st2.studentID);
	}

}