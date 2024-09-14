package programming;

import java.util.Arrays;

public class BagProgram {
	public static void main(String[] args) {
		//Create two Bags
		Bag<String> nameBag = new Bag<String>();
		Bag<String> otherBag = new Bag<String>();
		
		//Adds elements to nameBag
		nameBag.add("John");
		nameBag.add("Lucy");
		nameBag.add("Bill");
		nameBag.add("John");
		nameBag.add("John");

		
		//Adds elements to otherBag
		otherBag.add("Bill");
		otherBag.add("Jeremy");
		otherBag.add("Nick");
		otherBag.add("Henry");
		otherBag.add("John");

		
		//Print the size of each bag
		System.out.print("Size of nameBag: ");
		System.out.print(nameBag.size());
		System.out.println();
		System.out.print("Size of otherBag: ");
		System.out.println(otherBag.size());
		
		//Merge the two bags
		nameBag.merge(otherBag);
		System.out.print("Contents of merged bag: ");
		System.out.print(bagContents(nameBag));
		
		//Distinct bag creation
		System.out.println();
		System.out.print("Contents of distinct bag: ");
		System.out.print(bagContents(nameBag.distinct()));
		

	}
	//Prints the contents of the bag.
	public static String bagContents(Bag<String> bag) {
		for(int j=0; j < 6; j++) {
			if(bag.getName(j) == null) {
				continue;
			}
			else {
				System.out.print(bag.getName(j));
			System.out.print(" ");
			}
		}
		return "";
		
		
	}
}
