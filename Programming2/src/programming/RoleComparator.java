package programming;

import java.util.ArrayList;
import java.util.Comparator;

public class RoleComparator implements Comparator<StudentArrayList>{

		@Override
		public int compare(StudentArrayList o1, StudentArrayList o2) {
			return Integer.compare(o1.getRoll(), o2.getRoll());
	}
	
}






