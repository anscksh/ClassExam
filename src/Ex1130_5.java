import java.util.*;
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList 활용
		ArrayList<Book> library = new ArrayList<Book>();
		
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것 인가", "유시민"));
		
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		
		for (Book book : library) {
			book.showInfo();
		}

	}
}