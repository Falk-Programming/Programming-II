package programming;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
			System.out.println();
			System.out.print("What is the Name?");
			String studentName = scnr.next();
			System.out.print("What is the Address? Use - instead of spaces.");
			String studentAddress = scnr.next();
			System.out.print("What is the GPA?");
			String studentGPA = scnr.next();
			
			Double currGPA = Double.parseDouble(studentGPA);
			listStudents.add(new student(studentName, studentAddress, currGPA));



			
		}
		sortingName(listStudents, j);
		}
		
	public static void sortingName(LinkedList<student> listStudents, int j) {
			int s = 0;
			int v;
			int smallest;
			int temp1;
			student temp2;
			for (s = 0; s < j; ++s) {
				
				smallest = s;
				for (v = s + 1; v < j; ++v) {
					LinkedListComparator newNameCompare = new LinkedListComparator();
					temp1 = newNameCompare.compare(listStudents.get(s), listStudents.get(v));
					if (temp1 == 0) {
						// do nothing
					}
					if (temp1 > 0) {
						// do nothing
					}
					if (temp1 < 0) { 
						temp2 = listStudents.get(s);
						listStudents.set(s, listStudents.get(v));
						listStudents.set(s, temp2);
					}	
				}
			}
			System.out.println(listStudents);
			writeToFile(listStudents);
	}
		public static void writeToFile(LinkedList<student> listStudents) {
			
		try {
			FileOutputStream fileByteStream = null;
			PrintWriter writer = null;
			fileByteStream = new FileOutputStream("studentlist.txt");
			String stringList;
			writer = new PrintWriter(fileByteStream);
			
			stringList = String.valueOf(listStudents);
			writer.write(stringList);
			writer.flush();
			writer.close();
			System.out.println("List written to file.");
		} 
		catch (IOException e) {
			e.printStackTrace(System.out.printf("File not found."));
		}
		
	
		}
	}


