
public class BookTest {

	public static void main(String[] args) {

		Book library[] = new Book[5];
		
		library[0] = new Book("å�̸�", "����");
		library[1] = new Book("�¹���", "������");
		library[2] = new Book("���̾�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "���丮");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showInfo();
			System.out.println(library[i]);
		}
		
		library[2].setAuthor("�켼");
		library[2].showInfo();

	}
}