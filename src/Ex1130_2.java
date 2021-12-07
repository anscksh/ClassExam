
public class Ex1130_2 {

	public static void main(String[] args) {

		Book bookAr1[] = new Book[3];
		Book bookAr2[] = new Book[3];

		bookAr1[0] = new Book("태백산맥", "조정래");
		bookAr1[1] = new Book("데미안", "헤르만 헤세");
		bookAr1[2] = new Book("어떻게 살 것인가", "유시민");

		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i] = new Book();
		}

		for (int i = 0; i < bookAr1.length; i++) {
			bookAr2[i].setBookName(bookAr1[i].getBookName());
			bookAr2[i].setAuthor(bookAr1[i].getAuthor());
		}

		bookAr1[0].setBookName("나목");
		bookAr1[0].setAuthor("박완서");

		System.out.println("========원본========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}

		System.out.println();
		System.out.println("========사본========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}

	}
}