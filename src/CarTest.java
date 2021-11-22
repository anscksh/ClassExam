
public class CarTest {

	public static void main(String[] args) {

		//default
		Car c1 = new Car();
		//차명으로 생성
		Car c2 = new Car("Car-2");
		//차명 + 속도로 생성
		Car c3 = new Car("Car-3", 150);
		//수정될 차량
		Car c4 = new Car("테스트 차량", 1000);

		//default
		System.out.println("기본값의 차명은 " + c1.getName() + " / 속도는 " + c1.getSpeed());	
		System.out.println(c2.getName());
		//차명 읽기
		System.out.print("차명은 " + c3.getName());
		//속도 읽기
		System.out.println(" / 속도는 " + c3.getSpeed());
		//차명 변경
		c3.setName("바뀐이름");
		System.out.print("변경된 차명은 : " + c3.getName());
		//속도 변경
		c3.setSpeed(100);
		System.out.println(" / 변경된 속도는 : " + c3.getSpeed());
		System.out.println(c4.getName() + " / " + c4.getSpeed());
		//차명 + 속도 변경
		c4.setCar("둘다바꾸기", 500);
		System.out.println("차명, 속도 변경 : " + c4.getName() + " " + c4.getSpeed());
		//일정 속도 증가
		c4.speedUp(50);
		System.out.print("속도 증가 "+c4.getSpeed());
		//일정 속도 감소
		c4.speedDown(60);
		System.out.println(" / 속도 감소 " + c4.getSpeed());
	}
}