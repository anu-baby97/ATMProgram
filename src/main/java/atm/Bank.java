package atm;

public class Bank extends User {
	private int pin;
	
	public void setPIN() {
		
		this.pin=super.getPINFromUser();
		validatePIN();
	}
	
	public void validatePIN() {
		
		if(pin==1001||pin==1234||pin==1212) {
			System.out.println("Valid PIN");
		}
		else {
			System.out.println("Invalid PIN");
		}
	}
	
	
}
