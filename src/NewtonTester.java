
/**
 * @author Thien Nguyen
 * @since May 30, 2020
 * This class calculate the square root of a number based on Newton's method.
 */

public class NewtonTester {
	private double number;
	private double error;
	private double guess;
	private int iterations;

	/**
	 * constructor for the NewtonTester class
	 * 
	 * @param n the number needed to be calculated
	 * @param e the maximum error allowed
	 * @param g the initial guess
	 */
	public NewtonTester(double n, double e, double g) {
		this.number = n;
		this.error = e;
		this.guess = g;
	}
	/**
	 * sqrt() takes in number and guess to calculate the square root of number
	 * based on the allowable error specified by user. 
	 * 
	 * Math.abs was used to ensure a positive error. The variable "iterations"
	 * also being incremented to keep track of the number of loops taken to reach answer.
	 * 
	 * @return the method return the solution by Newton's method
	 */

	public double sqrt() {
		double answer = Math.abs(guess);
		iterations = 0;
		while (Math.abs(Math.sqrt(number) - answer) > error) {
			answer = ((number / answer) + answer) / 2;
			iterations += 1;
		}
		return (answer);
	}
	
	/**
	 * nTries() simply return the number of iterations the program used to solve the problem.
	 * @return
	 */

	public int nTries() {
		return (iterations);
	}

}
