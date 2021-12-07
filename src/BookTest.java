
public class BookTest {

	public static void main(String[] args) {

		Book library[] = new Book[5];
		
		library[0] = new Book("책이름", "저자");
		library[1] = new Book("태백산맥", "조정래");
		library[2] = new Book("데미안", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "쥐페리");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showInfo();
			System.out.println(library[i]);
		}
		
		library[2].setAuthor("헤세");
		library[2].showInfo();

	}
}