
public class Ex1130_2 {

	public static void main(String[] args) {

		Book bookAr1[] = new Book[3];
		Book bookAr2[] = new Book[3];

		bookAr1[0] = new Book("�¹���", "������");
		bookAr1[1] = new Book("���̾�", "�츣�� �켼");
		bookAr1[2] = new Book("��� �� ���ΰ�", "���ù�");

		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i] = new Book();
		}

		for (int i = 0; i < bookAr1.length; i++) {
			bookAr2[i].setBookName(bookAr1[i].getBookName());
			bookAr2[i].setAuthor(bookAr1[i].getAuthor());
		}

		bookAr1[0].setBookName("����");
		bookAr1[0].setAuthor("�ڿϼ�");

		System.out.println("========����========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}

		System.out.println();
		System.out.println("========�纻========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}

	}
}