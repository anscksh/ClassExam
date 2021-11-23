
public class AnimalTest {

	public static void main(String[] args) {

		//default
		Animal a1 = new Animal();
		System.out.println(a1.getName() + ", " + a1.getWeight() + "kg, " + a1.getSpeed() + "km/h");
		a1.speedUp();
		System.out.println(a1.getName() + ", " + a1.getWeight() + "kg, " + a1.getSpeed() + "km/h");
		a1.speedUp(110);
		System.out.println(a1.getName() + ", " + a1.getWeight() + "kg, " + a1.getSpeed() + "km/h");
		a1.speedDown();
		System.out.println(a1.getName() + ", " + a1.getWeight() + "kg, " + a1.getSpeed() + "km/h");
		a1.speedDown(110);
		System.out.println(a1.getName() + ", " + a1.getWeight() + "kg, " + a1.getSpeed() + "km/h");
		a1.setName("ÄÚ³¢¸®");
		a1.setWeight(60);
		a1.setSpeed(50);
		System.out.println(a1.getName() + ", " + a1.getWeight() + "kg, " + a1.getSpeed() + "km/h");
		
		Animal a2 = new Animal("»çÀÚ");
		System.out.println(a2.getName() + ", " + a2.getWeight() + "kg, " + a2.getSpeed() + "km/h");
		
		Animal a3 = new Animal("È£¶ûÀÌ", 50);
		System.out.println(a3.getName() + ", " + a3.getWeight() + "kg, " + a3.getSpeed() + "km/h");
		
		Animal a4 = new Animal();
		a4.setAll("±â¸°", 80, 60);
		System.out.println(a4.getName() + ", " + a4.getWeight() + "kg, " + a4.getSpeed() + "km/h");

	}
}