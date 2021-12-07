class Animals {
	public void move() {
		System.out.println("동물은 움직입니다.");
	}
}
class Human extends Animals {
	public void move() {
		System.out.println("사람은 걷습니다.");
	}
}
class Tiger extends Animals {
	public void move() {
		System.out.println("호랑이는 뜁니다.");
	}
}
class Eagle extends Animals {
	public void move() {
		System.out.println("독수리는 납니다.");
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

//		==동일
//		AnimalsTest aTest = new AnimalsTest();
//		aTest.moveAnimals(new Human());
//		aTest.moveAnimals(new Tiger());
//		aTest.moveAnimals(new Eagle());
	}
	
	public void moveAnimals(Animals animals) {
		animals.move();		//다형성, 실제로 다른 일을 실행
	}
}