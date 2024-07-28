package programming;

public class student {
	
	String name;
	String address;
	double GPA;
	student(String name, String address, double GPA) {
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	public String getName() {
        return name;
    }

    public double getGPA() {	
        return GPA;
    }
    public String getAddress() {
    	return address;
    }

}
