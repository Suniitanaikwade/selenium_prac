package AbstractATM;

abstract public class ATM {
	
	abstract public void Desposite();
	abstract public void Withdrwal();
	abstract public void ContactInfo();
	
	public void balance() {
		System.out.println("this is balance from ATM class");
	}

}
	
