package programming;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentLinkedList {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please input the name, address, and GPA of each student when prompted.");
		LinkedList<student> listStudents = new LinkedList<student>();
		System.out.println("How many students are there?");
		int j = scnr.nextInt();
		int i;
		for (i = 0; i < j; ++i) {
			System.out.print("Please enter the full student information in order separating each part with a comma.");
			String studentInfo = scnr.next();
			ArrayList tempArrayList = new ArrayList();
			tempArrayList.add(studentInfo.split(studentInfo, ','));
			System.out.print(tempArrayList);
			
		}
		try {
			int b;
			for (b = 0; b < j; ++b) {
				FileWriter writer = new FileWriter("studentList.txt");
				String currentIndex;
				currentIndex = String.valueOf(listStudents.get(b));
				writer.write(currentIndex);
		}} 
		catch (IOException e) {
			e.printStackTrace(System.out.printf("File not found."));
		}
		
	
		}
	}


