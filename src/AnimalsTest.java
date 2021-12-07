class Animals {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
class Human extends Animals {
	public void move() {
		System.out.println("����� �Ƚ��ϴ�.");
	}
}
class Tiger extends Animals {
	public void move() {
		System.out.println("ȣ���̴� �ݴϴ�.");
	}
}
class Eagle extends Animals {
	public void move() {
		System.out.println("�������� ���ϴ�.");
	}
}

public class AnimalsTest {
	public static void main (String args[]) {
		Animals[] aniArr = new Animals[10];
		for (int i = 0; i < 3; i++) {
			aniArr[i] = new Human();
		}
		for (int i = 3; i < 5; i++) {
			aniArr[i] = new Tiger();
		}
		for (int i = 5; i < 10; i++) {
			aniArr[i] = new Eagle();
		}

		for (int i = 0; i < aniArr.length; i++) {
			aniArr[i].move();
		}

//		==����
//		AnimalsTest aTest = new AnimalsTest();
//		aTest.moveAnimals(new Human());
//		aTest.moveAnimals(new Tiger());
//		aTest.moveAnimals(new Eagle());
	}
	
	public void moveAnimals(Animals animals) {
		animals.move();		//������, ������ �ٸ� ���� ����
	}
}