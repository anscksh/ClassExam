
public class Ex1123_1 {
	//��Ģ�����

	int x;
	int y;
	int result;

	//������ (Ŭ������� ����, ��ȯŸ�� ����, �������� �޼��� ���� ����� ����)
	public Ex1123_1(int a, int b) {		//�Ű����� �ִ� ������
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
	
	//�޼��� (���� ��ȯŸ�� �޼����(�Ű�����))
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