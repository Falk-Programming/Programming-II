package programming;

import java.util.Comparator;

public class StudentComparator implements Comparator<Object>{

	public int compare(Object o1, Object o2) {
		StudentArrayList s1 = (StudentArrayList)o1;
		StudentArrayList s2 = (StudentArrayList)o2;
		System.out.print(s2.name);
		System.out.print(s1.name);
		return s1.name.compareTo(s2.name);
	}
}