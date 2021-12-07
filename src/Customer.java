
public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	private void initCustomer() {	//같은 클래스에서 사용가능, 외부 접근 불가능
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스포인트는 " + bonusPoint;
	}

}