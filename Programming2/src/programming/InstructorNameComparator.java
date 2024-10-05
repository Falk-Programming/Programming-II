package programming;

public class InstructorNameComparator {
	public int compare(Instructor o1, Instructor o2) {
		return o1.getLastName().compareTo(o2.getLastName());
}
}
