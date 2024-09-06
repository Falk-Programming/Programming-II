package programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class PostFixNotationCalculator {

	public static void main(String args[]) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Input 1 to calculate a file, Input 2 to calculate through console.");
		Integer userAnswer = scnr.nextInt();
		if(userAnswer == 1) {
			fileToPostFix();
		}
		else if(userAnswer == 2){
			System.out.println("Please insert your postfix notation to be calculated.");
			String userInput = scnr.next();
			calculatePostFix(userInput);
		}
		else {
			System.out.println("Please try again. Only input 1 or 2.");
		}

	}
		
	public static void calculatePostFix(String input) {
		Stack<Integer> stackOne = new Stack<Integer>();
		int i = 0;
		for(i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			int first = 0;
			int second = 0;
			int result = 0;
			try {
			if(Character.isAlphabetic(current)) {
				System.out.print("Alphabetic values are not allowed. Please try again.");
				main(null);
				
			}
			else if(Character.isDigit(current)) {
				stackOne.push(Character.getNumericValue(current));
			}
			else if(current == '/') {
				first = stackOne.pop();
				second = stackOne.pop();
				result = second / first;
				stackOne.push(result);
				
			}
			else if(current == '%') {
				first = stackOne.pop();
				second = stackOne.pop();
				result = second / first;
				stackOne.push(result);
				
			}
			else if(current == '*') {
				first = stackOne.pop();
				second = stackOne.pop();
				result = second * first;
				stackOne.push(result);
				
			}
			else if(current == '+') {
				first = stackOne.pop();
				second = stackOne.pop();
				result = second + first;
				stackOne.push(result);

			}
			else if(current == '-') {
				first = stackOne.pop();
				second = stackOne.pop();
				result = second - first;
				stackOne.push(result);
			}
			} catch (Exception e) {
				System.out.println("Invalid postfix expression");
			}
		}
			
	
		System.out.print(stackOne);
	}
	
	public static void fileToPostFix() {
		File myFile = new File("postFix.txt");
		
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader("postFix.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.print("The file does not exist. Please insert manually or try again.");
		}
		
		
	}
}
