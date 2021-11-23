
public class ScoreTest {

	public static void main(String[] args) {

		Score s1 = new Score();
		System.out.println(
			"이름:" + s1.getName() + ", 국어:" + s1.getKor() + ", 영어:" + s1.getEng()
			+ ", 수학:" + s1.getMath() + ", 총점:" + s1.getSum() + ", 평균:" + s1.getAver()
		);

		s1.setName("아무개");
		s1.setKor(90);
		s1.setEng(80);
		s1.setMath(60);
		s1.getSum();
		s1.getAver();
		System.out.println(
			"이름:" + s1.getName() + ", 국어:" + s1.getKor() + ", 영어:" + s1.getEng()
			+ ", 수학:" + s1.getMath() + ", 총점:" + s1.getSum() + ", 평균:" + s1.getAver()
		);

		Score s2 = new Score("성이름", 30, 40, 25);
		s2.getSum();
		s2.getAver();
		System.out.println(
			"이름:" + s2.getName() + ", 국어:" + s2.getKor() + ", 영어:" + s2.getEng()
			+ ", 수학:" + s2.getMath() + ", 총점:" + s2.getSum() + ", 평균:" + s2.getAver()
		);

	}
}