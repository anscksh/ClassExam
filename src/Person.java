
public class Person {

	String name;
	float height;
	float weight;
	
	//생성자가 하나도 없을 경우 디폴트 생성자가 존재함

	//생성자 작성 규칙 : 클래스명과 동일 / 반환타입(문법)이 없음
	//명시적으로 디폴트 생성자 필요
	public Person() {
		
	}

	//오버로딩된 생성자
	public Person(String pName) {	//생성자 이름 동일 / 매개변수 다름(개수, 타입, 순서 등)
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