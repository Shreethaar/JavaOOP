
public class Car {
	private String make;
	private String model;
	private String color;
	private double currentSpeed;
	private double maxSpeed;

	public Car(String make, String model, String color, double currentSpeed, double maxSpeed) {
		setMake(make);
		setColor(color);
		setModel(model);
		setCurrentSpeed(currentSpeed);
		setMaxSpeed(maxSpeed);
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public String getColor() {
		return this.color;
	}

	public double getCurrentSpeed() {
		return this.currentSpeed;
	}

	public double getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMake(String make) {
		this.make=make;
	}

	public void setColor(String color) {
		this.color=color;
	}

	public void setModel(String model) {
		this.model=model;
	}

	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed=currentSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed=maxSpeed;
	}

	public void accelerate(double amount) {
		if(amount<=maxSpeed) {
			this.currentSpeed=amount;
		}
		else {
			System.out.printf("Samir...You're breaking the car\n");
		}
	}

	public void brake(double amount) {
		if(amount>=0) {
			this.currentSpeed-=amount;
		}
		else {
			System.out.printf("What are you doing, going in reverse?\n");
		}
	}

	public String toString() {
		return String.format("Car Make: %s, Car Model: %s, Car Color: %s, Car Current Speed: %.2f, Car Max Speed: %.2f\n",make,model,color,currentSpeed,maxSpeed);
	}
	



}









