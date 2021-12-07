
public class Ex1130_3 {

	public static void main(String[] args) {

		Book bookAr1[] = new Book[3];
		Book bookAr2[] = new Book[3];
		
		bookAr1[0] = new Book("1번책", "1번작가");
		bookAr1[1] = new Book("2번책", "2번작가");
		bookAr1[2] = new Book("3번책", "3번작가");
		
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i] = new Book();
		}
		
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].setBookName(bookAr1[i].getBookName());
			bookAr2[i].setAuthor(bookAr1[i].getAuthor());
		}
		
		System.out.println("========원본========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		System.out.println("========사본========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		bookAr2[2].setAll("자바프로그래밍", "홍길동");
		
		System.out.println();
		System.out.println("========원본========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		System.out.println("========사본========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		bookAr1[1].setAll("자바", "김삿갓");
		
		System.out.println();
		System.out.println("========원본========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		System.out.println("========사본========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		System.out.println();
		String stAr[] = {"Html", "CSS", "JavaScript", "C", "Java"};
		for (String lang : stAr) {
			System.out.print(lang + " ");
		}
		
		System.out.println();
		for (int i = 0; i < stAr.length; i++) {
			System.out.print(stAr[i] + " ");
		}

	}
}