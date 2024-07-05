package programming;

public class ShapeArray {

	public static void main(String[] args) {
		Sphere.constructor();
		Cylinder.constructor();
		Cone.constructor();
		
		ShapeArray[] shapeArray = new ShapeArray[3];
	    for(int i=0; i<3; i++) {
	        shapeArray[i] = new ShapeArray();
	        System.out.println(shapeArray[i]);
	        
	    }
	}
	
}
