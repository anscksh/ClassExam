
public class Ex1130_3 {

	public static void main(String[] args) {

		Book bookAr1[] = new Book[3];
		Book bookAr2[] = new Book[3];
		
		bookAr1[0] = new Book("1��å", "1���۰�");
		bookAr1[1] = new Book("2��å", "2���۰�");
		bookAr1[2] = new Book("3��å", "3���۰�");
		
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i] = new Book();
		}
		
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].setBookName(bookAr1[i].getBookName());
			bookAr2[i].setAuthor(bookAr1[i].getAuthor());
		}
		
		System.out.println("========����========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		System.out.println("========�纻========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		bookAr2[2].setAll("�ڹ����α׷���", "ȫ�浿");
		
		System.out.println();
		System.out.println("========����========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		System.out.println("========�纻========");
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		bookAr1[1].setAll("�ڹ�", "���");
		
		System.out.println();
		System.out.println("========����========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		System.out.println("========�纻========");
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