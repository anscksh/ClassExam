
public class Ex1123_1 {
	//��Ģ�����

	int x;
	int y;
	int result;

	//������ (Ŭ������� ����, ��ȯŸ�� ����, �������� �޼��� ���� ����� ����)
	public Ex1123_1() {					//default
		
	}
	//�����ε��� ������
	public Ex1123_1(int a, int b) {		//�Ű����� �ִ� ������
		x = a;
		y = b;
	}
	
	//set (���� ���� ������ ����ǹǷ� return�� �ʿ����)
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void setAll(int a, int b) {
		x = a;
		y = b;
	}
	//get (��ȯŸ�� + ����̸� )
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//�޼��� (���� ��ȯŸ�� �޼����(�Ű�����))
	public int add() {
		result = x + y;
		return result;
	}
	public int substact() {
		result = x - y;
		return result;
	}
	public int product() {
		result = x * y;
		return result;
	}
	public int divide() {
		result = x / y;
		return result;
	}
	
	//�����ε��� �޼���
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