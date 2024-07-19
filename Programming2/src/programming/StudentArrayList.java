package programming;


public class StudentArrayList{
	int rollno;
	String name;
	String address;
	StudentArrayList(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public String getName() {
        return name;
    }

    public int getRoll() {	
        return rollno;
    }
    public String getAddress() {
    	return address;
    }
    @Override
    public String toString() {
      return name;
}
    public int toRoll() {
    	return rollno;
    }
}
