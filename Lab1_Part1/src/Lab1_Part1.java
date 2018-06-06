import java.util.Scanner;

/**
* <h1>Individual Total Sum</h1>
* Takes numbers from both inputs sees if the corresponding digits
* sum to the same total. Outputs true or false.
* EX) 1a + 2a = 1b + 2b = 1c + 2c ...
* 
** @author  Alex Wood
* @version 1.0
* @since   6/5/2018
*/
public class Lab1_Part1 {

	public static void main(String[] args) {
		String userNum1 = "";		// stores the first input number
		String userNum2 = "";		// stores the second input number
		
		Scanner scan = new Scanner(System.in);			
		
		//Ask for two numbers, stored as String
		System.out.println("Please enter two numbers, with the same number of digits.");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Please input the first number.");
		userNum1 = scan.nextLine();
		
		System.out.println("Please input the second number.");
		userNum2 = scan.nextLine();
		
		
		//calls the task portion of the method
		IntComparison(userNum1, userNum2);
	}
			
	public static void IntComparison(String a, String b) {
		String userVal1 = a;   		 // first user input value
		String userVal2 = b; 		 // second user input value
		int i = 0;                   // counter for the while loop
		boolean resultTotal = false; // boolean for combined digital totals 
		int[] digitTotal; 			 // array to hold all of the combined values
		
		// checks to see inputed values are the same length
		if (userVal1.length() == userVal2.length()) {
			digitTotal = new int[userVal1.length()]; 
			
			// stores the sum of userVal1[n] + userVal2[n] in an array[]
			while (i < userVal1.length()) {
				digitTotal[i] = Character.getNumericValue(userVal1.charAt(i)) + Character.getNumericValue(userVal2.charAt(i));
				i++;
			}
			
			for (int j = 0; j < digitTotal.length - 1; j++) {
			    for (int k = 0; k < digitTotal.length - 1; k++) {
			        if (digitTotal[j] == digitTotal[k + 1]) {
			            resultTotal = true;
			        }
			        else {
			        	resultTotal = false;
			        }
			    }
			}
			System.out.println(resultTotal);
		}
		else {
			System.out.println("The two numbers you entered do not contain the same number of digits.");
		}
	}
}
