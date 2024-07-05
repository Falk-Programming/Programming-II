package programming;

import java.util.Scanner;

public class Cone extends Shape{
	static double Radius;
	static double height;
		
		
		
		public static void constructor() {
			Radius = 3.6;
			height = 1.8;

			ToString();

		}
		public static void ToString() {
			double surface_area;
			double volume;
			
			surface_area = Math.PI * Radius * (Radius + Math.sqrt((height * height) + (Radius * Radius)));
			System.out.println("Cone Surface Area: " + surface_area);
			volume = Math.PI * (Radius * Radius) * height/3;	
			System.out.println("Cone Volume: " + volume);
		
		
		}
}
