package programming;

import java.util.Comparator;

public class RoleComparator {

	public static int compare(Object o1, Object o2) {
		StudentArrayList s1 = (StudentArrayList)o1;
		StudentArrayList s2 = (StudentArrayList)o2;
		return s1.rollno - s2.rollno;
		
		
		}
			
}



