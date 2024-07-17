package programming;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSelectionSort {
	static int rollno;
	String address;
	String name;
	public static void main(String[] args) {
		ArrayList<Object> studentList = StudentList.main(args);
		sorting(studentList);
	}
	public Object StudentArrayList(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		return StudentArrayList(rollno, name, address);
	}
	public static void sorting(ArrayList<Object> studentList) {
		int i = 0;
		int j = 1;
		Object temp;
		int smallest;
		
		StudentComparator studentComparator = new StudentComparator();

		for (i = 0; i < 9; ++i) {
			   smallest = i;
			   for (j = i + 1; j < 9; ++j) {

			      if (studentComparator.compare(studentList.get(i), studentList.get(j)) == 0) {
			         smallest = j;
			      }
			   }
			   temp = studentList.get(smallest);
			   studentList.set(j,  i);
			   studentList.set(i, temp);
			   
			   
		}
		studentComparator.compare(studentList.get(i), studentList.get(j));
					
	}
}
