
public class Ex1123_1 {
	//사칙연산기

	int x;
	int y;
	int result;

	//생성자 (클래스명과 동일, 반환타입 없음, 나머지는 메서드 정의 방법과 동일)
	public Ex1123_1(int a, int b) {		//매개변수 있는 생성자
		x = a;
		y = b;
	}
	
	public int add() {
		result = x + y;
		return result;
	}
	
	public int substact() {
		result = x - y;
		return result;
	}
	
	public int procuct() {
		result = x * y;
		return result;
	}
	
	public int divide() {
		result = x / y;
		return result;
	}
	
	//메서드 (공개 반환타입 메서드명(매개변수))
	public int add(int a, int b) {
		x = a;
		y = b;
		result = x + y;
		return result;
	}

	public int subtract(int a, int b) {
		x = a;
		y = b;
		result = x - y;
		return result;
	}
	
	public int product(int a, int b) {
		x = a;
		y = b;
		result = x * y;
		return result;
	}
	
	public int divide(int a, int b) {
		x = a;
		y = b;
		result = x / y;
		return result;
	}
}