
public class PersonTest {

	public static void main(String[] args) {

		//Person Class Test
		//�����ε��� �����ڰ� ���� ���, ����Ʈ �����ڵ� �����ؾ���(������ ��� ��)

		Person hu1 = new Person();			//����Ʈ ������
		Person hu2 = new Person("hu2");		//�Ű����� 1�� ������
		Person hu3 = new Person("hu3", 170, 65);

		System.out.println(hu2.getName());
		System.out.println(hu3.getName() + "\t" + hu3.getHeight() + "\t" + hu3.getWeight());
		hu3.setPerson("hu4", 175, 70);
		System.out.println(hu3.getName() + "\t" + hu3.getHeight() + "\t" + hu3.getWeight());
		hu1.setPerson("hu1", 160, 60);
		System.out.println(hu1.getName() + "\t" + hu1.getHeight() + "\t" + hu1.getWeight());
	}
}