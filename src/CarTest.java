
public class CarTest {

	public static void main(String[] args) {

		//default
		Car c1 = new Car();
		//�������� ����
		Car c2 = new Car("Car-2");
		//���� + �ӵ��� ����
		Car c3 = new Car("Car-3", 150);
		//������ ����
		Car c4 = new Car("�׽�Ʈ ����", 1000);

		//default
		System.out.println("�⺻���� ������ " + c1.getName() + " / �ӵ��� " + c1.getSpeed());	
		System.out.println(c2.getName());
		//���� �б�
		System.out.print("������ " + c3.getName());
		//�ӵ� �б�
		System.out.println(" / �ӵ��� " + c3.getSpeed());
		//���� ����
		c3.setName("�ٲ��̸�");
		System.out.print("����� ������ : " + c3.getName());
		//�ӵ� ����
		c3.setSpeed(100);
		System.out.println(" / ����� �ӵ��� : " + c3.getSpeed());
		System.out.println(c4.getName() + " / " + c4.getSpeed());
		//���� + �ӵ� ����
		c4.setCar("�Ѵٹٲٱ�", 500);
		System.out.println("����, �ӵ� ���� : " + c4.getName() + " " + c4.getSpeed());
		//���� �ӵ� ����
		c4.speedUp(50);
		System.out.print("�ӵ� ���� "+c4.getSpeed());
		//���� �ӵ� ����
		c4.speedDown(60);
		System.out.println(" / �ӵ� ���� " + c4.getSpeed());
	}
}