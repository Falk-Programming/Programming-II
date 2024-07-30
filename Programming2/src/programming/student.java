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
    public String getAddress() {
    	return address;
    }
    public double getGPA() {	
        return GPA;
    }

    @Override
    public String toString() {
    	String info;
    	info = name + " " + address + " " + GPA;
    	return info;

}}

