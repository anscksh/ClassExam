
public class Person {

	String name;
	float height;
	float weight;
	
	//�����ڰ� �ϳ��� ���� ��� ����Ʈ �����ڰ� ������

	//������ �ۼ� ��Ģ : Ŭ������� ���� / ��ȯŸ��(����)�� ����
	//��������� ����Ʈ ������ �ʿ�
	public Person() {
		
	}

	//�����ε��� ������
	public Person(String pName) {	//������ �̸� ���� / �Ű����� �ٸ�(����, Ÿ��, ���� ��)
		name = pName;
	}
	
	public Person(String pName, float pHeight, float pWeight ) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	
	//Method GetInfo
	public String getName() {
		return name;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	
	//Method SetInfo
	public void setPerson (String pName, float pHeight, float pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}

}