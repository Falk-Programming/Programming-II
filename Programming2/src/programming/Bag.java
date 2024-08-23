package programming;

public class Bag<String> {
	
	String[] bagItems;
	int i = 0;
	//Creates the bag.
	public Bag() {
		this.bagItems = (String[]) new Object[10];
		
	}
	//Adds a new name to the bag.
	public void add(String item) {
		this.bagItems[i] = item;
		i++;
	}
	//Removes a name from the bag.
	public void remove(String item) {
		for(int j=0; j < i; j++) {
			if(bagItems[j] == item) {
				bagItems[j] = null;
			}
		}
	}
	//Checks if a name appears within the bag.
	public boolean contains(String item) {
		int b = 0;
		for(int j=0; j < i; j++) {
			if(bagItems[j] == item) {
				b++;
			}
		}
		if(b > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//Counts how many times a name appears in the bag.
	public int count(String item) {
		int currCount = 0;
		for(int j=0; j < i; j++) {
			if(bagItems[j] == item) {
				currCount++;
			}
		}
		return currCount;
	}
	//Gets a specific name.
	public String getName(int index) {
		String value = this.bagItems[index];
		return value;
	}
	public int size() {
		int s = 0;
		for(int j=0; j < i; j++) {
			if(bagItems[j] != null) {
				s++;
			}
		}
		return s;
		
	}
	public void merge(Bag<String> otherBag) {
		int j;
		int v = 4;
		for(j=0; j < 5; j++){
			v++;
			String currValue = otherBag.getName(j);
			bagItems[v] = currValue;
		}
	}
	public Bag<String> distinct() {
		String first = null;String second = null;String third = null;String fourth = null;String fifth = null; String sixth = null;String seventh = null; String eighth = null; String ninth = null;
		Bag<String> distinctBag = new Bag<String>();
		int currentIteration = 0;
		for(int j=0; j < 10; j++) {
			if(bagItems[j] == first) {
				continue;}
			if(bagItems[j] == second) {
				continue;}
			if(bagItems[j] == third) {
				continue;}
			if(bagItems[j] == fourth) {
				continue;}
			if(bagItems[j] == fifth) {
				continue;}
			if(bagItems[j] == sixth) {
				continue;}
			if(bagItems[j] == seventh) {
				continue;}
			if(bagItems[j] == eighth) {
				continue;}
			if(bagItems[j] == ninth) {
				continue;}
			else {
				currentIteration++;
				if(currentIteration == 1) {
					first = bagItems[j];
					distinctBag.add(first);}
				if(currentIteration == 2) {
					second = bagItems[j];
					distinctBag.add(second);}
				if(currentIteration == 3) {
					third = bagItems[j];
					distinctBag.add(third);}
				if(currentIteration == 4) {
					fourth = bagItems[j];
					distinctBag.add(fourth);}
				if(currentIteration == 5) {
					fifth = bagItems[j];
					distinctBag.add(fifth);}
				if(currentIteration == 6) {
					sixth = bagItems[j];
					distinctBag.add(sixth);}
				if(currentIteration == 7) {
					seventh = bagItems[j];
					distinctBag.add(seventh);}
				if(currentIteration == 8) {
					eighth = bagItems[j];
					distinctBag.add(eighth);}
				if(currentIteration == 9) {
					ninth = bagItems[j];
					distinctBag.add(ninth);}

			}

		}
		return distinctBag;
		
		
	}
}
