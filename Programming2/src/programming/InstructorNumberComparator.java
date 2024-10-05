package programming;

public class InstructorNumberComparator {
	public int compare(Instructor o1, Instructor o2) {
		return Integer.compare(o1.getClassCount(), o2.getClassCount());
}
}