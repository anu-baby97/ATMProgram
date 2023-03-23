package atm;

import java.util.Scanner;

public class User {

	public int getPINFromUser() {
		Scanner scanObj = new Scanner(System.in);
		int pin = scanObj.nextInt();
		return pin;
	}

}
