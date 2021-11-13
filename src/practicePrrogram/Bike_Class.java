package practicePrrogram;

public class Bike_Class {

	public static void main(String[] args) {

// ClassName variableName = new Constructor;
		Bike bike = new Bike();
		
	bike.setcolor("WHITE");
	System.out.println(	bike.color);
	System.out.println(bike.getColor());
	
Bike bike1 = new Bike();
System.out.println(bike.color);
bike1.setcolor("WHITE");

	System.out.println(bike1.color);
	System.out.println(bike.getColor());

	
	}

}
