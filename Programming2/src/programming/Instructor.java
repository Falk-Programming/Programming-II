package programming;

public class Instructor {
	String name;
	String lastName;
	int classCount;
	Instructor(String name, String lastName, int classCount) {
		this.name = name;
		this.lastName = lastName;
		this.classCount = classCount;
}
	public String getName() {
        return name;
	}
	public String getLastName() {
        return lastName;
	}
	public int getClassCount() {
        return classCount;
	}
	public String toString() {
    	String info;
    	info = name + " " + lastName + " " + classCount;
    	return info;
	
	
	}
}
