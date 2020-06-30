
/**
 * @author Thien Nguyen
 * @since May 30, 2020
 * 
 * Class NewtonApp:
 * This class represents the user-interface for the input and output for the NewtonTester App
 * The class will prompts the user for necessary information and output appropriate values.
 *
 */
public class NewtonApp {
	private KeyboardReader reader;
	private NewtonTester newton;
	/**
	 * Constructor method for the NewtonApp. This constructor initializes a KeyboardReader object
	 * for user input and output
	 */
	public NewtonApp(){
		reader = new KeyboardReader();
	}
	/**
	 * This method performs the majority work for this app. It is responsible for prompting user for input, call NewtonTester for calculations
	 * and display the result.
	 */
	public void run() {
		// number stores the that need to be square root
		double number;
		// error determine the difference between Math.sqrt() and Newton's method
		double error;
		// guess stores the initial value used for Newton's method 
		double guess;

		reader.prompt("Please enter the number: ");
		number = reader.getKeyboardDouble();
		if (number < 0) {
			reader.display("Please enter a positive number. The program will now terminate");
			System.exit(0);
		}
		reader.prompt("Please enter the maximum error to the power of 10\n Example: enter -5 for the error of 10E-5: ");
		error = Math.pow(10,reader.getKeyboardDouble());
		reader.prompt("Please enter the initial guess: ");
		guess = reader.getKeyboardDouble();
		
		newton = new NewtonTester(number,error,guess);
		reader.display("The square root of "
						+number
						+" is "
						+newton.sqrt()
						+" after "
						+newton.nTries()
						+" iterations");
	}

	public static void main(String[] args) {
		NewtonApp app = new NewtonApp();
		app.run();

	}

}
