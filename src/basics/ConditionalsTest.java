package basics;

/**
 * To format your code Ctrl + Shift + f Sep 17, 2026 cepv
 */
public class ConditionalsTest {

	public static void main(String[] args) {

		// step 1: create variables to store information
		float temperature = 20;
		// step 2: model the scenario of different cases using conditionals
		if (temperature >= 100) {
			System.out.println("No, we are going to be cooked!!!!!");
		} else {
			System.out.println("I am going to have a nice afternoon!!!");
		}
		// use if, else if, else to model a scenario in which
		// the cases are exclusive among them
		temperature = 70;
		if (temperature >= 100) {
			System.out.println("No, we are going to be cooked!!!!!");
		} else if (temperature < 100 && temperature > 60) {
			System.out.println("The temperature is too high, I am going to eat all the ice creams!");
		} else {
			System.out.println("I am going to have a nice afternoon!!!");
		}
		
		// robotaxi
		boolean isAdvancing = true;

		if (isAdvancing) {

		}
	}

}
