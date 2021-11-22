
public class Car {
	String name;
	int speed;

	//인수 없이 생성 (기본값 세팅)
	public Car() {
		name = "자동차";
		speed = 0;
	}

	//차명으로 생성
	public Car(String cName) {
		name = cName;
	}

	//차명, 속도로 생성
	public Car(String cName, int cSpeed) {
		name = cName;
		speed = cSpeed;
	}

	//차명 불러오기
	public String getName() {
		return name;
	}

	//속도 불러오기
	public int getSpeed() {
		return speed;
	}

	//차명 변경
	public void setName(String cName) {
		name = cName;
	}

	//속도 변경
	public void setSpeed(int cSpeed) {
		speed = cSpeed;
	}

	//차명, 속도 변경
	public void setCar(String cName, int cSpeed) {
		name = cName;
		speed = cSpeed;
	}

	//속도 증가
	public void speedUp(int cSpeedUp) {
		speed += cSpeedUp;
	}
	
	//속도 감소
	public void speedDown(int cSpeedDown) {
		speed -= cSpeedDown;
	}

}