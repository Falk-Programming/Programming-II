package programming;

import java.util.Scanner;

public class Module5CriticalThinkingP2Option1 {
	static Scanner scnr = new Scanner(System.in);
	
	  public static void productOfFiveNumbers(int current, int i) {
		  
		  if(i >= 5) {
			  System.out.println("The final product is " + current);
		  }
		  else {
			  System.out.println("Please input one of your numbers:");
			  current = scnr.nextInt() + current;
			  i = i + 1;
			  productOfFiveNumbers(current, i);
		  }
	  }
	  public static void main(String[] args) {
		  System.out.println("You will input 5 numbers to be added using recursion.");
		  productOfFiveNumbers(0, 0);
	  }
}
