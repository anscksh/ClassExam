
public class Ex1123_2 {

	public static void main(String[] args) {

		//인스턴스 생성
		//클래스명 변수명 = new 생성자
		/*
		Ex1123_1 cal1 = new Ex1123_1();		//default 생성자로 인스턴스 생성
		System.out.print(cal1.x);
		System.out.print(cal1.y);
		System.out.println(cal1.result);
		
		//1안
		System.out.print(cal1.add(8, 5));	//2안 int test = cal1.add(1, 2);
											//System.out.println(test);
		System.out.print(cal1.subtract(8, 5));
		System.out.print(cal1.product(8, 5));
		System.out.println(cal1.divide(8, 5));
		
		System.out.print(cal1.x);
		System.out.print(cal1.y);
		System.out.print(cal1.result);
		
		Ex1123_1 cal2 = new Ex1123_1(10, 7);
		System.out.println(cal2.add());
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.divide());
		System.out.println(cal2.add(1, 2));
		
		Ex1123_1 cal3 = new Ex1123_1(10, 5);
		System.out.println(cal3.getX() + " + " + cal3.getY() + " = " + cal3.add());
		cal3.setX(2);
		cal3.setY(3);
		System.out.println(cal3.getX() + " x " + cal3.getY() + " = " + cal3.product());
		*/
		
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setAll(9, 10);
		System.out.println(cal4.getX() + " x " + cal4.getY() + " = " + cal4.product());
	}
}