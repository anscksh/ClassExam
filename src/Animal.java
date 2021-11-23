
public class Animal {

	//멤버변수
	String name;
	int weight;
	int speed;

	//생성자
	public Animal() {
		name = "동물";
		weight = 30;
		speed = 0;
	}
	public Animal(String aName) {
		name = aName;
		weight = 30;
		speed = 0;
	}
	public Animal(String aName, int aWeight) {
		name = aName;
		weight = aWeight;
		speed = 0;
	}
	
	//set
	public void setName(String aName) {
		name = aName;
	}
	public void setWeight(int aWeight) {
		weight = aWeight;
	}
	public void setSpeed(int aSpeed) {
		speed = aSpeed;
	}
	public void setAll(String aName, int aWeight, int aSpeed) {
		name = aName;
		weight = aWeight;
		speed = aSpeed;
	}
	//get
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public int getSpeed() {
		return speed;
	}
	
	//메서드
	public void speedUp() {
		if (speed+10 > 100) {
			speed = 100;
		} else speed += 10;
	}
	public void speedUp(int aSpeed) {
		if (speed+aSpeed > 100) {
			speed = 100;
		} else speed += aSpeed;
	}
	public void speedDown() {
		if (speed-10 < 0) {
			speed = 0;
		} else speed -= 10;
	}
	public void speedDown(int aSpeed) {
		if (speed-aSpeed < 0) {
			speed = 0;
		} else speed -= aSpeed;
	}

}