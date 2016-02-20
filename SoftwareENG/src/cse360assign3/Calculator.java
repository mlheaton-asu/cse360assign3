/**
 * Description: The purpose of this class is to act as a basic calculator.
 * Name: Michael Heaton
 * PIN: 404
 * */

package cse360assign3;

public class Calculator {

	private int total;
	
	/**
	 * This is the default constructor for the class Calculator.
	 * @param none*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * The purpose of this method is to return the total value resulting 
	 * from calculations.*/
	public int getTotal () {
		return total;
	}
	
	/**
	 * The purpose of this method is to add a value to the instance
	 * variable total.
	 * @param int value the number to be added to total.*/
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * The purpose of this method is to subtract a value.
	 * @param int value the value to be subtracted from total.*/
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * The purpose of this method is to multiply a value.
	 * @param int value the number that total is to be multiplied by.*/
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * The purpose of this method is to divide a value.*/
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * The purpose of this method is to put the calculator history into 
	 * string form.*/
	public String getHistory () {
		return "";
	}
}