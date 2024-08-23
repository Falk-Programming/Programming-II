package programming;

import java.util.Arrays;

public class newtest {

	   public static void main(String[] args) {
		   String[] NameArray = new String[4];
		   NameArray[1] = "John";
		   NameArray[2] = "Lucy";
		   NameArray[3] = "Mark";
		   NameArray[4] = "Ash";
		   
		   
		   // New array to fit an extra person.
		   String[] LongerNameArray;
		   LongerNameArray = Arrays.copyOf(NameArray, 5);
		   
		   NameArray = null;
		   
		   
}}
