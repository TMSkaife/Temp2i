import java.util.Scanner;
import java.util.ArrayList;


/**
 * The Iterator class takes two positive integers, A and X, as arguments from the command line, then iterates in multiples of A until X,
 *  then A+1 until 2X, then A+2 until 3X. This is then formatted into an ArrayList, and printed to the command line. A full statement 
 *  of the assumptions I have made can be found in the README.
 * 
 *  @author <tommskaife@gmail.com> Thomas Matthew Skaife.
 *  @package default
 *  
 */
public class Iterator {


	/**
	 * This method takes two integers, aVal and xVal, as arguments then iterates in multiples of aVal until xVal,then aVal+1 until 2xVal,
	 * then aVal+2 until 3xVal. It then returns the numbers iterated through in the form of an ArrayList.
	 * 
	 * @param Integer aVal - The integer value that we will initially be iterating by. 
	 * @param Integer xVal - The initial goal value for our iterating number to reach.
	 * @return An ArrayList containing the numbers that are iterated through.
	 */
	public ArrayList<Integer> iterate(int aVal, int xVal) {
		
		int counter = 0;		/* An Integer that keeps track of the current value we have reached */
		int goal = 0;		/* An Integer that keeps track of the current goal we are aiming for */
		
		ArrayList<Integer> list = new ArrayList<Integer>(); /* Initialising a new ArrayList object */ 
		
		for(int i = 0; i<3;i++) {
			goal += xVal; 		/* Increases the goal by the value of xVal once for every loop, up to 3xVal */
			while(counter < goal) { 						
				counter += (aVal + i);
				/* While the counter value is less than the current goal, Iterate the value of the currently counted number
				   by the aVal, and by an additional value depending on the current loop */
				
				list.add(counter);		/* Add each iterated value to the ArrayList */
			}
		}	
		return list;		/*return the completed ArrayList */
	}
	
/**
 * The main method. Takes acceptable arguments from the command line, then uses the iterate method to return the corresponding ArrayList.
 *
 * @param args - The command line arguments.
 */
		public static void main(String[] args) {
			
			int a = 0;		/* Initialising the A integer */
			int x = 0;		/* Initialising the X integer */

			Scanner myScanner = new Scanner(System.in);		/*  Creating a Scanner object that can be used to parse input from the user. */

			boolean validInput = false;		/* Initialising a Boolean value that will be used to verify valid input and setting it to false. */
			
			// A do while loop that asks the user to enter an integer value. User input will only be deemed valid if it is an integer above the value of 0.
			// if the user enters an invalid input, the code will loop until the user enters a valid input.
			do {
				System.out.println("Please enter a positive Integer value for A:");
				if(myScanner.hasNextInt()) { 		/* Returns true if the next input is interpreted as an Integer. */
					a = myScanner.nextInt();		/* Set the a value to the user input. */
					
					if (a > 0) { validInput = true;			/* Checks the integer entered is above the value of 0  */
					} else { System.out.println("That didn't work, try entering a whole number with a value of 1 or above.");}
					
				} else {
					System.out.println("That didn't work, try entering a whole number with a value of 1 or above.");
					myScanner.next();
				}
			} while (validInput ==false);
			
			validInput = false;		/* Reset the boolean to false so we can use it again for the x value. */
			
			// A do while loop that asks the user to enter an integer value. User input will only be deemed valid if it is an integer above the value of 0.
			// if the user enters an invalid input, the code will loop until the user enters a valid input.
			do {
				System.out.println("Please enter a positive Integer value for X:");
				if(myScanner.hasNextInt()) {		/* Returns true if the next input is interpreted as an Integer. */
					x = myScanner.nextInt();		/* Set the x value to the user input. */
					
					if (x > 0) { validInput = true;			/* Checks the integer entered is above the value of 0  */
					} else { System.out.println("That didn't work, try entering a whole number with a value of 1 or above.");}
					
				} else {
					System.out.println("That didn't work, try entering a whole number with a value of 1 or above.");
					myScanner.next();
				}
			} while (validInput ==false);
		
			Iterator m = new Iterator();		/* Initialise an arbitrary class object so we can use the iterate method from a static context. */
			
			System.out.println(m.iterate(a,x).toString());		/* Take the output of the iterate method with a and x as arguments,
			 														and print that as a String to the command line */
			myScanner.close();		
		}
}
