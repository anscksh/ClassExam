
public class ScoreTest {

	public static void main(String[] args) {

		Score s1 = new Score();
		System.out.println(
			"�̸�:" + s1.getName() + ", ����:" + s1.getKor() + ", ����:" + s1.getEng()
			+ ", ����:" + s1.getMath() + ", ����:" + s1.getSum() + ", ���:" + s1.getAver()
		);

		s1.setName("�ƹ���");
		s1.setKor(90);
		s1.setEng(80);
		s1.setMath(60);
		s1.getSum();
		s1.getAver();
		System.out.println(
			"�̸�:" + s1.getName() + ", ����:" + s1.getKor() + ", ����:" + s1.getEng()
			+ ", ����:" + s1.getMath() + ", ����:" + s1.getSum() + ", ���:" + s1.getAver()
		);

		Score s2 = new Score("���̸�", 30, 40, 25);
		s2.getSum();
		s2.getAver();
		System.out.println(
			"�̸�:" + s2.getName() + ", ����:" + s2.getKor() + ", ����:" + s2.getEng()
			+ ", ����:" + s2.getMath() + ", ����:" + s2.getSum() + ", ���:" + s2.getAver()
		);

	}
}