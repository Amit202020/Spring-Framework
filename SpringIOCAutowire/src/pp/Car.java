package pp;

import org.springframework.beans.factory.annotation.Autowired;

class Car {

	private String carName;
	
	@Autowired
	Engine engine;

	public String getCarName() {
		return carName;
	}

	public Car() {
		super();
		System.out.println("default constructor called");
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", engine=" + engine + "]";
	}

	
	
}