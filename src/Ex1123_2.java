
public class Ex1123_2 {

	public static void main(String[] args) {

		//�ν��Ͻ� ����
		//Ŭ������ ������ = new ������
		Ex1123_1 cal1 = new Ex1123_1();		//default �����ڷ� �ν��Ͻ� ����
		System.out.print(cal1.x);
		System.out.print(cal1.y);
		System.out.println(cal1.result);
		System.out.print(cal1.add(8, 5));
		
		/* 2��
		 * int test = cal1.add(1, 2); 
		 * System.out.println(test);
		 */
		
		System.out.print(cal1.subtract(8, 5));
		System.out.print(cal1.product(8, 5));
		System.out.println(cal1.divide(8, 5));
		
		System.out.print(cal1.x);
		System.out.print(cal1.y);
		System.out.print(cal1.result);
	}
}