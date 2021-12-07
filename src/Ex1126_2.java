
public class Ex1126_2 {

	public static void main(String[] args) {

		//아스키코드 연속 출력 (배열 활용)
		char alpha[] = new char[100];
//		char ch = 'A';	//시작
//		
//		for (int i = 0; i < alpha.length; i++, ch++) {
//			alpha[i] = ch;
//			System.out.println(alpha[i] + ", " + (int)alpha[i]);
//		}
		
		char ch = '0';	//시작
		
		for (int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;
			System.out.println(alpha[i] + ", " + (int)alpha[i]);
		}

	}
}