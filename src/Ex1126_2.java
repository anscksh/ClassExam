
public class Ex1126_2 {

	public static void main(String[] args) {

		//�ƽ�Ű�ڵ� ���� ��� (�迭 Ȱ��)
		char alpha[] = new char[100];
//		char ch = 'A';	//����
//		
//		for (int i = 0; i < alpha.length; i++, ch++) {
//			alpha[i] = ch;
//			System.out.println(alpha[i] + ", " + (int)alpha[i]);
//		}
		
		char ch = '0';	//����
		
		for (int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;
			System.out.println(alpha[i] + ", " + (int)alpha[i]);
		}

	}
}