package programming;

import java.util.ArrayList;

public class StudentList {
	public static ArrayList<Object> main(String[] args) {
		ArrayList<Object> studentList = new ArrayList<Object>();
		StudentArrayList s1 = new StudentArrayList(14, "John", "1111 Grove");
		StudentArrayList s2 = new StudentArrayList(12, "Daniel", "200 West");
		StudentArrayList s3 = new StudentArrayList(23, "Grace", "1286 Canyon");
		StudentArrayList s4 = new StudentArrayList(1, "Annabelle", "721 Road");
		StudentArrayList s5 = new StudentArrayList(4, "James", "962 Free");
		StudentArrayList s6 = new StudentArrayList(5, "Terry", "246 Base");
		StudentArrayList s7 = new StudentArrayList(18, "Bill", "832 Free");
		StudentArrayList s8 = new StudentArrayList(11, "Bailey", "744 Alphabet");
		StudentArrayList s9 = new StudentArrayList(9, "Jessie", "834 Free");
		StudentArrayList s10 = new StudentArrayList(30, "Jacob", "273 Base");
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
		return studentList;
}
}
