package practicePrrogram;

public class Bike {
	int noOfGears = 4;
	String color = "Black";
	public Bike() {
		color= "red";
	}
	public Bike(String color)
	{ this.color= color;
		
	}	public void IncreaseAccelaration(int speed) {
	System.out.println("accelation is incresed by" + speed);
}
	public String getColor() {
	return color;
}
	public void setcolor( String color) {
		this.color=color;
		
	}
	} 


