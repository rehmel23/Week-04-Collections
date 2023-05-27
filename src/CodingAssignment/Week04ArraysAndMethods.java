package CodingAssignment;

/**
 * Week04 Coding Assignment - Back End Development - Promineo Tech
 * 
 * @author clayr
 *
 */
import java.util.*;

public class Week04ArraysAndMethods {

	public static void main(String[] args) {
		System.out.println("Part 1:");
		// instantiate an int array "ages" with added age "5" at the end.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 5 };

		// Print first age in array subtracted from last age to the console. Outputs 2.
		System.out.println("First age subtracted from last age = " + (ages[ages.length - 1] - ages[0]));

		// sum variable for enhanced for loop to add ages to.
		int sum = 0;

		// Enhanced for loop that adds each age to variable "sum" and stores the new
		// total in "sum".
		for (int age : ages) {
			sum += age;
		}

		// Calculates the average age and prints it to the console.
		System.out.println("The average age is " + (sum / ages.length));

		System.out.println("\nPart 2:");
		// instantiate a String array "names"
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// totalStringLength for storing the length of each element in "names".
		int totalStringLength = 0;

		// Enhanced for loop that iterates over each String ("name") in "names" and
		// combines the length of each word to the totalStringLength variable
		for (String name : names) {
			totalStringLength += name.length();
		}

		// Calculate and print the average name length to the console.
		System.out.println("Average Name Length = " + (totalStringLength / names.length));

		// concat variable to add "names" elements to.
		String concat = "";

		// Enhanced for loop iterates over each element in "names" and adds them to
		// concat with a space at the end.
		for (String name : names) {
			concat = concat + name + " ";
		}
		// Print concatenated names to the console.
		System.out.println(concat);

		System.out.println("\nPart 3:");
		System.out.println("Access the last element of an array with 'arrayName.length - 1'.");

		System.out.println("\nPart 4:");
		System.out.println("Access the first element of an array with 'arrayName[0]'.");

		// Part 5
		// Instantiate int array nameLengths with same length as "names" array.
		System.out.println("\nPart 5:");
		int[] nameLengths = new int[names.length];

		// For loop adds the length of each String in "names" to "nameLengths" in the
		// same element position as the Strings position in "names"
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}

		System.out.println("\nPart 6");
		// Instantiate int "sumLengths".
		int sumLengths = 0;

		// Enhanced for loop to add each element in "nameLengths" to the total
		// "sumLengths".
		for (int length : nameLengths) {
			sumLengths += length;
		}

		// Print sum of the elements in "nameLengths" to the console.
		System.out.println("Total of nameLengths = " + sumLengths);

		System.out.println("\nPart 7:");
		// Arguments "word" and "n" for method "concatenateString".
		String word = "Hello";
		int n = 3;
		// Print result of "concatenateString" to the console.
		System.out.println(concatenateString(word, n));

		System.out.println("\nPart 8:");
		// Define variables for firstName and lastName to be the arguments in method
		// "fullName".
		String firstName = "Clay";
		String lastName = "Rehmel";
		// Pass fullName method and print out the returned String
		System.out.println("Full Name = " + fullName(firstName, lastName));

		System.out.println("\nPart 9:");
		// Call method "greaterThankOneHundred" with an int array as an argument.
		System.out.println(greaterThanOneHundred(ages));

