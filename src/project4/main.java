package project4;

//This is Main class. It has 3 objests of child classes.

public class main {
	public static void main(String[] args) {
		// Object of Child class of Rectangle
		rectangular rec = new rectangular();
		// Object of Child class of Triangle
		traingle tri = new traingle();
		// Object of Child class of Circle
         circle cir = new circle();

      // Calculated area of all the Shapes given.
         
		float op1 = rec.printArea(5, 10);
		float op2 = tri.printArea(20, 4);
		int op3 = (int) cir.printArea(3.14f, 7.0f);
         
		// To display area of all the Shapes given.
		
		System.out.println("The Are of Rectangle is : " + op1 + " meter square");
		System.out.println("The Are of Triangle is : " + op2 + " meter square");
		System.out.println("The Are of Circle is : " + op3 + " meter square");
	}


}
