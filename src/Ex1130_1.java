
public class Ex1130_1 {

	public static void main(String[] args) {

		/*
		int array1[] = {10, 20, 30, 40, 50};
		int array2[] = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		System.arraycopy(array1, 0, array2, 1, 4);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		array1[2] = 300;
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		*/
		
		//-----------------------------------------
		
		Book bookAr1[] = new Book[3];
		Book bookAr2[] = new Book[3];
		
		bookAr1[0] = new Book("�¹���", "������");
		bookAr1[1] = new Book("���̾�", "�츣�� �켼");
		bookAr1[2] = new Book("��� �� ���ΰ�", "���ù�");
		
		System.out.println("========����========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		
		System.out.println();
		System.out.println("========�纻========");
		System.arraycopy(bookAr1, 0, bookAr2, 0, 3);
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		bookAr1[0].setBookName("����");
		bookAr1[0].setAuthor("�ڿϼ�");
		System.out.println();
		System.out.println("========����========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		
		System.out.println();
		System.out.println("========�纻========");
		System.arraycopy(bookAr1, 0, bookAr2, 0, 3);
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}

	}
}