import java.util.*;
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList Ȱ��
		ArrayList<Book> library = new ArrayList<Book>();
		
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �� �� �ΰ�", "���ù�"));
		
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		
		for (Book book : library) {
			book.showInfo();
		}

	}
}