		System.out.println("\nPart 10:");
		// Instantiate and fill a double array called "doubles".
		double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };
		// Print the average of the elements in "doubles" to the console.
		System.out.println(averageOfDoubles(doubles));

		System.out.println("\nPart 11:");
		// Instantiate and fill another double array called "doublesAgain".
		double[] doublesAgain = { 1.2, 3.4, 5.6, 7.8, 9.0 };
		// Passes doubles and doublesAgain to "averageIsGreater" method.
		// Prints true if the first double array is greater than the second. False
		// otherwise.
		System.out.println(averageIsGreater(doubles, doublesAgain));

		System.out.println("\nPart 12:");
		// Define variables boolean "hot" and double "money"
		boolean hot = true;
		double money = 15.00;
		// Pass "hot" and "money" to the method "willBuyDrink" as arguments.
		// Prints boolean response to the console.
		System.out.println(willBuyDrink(hot, money));

		System.out.println("\nPart 13:");
		// Create scanner to take in user input.
		Scanner s = new Scanner(System.in);
		// Instantiate array of ints with 5 elements.
		int[] exams = new int[5];
		// Ask user to input final exam score and store in int "finalScore".
		System.out.println("What was your final score?");
		int finalScore = s.nextInt();
		// Ask user to input 5 other exam scores and store each as elements in the array
		// "exams"
		System.out.println("What were your other exam scores? Enter 5.");
		exams[0] = s.nextInt();
		exams[1] = s.nextInt();
		exams[2] = s.nextInt();
		exams[3] = s.nextInt();
		exams[4] = s.nextInt();
		// Pass "exams" array and "finalScore" as arguments for the "whatIsMyFinalGrade"
		// method.
		whatIsMyFinalGrade(exams, finalScore);

	}

	/*
	 * Method 7: Define method "concatenateString" takes String and int argument.
	 * Will return a String.
	 */
	public static String concatenateString(String word, int n) {
		// "result" String to store concatenated String to be returned.
		String result = "";
		// For loop iterates the number of times indicated by int argument ("n"). Add
		// String "word" to "result" for each iteration.
		for (int i = 0; i < n; i++) {
			result += word;
		}
		// Return "result" to where the method is called.
		return result;
	}

	/*
	 * Method 8: Define method "fullName" that takes 2 String, first string is the
	 * first name and second string is the last name. Concatenates "first" and
	 * "last" with a space between in the String "full". Returns "full".
	 */
	public static String fullName(String first, String last) {
		String full = first + " " + last;
		return full;
	}

	/*
	 * Method 9: Define "greaterThanOneHundred" method. Accepts int array as an
	 * argument. Defines int sum, enhanced for loop adds each element in "nums" into
	 * "sum." If statement checks to see if sum is greater than 100. If true,
	 * returns true. Otherwise, returns false.
	 */
	public static boolean greaterThanOneHundred(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Method 10: Define "averageOfDoubles" that accepts an argument of an array of
	 * doubles. Define double "sum" to collect the sum of all the elements in the
	 * double array, "nums", using an enhanced for loop. Returns the average of all
	 * the elements in "nums".
	 */
	public static double averageOfDoubles(double[] nums) {
		double sum = 0;

		for (double num : nums) {
			sum += num;
		}

		return sum / nums.length;
	}

	/*
	 * Method 11: Define "averageIsGreater" that accepts 2 double arrays as
	 * arguments. Define sum variables for each array and uses enhanced for loops
	 * for both arrays to total all the elements in each. If statement compares the
	 * averages of both arrays. If the average of "doubleOne" is greater than the
	 * average of doubleTwo, returns true. Otherwise, it returns false.
	 */
	public static boolean averageIsGreater(double[] doubleOne, double[] doubleTwo) {
		double firstSum = 0;
		double secondSum = 0;

		for (double num : doubleOne) {
			firstSum += num;
		}
		for (double num : doubleTwo) {
			secondSum += num;
		}
		if ((firstSum / doubleOne.length) > (secondSum / doubleTwo.length)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Method 12: Define "willBuyDrink" that takes boolean "isHotOutside" and double
	 * "moneyInPocket" as arguments. If statement checks if "isHotOutside" is true
	 * and "moneyInPocket" is greater than 10.50. If both are true then returns
	 * true. Otherwise, returns false.
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Method 13: "whatIsMyFinalGrade" takes an array of ints "testScores" and a
	 * single int "finalExam" to find the average of all the exams together. The
	 * method prints the user's final average and a message indicating if the user
	 * passed or not.
	 */
	public static void whatIsMyFinalGrade(int[] testScores, int finalExam) {
		int sum = finalExam;
		for (int score : testScores) {
			sum += score;
		}
		int avg = sum / (testScores.length + 1);
		System.out.println("Final Grade: " + avg + "%");
		if (avg > 60) {
			System.out.println("You passed!");
		} else {
			System.out.println("You failed...");
		}

	}
}
