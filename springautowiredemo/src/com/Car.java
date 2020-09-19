package com;
public class Car {

	public Car(String carName, String carBrand) {
		super();
		this.carName = carName;
		this.carBrand = carBrand;
	}
	public Car() {
		System.out.println("car class default const called");
	}

	private String carName;
	private String carBrand;
	private Engine engine;

	 public Engine getEngine() {
	 return engine;
	 }
	 public void setEngine(Engine engine) {
	 this.engine = engine;
	 System.out.println("car class engine setter called");
	 }
	public String getCarName() {
		return carName;
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("car class parameterized const called");
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public void show() {
		System.out.println("car name:" + carName);
		System.out.println("car brand:" + carBrand);
		System.out.println("Engine Model No:" + engine.getModelNo());
	}
}
