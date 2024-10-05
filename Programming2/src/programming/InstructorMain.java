package programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InstructorMain {

	public static void main(String[] args) {
		Queue<Instructor> instructorQueue = new LinkedList<Instructor>();

		
		String name = null;
		String lastname = null;
		int classCount = 0;
		
		System.out.println("Please input five teachers. Starting with the last name, and finally the number of classes.");
		
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		while(i < 5) {
			i++;
			System.out.println("Name:");
			name = scnr.next();
			System.out.println("Last Name:");
			lastname = scnr.next();
			System.out.println("classCount");
			classCount = scnr.nextInt();
		
			Instructor first = new Instructor(name, lastname, classCount);
			instructorQueue.add(first);
		}
		System.out.println("Here is the unsorted Queue:");
		System.out.println(instructorQueue);
		System.out.println("Here is the Queue sorted by Last Name:");
		System.out.println(compareLast(instructorQueue));
		System.out.println(instructorQueue);
		System.out.println("Here is the Queue sorted by Class Count:");
		System.out.println(compareClass(instructorQueue));
		System.out.println(instructorQueue);
		
	}
	public static Queue<Instructor> compareLast(Queue<Instructor> instructorQueue) {
		ArrayList arrayList = new ArrayList<Instructor>();
		int i = 0;
		for(i = 0; i <= 4; i++){
			arrayList.add(instructorQueue.remove());
			
		}
		i = 0;
		int j;
		int smallest;
		int temp1;
		Instructor temp2;
		for (i = 0; i <= 4; ++i) {
			
			smallest = i;
			for (j = i + 1; j < 5; ++j) {
				InstructorNameComparator newCompare = new InstructorNameComparator();
				Instructor first = (Instructor) arrayList.get(i);
				Instructor second = (Instructor) arrayList.get(j);
				temp1 = newCompare.compare(first, second);
				if (temp1 == 0) {
					// do nothing'
					
				}
				if (temp1 > 0) {
					// do nothing
					
				}
				if (temp1 < 0) { 
					temp2 = (Instructor) arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp2);
				}
			}}
		instructorQueue.add((Instructor) arrayList.get(0));
		instructorQueue.add((Instructor) arrayList.get(1));
		instructorQueue.add((Instructor) arrayList.get(2));
		instructorQueue.add((Instructor) arrayList.get(3));
		instructorQueue.add((Instructor) arrayList.get(4));
		return instructorQueue;
		}

	
	
	private static int InstructorComparator(Instructor o1, Instructor o2) {
		return o1.getName().compareTo(o2.getName());
		
		
	}
	private static int InstructorComparatorNumber(Instructor o1, Instructor o2) {
		if(o1.getClassCount() > o2.getClassCount()){
			return 1;
		}
		else return 0;
		
	}
	public static Queue<Instructor> compareClass(Queue<Instructor> instructorQueue) {
		ArrayList arrayList = new ArrayList<Instructor>();
		int i = 0;
		for(i = 0; i <= 4; i++){
			arrayList.add(instructorQueue.remove());
			
		}
		i = 0;
		int j;
		int smallest;
		int temp1;
		Instructor temp2;
		for (i = 0; i <= 4; ++i) {
			
			smallest = i;
			for (j = i + 1; j < 5; ++j) {
				InstructorNumberComparator newCompare = new InstructorNumberComparator();
				Instructor first = (Instructor) arrayList.get(i);
				Instructor second = (Instructor) arrayList.get(j);
				temp1 = newCompare.compare(first, second);
				if (temp1 == 0) {
					// do nothing'
					
				}
				if (temp1 > 0) {
					// do nothing
					
				}
				if (temp1 < 0) { 
					temp2 = (Instructor) arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp2);
				}
			}}
		instructorQueue.add((Instructor) arrayList.get(0));
		instructorQueue.add((Instructor) arrayList.get(1));
		instructorQueue.add((Instructor) arrayList.get(2));
		instructorQueue.add((Instructor) arrayList.get(3));
		instructorQueue.add((Instructor) arrayList.get(4));
		return instructorQueue;
		}
		
		
}

