
public class Score {

	//멤버변수
	String name;
	int kor;
	int eng;
	int math;
	
	//생성자
	public Score () {
		name = "홍길동";
		kor = 70;
		eng = 70;
		math = 70;
	}
	public Score (String sName, int sKor, int sEng, int sMath) {
		name = sName;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}
	
	//set
	public void setName(String sName) {
		name = sName;
	}
	public void setKor(int sKor) {
		kor = sKor;
	}
	public void setEng(int sEng) {
		eng = sEng;
	}
	public void setMath(int sMath) {
		math = sMath;
	}
	public void setAll(String sName, int sKor, int sEng, int sMath) {
		name = sName;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}
	//get
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	//메서드
	public int getSum() {
		return kor + eng + math;
	}
	public double getAver() {
		return getSum() / 3.0;
	}

}