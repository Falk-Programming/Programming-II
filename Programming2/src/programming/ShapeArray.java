package programming;

public class ShapeArray {

	public static void main(String[] args) {
		Sphere sphere1 = new Sphere();
		sphere1.constructor();
		Cylinder cylinder1 = new Cylinder();
		cylinder1.constructor();
		Cone cone1 = new Cone();
		cone1.constructor();
		
		
		ShapeArray[] shapeArray = new ShapeArray[3];
	    for(int i=0; i<3; i++) {
	        shapeArray[i] = new ShapeArray();
	        System.out.println(shapeArray[i]);
	        
	    }
	}
	
}
