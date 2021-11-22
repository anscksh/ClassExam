
public class PersonTest {

	public static void main(String[] args) {

		//Person Class Test
		//오버로딩된 생성자가 있을 경우, 디폴트 생성자도 구현해야함(내용은 없어도 됨)

		Person hu1 = new Person();			//디폴트 생성자
		Person hu2 = new Person("hu2");		//매개변수 1개 생성자
		Person hu3 = new Person("hu3", 170, 65);

		System.out.println(hu2.getName());
		System.out.println(hu3.getName() + "\t" + hu3.getHeight() + "\t" + hu3.getWeight());
		hu3.setPerson("hu4", 175, 70);
		System.out.println(hu3.getName() + "\t" + hu3.getHeight() + "\t" + hu3.getWeight());
		hu1.setPerson("hu1", 160, 60);
		System.out.println(hu1.getName() + "\t" + hu1.getHeight() + "\t" + hu1.getWeight());
	}
}