
public class Car {
	String name;
	int speed;

	//�μ� ���� ���� (�⺻�� ����)
	public Car() {
		name = "�ڵ���";
		speed = 0;
	}

	//�������� ����
	public Car(String cName) {
		name = cName;
	}

	//����, �ӵ��� ����
	public Car(String cName, int cSpeed) {
		name = cName;
		speed = cSpeed;
	}

	//���� �ҷ�����
	public String getName() {
		return name;
	}

	//�ӵ� �ҷ�����
	public int getSpeed() {
		return speed;
	}

	//���� ����
	public void setName(String cName) {
		name = cName;
	}

	//�ӵ� ����
	public void setSpeed(int cSpeed) {
		speed = cSpeed;
	}

	//����, �ӵ� ����
	public void setCar(String cName, int cSpeed) {
		name = cName;
		speed = cSpeed;
	}

	//�ӵ� ����
	public void speedUp(int cSpeedUp) {
		speed += cSpeedUp;
	}
	
	//�ӵ� ����
	public void speedDown(int cSpeedDown) {
		speed -= cSpeedDown;
	}

}