package programs.leetcode;

public class Car {

	private String color;
	private int maxSpeed;

	public static void main(String[] args) {

		
		
		Maserati maserati = new Maserati();
		maserati.setColor("RED");
		maserati.setMaxSpeed(333);
		maserati.carInfo();
		maserati.maseratiStartDemo();
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void carInfo() {
		System.out.println("Car color: "+ color+"\nCar maxSpeed: "+maxSpeed);
	}
	

}

//This is "Is-A" relationship
class Maserati extends Car{
	
	public void maseratiStartDemo() {
		
		//This is "Has-A" relationship or also called Decomposition
		Engine maseratiEngine = new Engine();
	
		maseratiEngine.start();
		maseratiEngine.stop();
	}
}
