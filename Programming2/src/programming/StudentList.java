package programming;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<StudentArrayList> studentList = new ArrayList<StudentArrayList>();
		StudentArrayList s1 = new StudentArrayList(14, "John ", "1111 Grove");
		StudentArrayList s2 = new StudentArrayList(12, "Daniel ", "200 West");
		StudentArrayList s3 = new StudentArrayList(23, "Grace ", "1286 Canyon");
		StudentArrayList s4 = new StudentArrayList(1, "Annabelle ", "721 Road");
		StudentArrayList s5 = new StudentArrayList(4, "James ", "962 Free");
		StudentArrayList s6 = new StudentArrayList(5, "Terry ", "246 Base");
		StudentArrayList s7 = new StudentArrayList(18, "Bill ", "832 Free");
		StudentArrayList s8 = new StudentArrayList(11, "Bailey ", "744 Alphabet");
		StudentArrayList s9 = new StudentArrayList(9, "Jessie ", "834 Free");
		StudentArrayList s10 = new StudentArrayList(29, "Jacob ", "273 Base");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		int i;
		for (i = 0; i < 10; ++i) {
			StudentArrayList currentRoll;
			currentRoll = studentList.get(i);
			System.out.print(currentRoll.toRoll() + " ");}
		System.out.println();
		sortingRoll(studentList);
		sortingName(studentList);
}
    public Comparator<StudentArrayList>sortByRoll;
    public Comparator<StudentArrayList>sortByName;
    
	public static void sortingRoll(ArrayList<StudentArrayList> studentList) {
		int i = 0;
		int j;
		int smallest;
		int temp1;
		StudentArrayList temp2;
		for (i = 0; i < 11; ++i) {
			
			smallest = i;
			for (j = i + 1; j < 10; ++j) {
				RoleComparator newCompare = new RoleComparator();
				temp1 = newCompare.compare(studentList.get(i), studentList.get(j));
				if (temp1 == 0) {
					// do nothing
				}
				if (temp1 > 0) {
					// do nothing
				}
				if (temp1 < 0) { 
					temp2 = studentList.get(i);
					studentList.set(i, studentList.get(j));
					studentList.set(j, temp2);
				}		

			}
		}
		int h;
		for (h = 0; h < 10; ++h) {
			StudentArrayList currentRoll;
			currentRoll = studentList.get(h);
			System.out.print(currentRoll.toRoll() + " ");}
		System.out.println();
		
		for (i = 0; i < 10; ++i) {
			System.out.print(studentList.get(i));}
	}
		
		public static void sortingName(ArrayList<StudentArrayList> studentList) {
			int i = 0;
			int j;
			int smallest;
			int temp1;
			StudentArrayList temp2;
			for (i = 0; i < 11; ++i) {
				
				smallest = i;
				for (j = i + 1; j < 10; ++j) {
					StudentComparator newNameCompare = new StudentComparator();
					temp1 = newNameCompare.compare(studentList.get(i), studentList.get(j));
					if (temp1 == 0) {
						// do nothing
					}
					if (temp1 > 0) {
						// do nothing
					}
					if (temp1 < 0) { 
						temp2 = studentList.get(i);
						studentList.set(i, studentList.get(j));
						studentList.set(j, temp2);
					}		

				}
			}
			System.out.println();
			for (i = 0; i < 10; ++i) {
				StudentArrayList currentName;
				currentName = studentList.get(i);
				System.out.print(currentName.toString());}
}

}
