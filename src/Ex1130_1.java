
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
		
		bookAr1[0] = new Book("태백산맥", "조정래");
		bookAr1[1] = new Book("데미안", "헤르만 헤세");
		bookAr1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.out.println("========원본========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		
		System.out.println();
		System.out.println("========사본========");
		System.arraycopy(bookAr1, 0, bookAr2, 0, 3);
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}
		
		bookAr1[0].setBookName("나목");
		bookAr1[0].setAuthor("박완서");
		System.out.println();
		System.out.println("========원본========");
		for (int i = 0; i < bookAr1.length; i++) {
			bookAr1[i].showInfo();
		}
		
		System.out.println();
		System.out.println("========사본========");
		System.arraycopy(bookAr1, 0, bookAr2, 0, 3);
		for (int i = 0; i < bookAr2.length; i++) {
			bookAr2[i].showInfo();
		}

	}
}