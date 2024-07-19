package programming;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentArrayList>{

	@Override
	public int compare(StudentArrayList o1, StudentArrayList o2) {
	    return o1.getName().compareTo(o2.getName());
	}
	
}
	
